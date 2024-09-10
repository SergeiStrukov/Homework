package New._19_06_2024;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        UserChecker checkUser = new UserChecker(user);

        try {
            checkUser.enterName();
            checkUser.enterSurname();
            checkUser.enterBirthdayDate();
            checkUser.enterDescription();

            // users information
            System.out.println("Name:" + user.getName());
            System.out.println("Surname:" + user.getSurname());
            System.out.println("Birthday:" + user.getBirthdayDate());
            System.out.println("Description:" + user.getDescription());
        } catch (NameLengthException | SurnameLengthException | InvalidDateFormatException e
        ) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}
