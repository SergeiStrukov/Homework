package Old._2024_11_06;

import lombok.ToString;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@ToString
public class User {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    //    метод, который принимает имя пользователя и возвращает Optional с найденным пользователем
    public static Optional<User> getUserWithName(String name) {
        List<User> users = Arrays.asList(
                new User("Sergey", 21),
                new User("Ser", 22),
                new User("Mikhail", 23)
        );
        return users.stream().filter(user -> user.name.equals(name))
                .findFirst();
    }

}

class Main {
    public static void main(String[] args) {
        Optional<User> userOptional = User.getUserWithName("Mikhail");
        System.out.println(userOptional);
    }
}