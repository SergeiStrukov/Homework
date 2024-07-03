package New.code.client;

import java.util.Scanner;

import New.code.core.mvp.View;
import New.code.seed.Data;
import New.code.Environment;
import New.code.core.mvp.Presenter;
import New.code.ui.ConsoleView;

public class App {
    public static void ButtonClick() {
        Data.seed(Environment.path);

        System.out.print("\033[H\033[J"); // https://ru.stackoverflow.com/questions/1315049/Как-очистить-консоль-в-java-во-время-действия-программы
        View view = new ConsoleView();
        Presenter presenter = new Presenter(view, Environment.path);
        presenter.LoadFromFile();

        try (Scanner in = new Scanner(System.in)) {

            while (true) {
                System.out.println(" 1 - prev  2 - next 3 - remove, 4 add contact");
                String key = in.next();
                System.out.print("\033[H\033[J");
                switch (key) {
                    case "1":
                        presenter.prev();
                        break;
                    case "2":
                        presenter.next();
                        break;
                    case  "3":
                        presenter.remove();
                        break;
                    default:
                        System.out.println("Такой команды нет");
                        break;
                }
            }
        }
    }
}

