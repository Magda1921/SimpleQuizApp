import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the question: ");
        Integer number = scanner.nextInt();
        System.out.println("Enter the description of the question: ");
        String description = scanner.nextLine();
        System.out.println("Enter the answers of the question: ");
        String answers = scanner.nextLine();
        System.out.println("Enter the correct answer of the question: ");
        String correctAnswer = scanner.nextLine();

        while (true) {
            System.out.println();
        }
    }
}