package Old.org.Classwork26_04_24.Clinic;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(Path.of("patiens"));
        List<String> readList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            readList.add(scanner.nextLine());
        }
        System.out.println(readList);
        List<Patient> patientList = new ArrayList<>();

    }
}
