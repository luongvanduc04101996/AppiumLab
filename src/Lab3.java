import java.util.Random;
import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your length of list numbers: ");
        int lengthList = scan.nextInt();
        int[] listNumberA = RandomList(lengthList);
        int[] listNumberB = RandomList(lengthList);
        System.out.println("----- The first list numbers -------");
        ShowList(listNumberA);
        System.out.println("\n----- Count numbers -------");
        CountOddOrEvenNumber(listNumberA);
        System.out.println("\n----- Min max numbers -------");
        FindMaxAndMinNumber(listNumberA);
        System.out.println("\n----- Sorted list number 1 -------");
        int [] listNumberASorted = SortMinToMax(listNumberA);
        System.out.println("\n----- Sorted list number 2 -------");
        int [] listNumberBSorted = SortMinToMax(listNumberB);
        System.out.println("\n----- Merge two sorted list above -------");
        MergeTwoSorted(listNumberASorted, listNumberBSorted);
    }

    public static int[] RandomList(int lengthList) {
        int[] listNumber = new int[lengthList];
        Random random = new Random();
        for (int index = 0; index < lengthList; index++) {
            listNumber[index] = random.nextInt(10);
        }
        return listNumber;
    }

    public static void ShowList(int[] listNumber) {
        for (int number : listNumber) {
            System.out.print(" " + number);
        }
    }

    public static void CountOddOrEvenNumber(int[] listNumber) {
        int countOdd = 0;
        int countEven = 0;
        for (int number : listNumber) {
            if (number % 2 == 0) {
                countEven++;
                continue;
            }
            countOdd++;
        }
        System.out.printf("Even numbers: %d\nOdd numbers: %d", countEven, countOdd);
    }

    public static void FindMaxAndMinNumber(int[] listNumber) {
        int max = listNumber[0];
        int min = listNumber[0];
        for (int number : listNumber) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.printf("Max number: %d\nMin number: %d", max, min);
    }

    public static int[] SortMinToMax(int[] listNumber) {
        for (int index = 0; index < listNumber.length - 1; index++) {
            int min = listNumber[index];
            for (int tempIndex = index + 1; tempIndex < listNumber.length; tempIndex++) {
                if (listNumber[tempIndex] < min) {
                    min = listNumber[tempIndex];
                    listNumber[tempIndex] = listNumber[index];
                    listNumber[index] = min;
                }
            }
        }
        ShowList(listNumber);
        return listNumber;
    }

    public static void MergeTwoSorted(int[] listNumberA, int[] listNumberB) {
        int lengthTwoList = listNumberA.length + listNumberB.length;
        int[] listNumberOutput = new int[lengthTwoList];
        int countIndex = 0;
        int countIndexA = 0;
        int countIndexB = 0;
        while (countIndex < lengthTwoList) {
            if (listNumberA[countIndexA] < listNumberB[countIndexB]) {
                listNumberOutput[countIndex] = listNumberA[countIndexA];
                countIndexA++;
            } else {
                listNumberOutput[countIndex] = listNumberB[countIndexB];
                countIndexB++;
            }
            countIndex++;
            if (countIndexA == listNumberA.length) {
                for (int indexB = countIndexB; indexB < listNumberB.length; indexB++) {
                    listNumberOutput[countIndex] = listNumberB[indexB];
                    countIndex++;
                }
                break;
            }
            if (countIndexB == listNumberB.length) {
                for (int indexA = countIndexA; indexA < listNumberA.length; indexA++) {
                    listNumberOutput[countIndex] = listNumberA[indexA];
                    countIndex++;
                }
                break;
            }
        }
        ShowList(listNumberOutput);
    }
}
