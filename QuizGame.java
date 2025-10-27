import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        char answer;

        System.out.println("----- Welcome to the Quiz Game -----\n");

        System.out.println("Q1. What is the capital of India?");
        System.out.println("A. Delhi");
        System.out.println("B. Mumbai");
        System.out.println("C. Chennai");
        System.out.println("D. Kolkata");
        System.out.print("Enter your answer: ");
        answer = sc.next().charAt(0);
        if (answer == 'A' || answer == 'a') {
            System.out.println("✅ Correct!\n");
            score++;
        } else {
            System.out.println("❌ Wrong! The correct answer is A.\n");
        }

        System.out.println("Q2. Who invented Java?");
        System.out.println("A. Elon Musk");
        System.out.println("B. James Gosling");
        System.out.println("C. Dennis Ritchie");
        System.out.println("D. Charles Babbage");
        System.out.print("Enter your answer: ");
        answer = sc.next().charAt(0);
        if (answer == 'B' || answer == 'b') {
            System.out.println("✅ Correct!\n");
            score++;
        } else {
            System.out.println("❌ Wrong! The correct answer is B.\n");
        }

        System.out.println("Q3. Which keyword is used to inherit a class in Java?");
        System.out.println("A. super");
        System.out.println("B. extends");
        System.out.println("C. this");
        System.out.println("D. import");
        System.out.print("Enter your answer: ");
        answer = sc.next().charAt(0);
        if (answer == 'B' || answer == 'b') {
            System.out.println("✅ Correct!\n");
            score++;
        } else {
            System.out.println("❌ Wrong! The correct answer is B.\n");
        }

        System.out.println("Q4. Which company developed Java?");
        System.out.println("A. Microsoft");
        System.out.println("B. Google");
        System.out.println("C. Sun Microsystems");
        System.out.println("D. IBM");
        System.out.print("Enter your answer: ");
        answer = sc.next().charAt(0);
        if (answer == 'C' || answer == 'c') {
            System.out.println("✅ Correct!\n");
            score++;
        } else {
            System.out.println("❌ Wrong! The correct answer is C.\n");
        }

        System.out.println("Q5. What is the default value of a boolean variable in Java?");
        System.out.println("A. true");
        System.out.println("B. false");
        System.out.println("C. 0");
        System.out.println("D. null");
        System.out.print("Enter your answer: ");
        answer = sc.next().charAt(0);
        if (answer == 'B' || answer == 'b') {
            System.out.println("✅ Correct!\n");
            score++;
        } else {
            System.out.println("❌ Wrong! The correct answer is B.\n");
        }

        System.out.println("--------------------------------------");
        System.out.println("Your total score: " + score + "/5");

        if (score == 5)
            System.out.println("🏆 Excellent! You got all correct!");
        else if (score >= 3)
            System.out.println("👍 Good job! You did well.");
        else
            System.out.println("😅 Keep practicing! You can do better.");
    }
}
