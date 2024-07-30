import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        greetUser(scanner);
        repeatName(scanner);
        guessAge(scanner);
        countToNumber(scanner);
        testProgrammingKnowledge(scanner);
        tellStory(scanner);
        switchStatementExample(scanner);

        scanner.close();
    }


    private static void greetUser(Scanner scanner) {
        System.out.println("Hello! I am your friendly chatbot.");
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println("Nice to meet you, " + name + "!");
    }


    private static void repeatName(Scanner scanner) {
        System.out.println("Can you please repeat your name?");
        String name = scanner.nextLine();
        System.out.println("Thank you, " + name + "!");
    }

    private static void guessAge(Scanner scanner) {
        System.out.println("Let's play a game. I will try to guess your age.");
        System.out.println("Tell me the remainder of your age when divided by 3.");
        int remainder3 = scanner.nextInt();
        System.out.println("Now tell me the remainder of your age when divided by 5.");
        int remainder5 = scanner.nextInt();
        System.out.println("Lastly, tell me the remainder of your age when divided by 7.");
        int remainder7 = scanner.nextInt();

        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + age + "!");
    }


    private static void countToNumber(Scanner scanner) {
        System.out.println("Tell me a number, and I will count up to it.");
        int number = scanner.nextInt();
        for (int i = 0; i <= number; i++) {
            System.out.println(i);
        }
    }


    private static void testProgrammingKnowledge(Scanner scanner) {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Which of the following is not a programming language?");
        System.out.println("1. Java");
        System.out.println("2. Python");
        System.out.println("3. HTML");
        System.out.println("4. C++");

        int answer;
        do {
            answer = scanner.nextInt();
            if (answer != 3) {
                System.out.println("Please, try again.");
            }
        } while (answer != 3);

        System.out.println("Congratulations! That's correct.");
    }


    private static void tellStory(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Let's create a story. What is your favorite hobby?");
        String hobby = scanner.nextLine();
        System.out.println("Once upon a time, there was a person who loved " + hobby + ".");
        System.out.println("Every day, they would spend hours enjoying " + hobby + " and became very skilled at it.");
        System.out.println("Their love for " + hobby + " brought them much happiness and many friends.");
        System.out.println("The end.");
    }


    private static void switchStatementExample(Scanner scanner) {
        System.out.println("Enter a number from 1 to 7 to hear what I think about each day of the week:");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("I'm a little buggy on Mondays.");
                break;
            case 2:
                System.out.println("Tuesdays are great for debugging.");
                break;
            case 3:
                System.out.println("Wednesdays are midweek, perfect for a coffee break.");
                break;
            case 4:
                System.out.println("Thursdays are for refactoring code.");
                break;
            case 5:
                System.out.println("Fridays are fantastic for finishing projects.");
                break;
            case 6:
                System.out.println("Saturdays are splendid for learning new things.");
                break;
            case 7:
                System.out.println("Sundays are super for relaxing and recharging.");
                break;
            default:
                System.out.println("Invalid input. Please enter a number from 1 to 7.");
                break;
        }
    }
}
