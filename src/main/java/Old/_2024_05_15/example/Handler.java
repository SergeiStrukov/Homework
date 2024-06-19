package Old._2024_05_15.example;

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

    // Метод для определения победителя:
    public void findChampion() {
        double maxPoints = 0;
        List<Team<? extends Participant>> teams = new ArrayList<>(tournamentMap.keySet());
        List<Team<? extends Participant>> bestTeams = new ArrayList<>();
        for (Team<? extends Participant> team : teams) {
            if (team.getPoints() > maxPoints) {
                maxPoints = team.getPoints();
            }
        }
        for (Team<? extends Participant> team : teams) {
            if (team.getPoints() == maxPoints) {
                bestTeams.add(team);
            }
        }
        System.out.println("bestTeams" + bestTeams);
        if (bestTeams.size() > 1) {
            for (int i = 0; i < bestTeams.size(); i++) {
                for (int j = i + 1; j < teams.size(); j++) {
                    teams.get(i).play(bestTeams.get(j), this);
                    tournamentMap.put(bestTeams.get(i), bestTeams.get(i).getPoints());
                    tournamentMap.put(bestTeams.get(j), bestTeams.get(j).getPoints());
                }
            }
            System.out.println("bestTeam" + bestTeams);
        }
    }
}
