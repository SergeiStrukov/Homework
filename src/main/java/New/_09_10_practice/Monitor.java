package New._09_10_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Monitor implements Runnable {
    private Queue<String> stringList;
    private FileCustomerWriter fileCustomerWriter;

    public Monitor(Queue<String> stringList, FileCustomerWriter fileCustomerWriter) {
        this.stringList = stringList;
        this.fileCustomerWriter = new FileCustomerWriter();
    }

    @Override
    public void run() {
        int count = 1;
        while (true) {
            sleep();
            if (stringList.size() >= 10) {
                List<String> words = new ArrayList<>();
                synchronized (stringList) {
                    while (!stringList.isEmpty()) {
                        words.add(stringList.poll());
                    }
                }
                fileCustomerWriter.create("File" + count++, words);
            }
        }
    }

    private static void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
