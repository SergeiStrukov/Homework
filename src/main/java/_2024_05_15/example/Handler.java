package _2024_05_15.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Handler {
    //    3. Написать класс Handler для хранения команд, результатов как хотите и каких хотите DS лишь бы всех данных
    // int counter
    // int winCounter
//    Set<Team<Teenager>> teenagerTeam = Generator.generate25TeamsTeenagers();
//    Set<Team<Adult>> teenagerTeam2 = Generator.generate25TeamAdults();
//    Set<Team<Pupil>> teenagerTeam3 = Generator.generate25TeamsPupil();
    private Map<Team<? extends Participant>, Integer> tournamentMap = new HashMap<>();
    private Map<Team<? extends Participant>, Integer> tournamentWinGameMap = new HashMap<>();

}
