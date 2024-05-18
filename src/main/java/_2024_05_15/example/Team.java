package _2024_05_15.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Getter
@ToString
@Setter
public class Team<T extends Participant> {
    private String teamName;
    private List<T> list = new ArrayList<>();
    private double points;
    private int gameCounter;
    private int winCounter;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addNewParticipant(T newParticipant) {
        list.add(newParticipant);
    }

    public void play(Team<T> team) {
        String winner = null;
        Random random = new Random();
        int i = random.nextInt(3);
        if (i == 0) {
            winner = this.teamName;
            this.points++;
            this.winCounter++;
        }
        if (i == 1) {
            winner = team.teamName;
            team.points++;
            team.winCounter++;
        }
        if (i == 2) {
            winner = "draw";
            this.points += 0.5;
            team.points += 0.5;
        }
        this.gameCounter++;
        team.gameCounter++;
        System.out.println("WINNER: " + winner);
    }
}