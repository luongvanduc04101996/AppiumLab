import java.util.Scanner;

public class Lab6 {
    private static final int MAX_TIME_INPUT_PASSWORD = 3;

    public static void main(String[] args) {
        String times = "2hrs and 5minutes";
        String url = "https://google.com";
        int count = 0;
        System.out.println(times + " = " + calculateMinutes(times));
        System.out.println("Extract number: " + extractDigit(times));
        showInfoURL(url);
        Scanner scanner = new Scanner(System.in);
        do {
            count++;
            System.out.print("Please enter your password: ");
            String inputPassword = scanner.nextLine();
            boolean isCheck = isCheckPassword(inputPassword);
            if (!isCheck) {
                if (count != 3) {
                    System.out.printf("Incorrect password, you have %d chances left", (3 - count));
                    System.out.print("\nPlease enter your password again: ");
                } else {
                    System.out.print("Wish you luck next time");
                }
            } else {
                System.out.print("Haha Exactly!!!");
                break;
            }
        } while (count < MAX_TIME_INPUT_PASSWORD);
    }

    private static String calculateMinutes(String timesString) {
        int calculateMinutes = 0;
        String[] tempListTime = timesString.trim().split("and");
        for (String time : tempListTime) {
            time = time.trim();
            char tempTimeChar = time.charAt(0);
            int tempTimeInt = Character.getNumericValue(tempTimeChar);
            if (time.contains("hrs")) {
                calculateMinutes = tempTimeInt * 60;
            } else {
                calculateMinutes += tempTimeInt;
            }
        }
        return calculateMinutes + " " + "minutes";
    }

    private static Boolean isCheckPassword(String inputPassword) {
        String correctPassword = "password123";
        return inputPassword.equals(correctPassword);
    }

    private static String extractDigit(String inputString) {
        char[] listChar = inputString.toCharArray();
        String extractDigit = "";
        for (char tempChar : listChar) {
            if (Character.isDigit(tempChar)) {
                extractDigit += tempChar;
            }
        }
        return extractDigit;
    }

    private static void showInfoURL(String inputStringURL) {
        String[] listSplit = inputStringURL.split("://");
        String protocol = listSplit[0].trim();
        String domainName = listSplit[1].trim();
        String endingURL = domainName.substring(domainName.length() - 4);
        System.out.println("Protocol: " + protocol);
        System.out.println("Domain name: " + domainName);
        System.out.println("Ending Url: " + endingURL);
    }
}
