package Old.org.ClassWork19_04_24;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
public class Question {
    private String question;
    private String correctAnswer;
    private List<String> incorrects;

    public Question(String question, String correctAnswer, List<String> incorrects) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.incorrects = incorrects;
    }

    public boolean isCorrectAnswer(String answer) {
        return correctAnswer.equals(answer);
    }

    public List<String> getOptions() {
        List<String> result = new ArrayList<>(incorrects);
        result.add(correctAnswer);
        Collections.shuffle(result);
        return result;
    }

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", correctAnswer='" + correctAnswer + '\'' +
                ", incorrects=" + incorrects +
                '}';
    }
}
//}

