import java.util.*;

public class Lab5 {
    public static void main(String[] args) {
        System.out.println("-----------------MENU------------------");
        System.out.println("1. Input student info\n" + "2. Find student by ID\n" + "3. Exit");
        System.out.print("Please choose your option: ");
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> mapStudents = new HashMap<>();
        int yourOption;
        do {
            yourOption = scanner.nextInt();
            switch (yourOption) {
                case 1:
                    System.out.println("Please enter the student ID: ");
                    scanner.nextLine();
                    int temp_ID = Integer.parseInt(scanner.nextLine());
                    System.out.println("Please enter the student name: ");
                    String temp_Name = scanner.nextLine();
                    mapStudents.put(temp_ID, temp_Name);
                    System.out.println("Successful!!!");
                    System.out.print("Please choose your option: ");
                    break;
                case 2:
                    System.out.print("Please enter the student ID to find: ");
                    int student_ID = scanner.nextInt();
                    findInfoInMapByID(mapStudents, student_ID);
                    System.out.println("Successful!!!");
                    System.out.print("Please choose your option: ");
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Please enter the correct the type input!!!!");
                    System.out.print("Please choose your option again: ");
                    break;
            }
        } while (yourOption != 3);
    }

    private static void findInfoInMapByID(Map<Integer, String> inputMap, int inputID) {
        System.out.printf("-----> Student ID: %d -----> Student name: %s", inputID, inputMap.get(inputID));
        System.out.println();
    }
}
