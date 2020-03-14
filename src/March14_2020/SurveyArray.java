package March14_2020;
import java.util.Arrays;
import java.util.Scanner;

public class SurveyArray {
    public static void main(String[] args) {
        surveyArray();
    }

    public static void surveyArray() {
        String questions[] = {"You are not stupid", "NObody is like you", "You never share"};
        int[] answers = new int[questions.length];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            answers[i] = scanner.nextInt();
        }
        // System.out.println(Arrays.toString(answers));
        int total = 0;
        for (int score : answers) {
            total += score;
        }
        if (total <= 10) {
            System.out.println("You are not stupid");
        } else if (total > 10 && total <= 30) {
            System.out.println("Nobody is like you ");
        } else {
            System.out.println("You never share");
        }
    }
}

