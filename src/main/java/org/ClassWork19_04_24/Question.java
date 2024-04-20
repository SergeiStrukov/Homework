package org.ClassWork19_04_24;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Question {
    private String question;
    private String correctAnswer;
    private List<String> incorrects;

    public boolean isCorrectAnswer(String answer) {
        return correctAnswer.equals(answer);
    }
//    public List<String> getOptions(){
//        List<String>
}
//}

