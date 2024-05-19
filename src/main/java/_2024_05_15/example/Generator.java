package _2024_05_15.example;

import com.github.javafaker.Faker;
import java.util.*;
//1. Написать класс генератор который генерит по Set 25 команд каждого типа (75 в сумме)
public class Generator {
    private static final Faker FAKER = new Faker();
    private static final Random RANDOM = new Random();

    public static Set<Team<Pupil>> generate25TeamsPupil() {
        Set<Team<Pupil>> pupils = new HashSet<>();
        for (int i = 0; i < 25; i++) {
            Team<Pupil> pupilsTeam = new Team<>(FAKER.team().name());
            pupilsTeam.setList(generate4ParticipantsPupils());
            pupils.add(pupilsTeam);
        }
        return pupils;
    }

    public static Set<Team<Teenager>> generate25TeamsTeenagers() {
        Set<Team<Teenager>> teenagers = new HashSet<>();
        for (int i = 0; i < 25; i++) {
            Team<Teenager> teenagersTeam = new Team<>(FAKER.team().name());
            teenagersTeam.setList(generate4ParticipantsTeens());
            teenagers.add(teenagersTeam);
        }
        return teenagers;
    }

    public static Set<Team<Adult>> generate25TeamAdults() {
        Set<Team<Adult>> adults = new HashSet<>();
        for (int i = 0; i < 25; i++) {
            Team<Adult> adultsTeam = new Team<>(FAKER.team().name());
            adultsTeam.setList(generate4ParticipantsAdults());
            adults.add(adultsTeam);
        }
        return adults;
    }

    private static List<Pupil> generate4ParticipantsPupils() {
        List<Pupil> pupils = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            pupils.add(new Pupil(FAKER.name().name(), RANDOM.nextInt(6) + 5));
        }
        return pupils;
    }

    private static List<Adult> generate4ParticipantsAdults() {
        List<Adult> adults = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            adults.add(new Adult(FAKER.name().name(), RANDOM.nextInt(100) + 20));
        }
        return adults;
    }

    private static List<Teenager> generate4ParticipantsTeens() {
        List<Teenager> teenagers = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            teenagers.add(new Teenager(FAKER.name().name(), RANDOM.nextInt(21) + 10));
        }
        return teenagers;
    }
}

