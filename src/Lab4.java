import java.util.*;

public class Lab4 {
    public static void main(String[] args) {
        System.out.println("-----------------MENU------------------");
        System.out.println("1. Add number into ArrayList\n" + "2. Print numbers\n" + "3. Get maximum number\n" + "4. Get minimum number\n" + "5. Exit");
        System.out.print("Please choose your option: ");
        Scanner scanner = new Scanner(System.in);
        List<Integer> listInt = new ArrayList<>();
        int yourOption;
        do {
            yourOption = scanner.nextInt();
            switch (yourOption) {
                case 1:
                    System.out.println("Please enter your integer number to add to list: ");
                    listInt.add(scanner.nextInt());
                    System.out.println("Successful!!!");
                    System.out.print("Please choose your option: ");
                    break;
                case 2:
                    ShowList(listInt);
                    System.out.print("Please choose your option: ");
                    break;
                case 3:
                    System.out.println("Maximum number in list is: " + Collections.max(listInt));
                    System.out.print("Please choose your option: ");
                    break;
                case 4:
                    System.out.println("Minimum number in list is: " + Collections.min(listInt));
                    System.out.print("Please choose your option: ");
                    break;
                case 5:
                    System.out.print("Please enter the number need find: ");
                    int numberFind = scanner.nextInt();
                    FindNumberToKnowIndex(listInt, numberFind);
                    System.out.print("Please choose your option: ");
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Please enter the correct the type input!!!!");
                    System.out.print("Please choose your option again: ");
                    break;
            }
        } while (yourOption != 6);
    }

    private static void ShowList(List<Integer> listNum) {
        System.out.print("-------> Your List:");
        for (Integer num : listNum) {
            System.out.print(" " + num);
        }
        System.out.print("\n");
    }

    private static void FindNumberToKnowIndex(List<Integer> listNum, int valueNumber) {
        for (int index = 0; index < listNum.size(); index++) {
            if (listNum.get(index) == valueNumber) {
                System.out.printf("Find number: %s ---> Index: %s", valueNumber, index);
                break;
            }
        }
        System.out.println();
    }
}
