package New._09_10_practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class App {
    public static void main(String[] args) {
        Queue<String> strings = new LinkedList<>();
        Monitor monitor = new Monitor(strings, new FileCustomerWriter());
        Dialog dialog = new Dialog(strings);

        Thread threadMonitoring = new Thread(monitor);
        Thread threadDialog = new Thread(dialog);

        threadMonitoring.setDaemon(true);
        threadMonitoring.start();

        threadDialog.start();
    }
}
