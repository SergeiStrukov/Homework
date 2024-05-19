package _2024_05_15.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Handler {
    //    3. Написать класс Handler для хранения команд, результатов как хотите и каких хотите DS лишь бы всех данных
    private int counter;
    private int winCounter;
    private Map<Team<? extends Participant>, Double> tournamentMap = new HashMap<>();
    private Map<Team<? extends Participant>, Integer> tournamentWinGameMap = new HashMap<>();

    // Метод для добавления команды и её результата в турнирную карту
    public void addTeamResult(Team<? extends Participant> team, double points) {
        tournamentMap.put(team, points);
        counter++;
    }

    // Метод для добавления команды и её выигрыша в карту выигрышей
    public void addTeamWin(Team<? extends Participant> team, int wins) {
        tournamentWinGameMap.put(team, wins);
        winCounter++;
    }

    // Метод для вывода результатов
    public void printResults() {
        List<Team<? extends Participant>> teams = new ArrayList<>(tournamentMap.keySet());
        for (Team<? extends Participant> team : teams) {
            int wins = tournamentWinGameMap.getOrDefault(team, 0);
            System.out.println(team + " - Points: " + tournamentMap.get(team) + ",Wins: " + wins);
        }
    }

    // Метод для обновления карты результатов
    public <T extends Participant> void updateTournamentMap(Set<Team<T>> teams) {
        Team.playAllGames(teams, tournamentMap, this);
    }
}
