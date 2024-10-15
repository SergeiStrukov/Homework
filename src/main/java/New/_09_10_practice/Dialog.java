package New._09_10_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Dialog implements Runnable{
    Queue<String> strings;

    public Dialog(Queue<String> strings) {
        this.strings = strings;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Add Cities");
            String str = scanner.next();
            if ("exit".equals(str)) {
                break;
            }
            synchronized (strings) {
                strings.add(str);
            }
            strings.add(str);
        }
    }
}
