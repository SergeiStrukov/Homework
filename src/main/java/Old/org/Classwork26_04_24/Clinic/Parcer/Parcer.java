package Old.org.Classwork26_04_24.Clinic.Parcer;

import Old.org.Classwork26_04_24.Clinic.Patient;

import java.io.IOException;

public class Parcer {

    //    1 Создать класс Patient
    //2 Сделать парсер из строки в Patient
    //3 Сделать картотеку, которая находит пациентов по id или имени и фамилии.


    public static Patient getInformation(String info) throws IOException {
        Patient patient = new Patient();
        String[] array = info.split(" ");
        patient.setId(Integer.parseInt(array[0]));
        patient.setName(array[1]);
        patient.setSurname(array[2]);
        return patient;
    }

    //        if (array == null || array.length != 3) {
//            return null;
//        }
//        int id = Integer.parseInt(array[0]);
//        String name = array[1];
//        String surname = array[2];
//        return new Patient(id, name, surname);
//    }
    private Parcer() {

    }
}
