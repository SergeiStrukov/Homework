package New._09_10_practice;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileCustomerWriter {
    public void create(String fileName, List<String> stringList) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            for (String str : stringList) {
                fileWriter.write(str + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
