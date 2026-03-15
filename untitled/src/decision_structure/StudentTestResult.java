package decision_structure;

import java.util.Scanner;

public class StudentTestResult {

    public static void main(String[] args) {
        System.out.println("Enter your test score");
        Scanner scanner = new Scanner(System.in);

        double score = scanner.nextDouble();
        scanner.close();

        char grade;
        if (score < 35){
            grade = 'F';
        } else if (score < 50) {
            grade = 'S';
        } else if (score < 60) {
            grade = 'C';

        } else if (score < 70) {
            grade = 'B';

        } else {
            grade = 'A';
        }

        System.out.println("Your grade is " + grade);
    }
}
