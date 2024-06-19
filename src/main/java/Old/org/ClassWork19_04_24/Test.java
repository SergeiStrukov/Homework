package Old.org.ClassWork19_04_24;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Test {

    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Question question1 = new Question("how many colors have rainbow", "7", List.of("2", "1", "-1"));
        Question question2 = new Question("What is Johs dog name", "Petr", List.of("Ivan", "Ivanishka", "Mishka"));
        Question question3 = new Question("1+1 is ", "2", List.of("3", "4", "-5"));
        Question question4 = new Question("1-1", "0", List.of("1", "2", "-33"));
        Question question5 = new Question("2 + 1", "3", List.of("12", "122", "111"));
        Question question6 = new Question("1+0", "1", List.of("133", "122", "-1178"));
        Question question7 = new Question("0+0", "0", List.of("1", "2", "-2"));
        Question question8 = new Question("when java was born", "1990", List.of("1991", "1992", "-122"));
        Question question9 = new Question("2+4", "6", List.of("1", "2", "-34"));
        Question question10 = new Question ("2 - 3 ", "-1", List.of("12", "123", "-344"));
        List<Question> questions = new ArrayList<>();
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        questions.add(question5);
        questions.add(question6);
        questions.add(question7);
        questions.add(question8);
        questions.add(question9);
        questions.add(question10);
        System.out.println(question10.getOptions());

        System.out.println("skolko voprosov ? ");
        int correctAnswer = 0;
        int falseAnswer = 0;
        int userNumber = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < userNumber; i++) {
            Question q = getRandomQuestion(questions);
            System.out.println(q.getQuestion());
            System.out.println(q.getOptions());
            String userAnswer = scanner.nextLine();
            if (q.isCorrectAnswer(userAnswer)) {
                System.out.println("Correct");
                correctAnswer++;
            } else {
                System.out.println("not correct");
                falseAnswer++;
            }
        }
        System.out.println(correctAnswer);
        System.out.println(falseAnswer);
    }

    public static Question getRandomQuestion(List<Question> questions) {
        int index = random.nextInt(questions.size());
        return questions.get(index);
    }
}

