package _2024_05_15.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.*;

@Getter
@ToString
@Setter
@AllArgsConstructor
public class Team<T extends Participant> {
    private String teamName;
    private List<T> list = new ArrayList<>();
    private double points;
    private double gameCounter;
    private int winCounter;

    public Team(String teamName) {
        this.teamName = teamName;
        this.list = new ArrayList<>();
        this.points = 0;
        this.gameCounter = 0;
        this.winCounter = 0;
    }

    public void addNewParticipant(T newParticipant) {
        list.add(newParticipant);
    }

    public void play(Team<?> team, Handler handler) {
        String winner = null;
        Random random = new Random();
        int i = random.nextInt(3);
        if (i == 0) {
            winner = this.teamName;
            this.points++;
            this.winCounter++;
            handler.addTeamWin(this, this.winCounter);
        }
        if (i == 1) {
            winner = team.teamName;
            team.points++;
            team.winCounter++;
            handler.addTeamWin(team, team.winCounter);
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

    @Override
    public String toString() {
        return "Team: " + teamName +
                ", points=" + points + ";";
    }

    public static <T extends Participant> void playAllGames(Set<Team<T>> teams, Map<Team<? extends Participant>, Double> tournamentMap, Handler handler) {
        List<Team<T>> teamList = new ArrayList<>(teams);
        for (int i = 0; i < teamList.size(); i++) {
            for (int j = i + 1; j < teamList.size(); j++) {
                teamList.get(i).play(teamList.get(j), handler);
                tournamentMap.put(teamList.get(i), teamList.get(i).getPoints());
                tournamentMap.put(teamList.get(j), teamList.get(j).getPoints());
            }
        }
    }
}