package New._19_06_2024;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class UserChecker {
    private User user;
    public Scanner scanner;

    public UserChecker(User user) {
        this.scanner = new Scanner(System.in);
        this.user = user;
    }

    //метод для ввода имени
    public void enterName() throws NameLengthException {
        System.out.print("Введите имя (не более 20 символов): ");
        String name = scanner.nextLine();
        if (name.length() > 20 || name.isEmpty()) {
            throw new NameLengthException("Некорректное имя");
        }
        user.setName(name);
    }

    //метод для ввода фамилии
    public void enterSurname() throws SurnameLengthException {
        System.out.println("Введите фамилию (не более 20 символов): ");
        String surname = scanner.nextLine();
        if (surname.length() > 20 || surname.isEmpty()) {
            throw new SurnameLengthException("Некорректная фамилия");
        }
        user.setSurname(surname);
    }

    //метод для ввода описания
    public void enterDescription() {
        System.out.println("Введите описание (не более 100 символов):");
        String description = scanner.nextLine();
        if (description.length() > 100) {
            throw new DescriptionLengthException("Некорректное описание");
        }
        user.setDescription(description);
    }

    //метод для ввода даты рождения
    public void enterBirthdayDate() throws InvalidDateFormatException {
        System.out.println("Введите дату рождения (формат YYYY-MM-DD):");
        String birthdayDateStr = scanner.nextLine();
        LocalDate birthdayDate;
        try {
            birthdayDate = LocalDate.parse(birthdayDateStr);
        } catch (DateTimeParseException e) {
            throw new InvalidDateFormatException("Дата рождения должна быть в формате YYYY-MM-DD");
        }
        user.setBirthdayDate(birthdayDate);
    }
}

// классы исключений
class NameLengthException extends Exception {
    public NameLengthException(String msg) {
        super(msg);
    }
}

class SurnameLengthException extends Exception {
    public SurnameLengthException(String msg) {

        super(msg);
    }
}

class DescriptionLengthException extends RuntimeException  {
    public DescriptionLengthException(String message) {
        super(message);
    }
}

class InvalidDateFormatException extends Exception {
    public InvalidDateFormatException(String message) {
        super(message);
    }
}

@Setter
@Getter
class User {
    private String name;
    private String surname;
    private LocalDate birthdayDate;
    private String description;
}