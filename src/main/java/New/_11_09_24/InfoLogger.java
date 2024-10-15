package New._11_09_24;

import Old._2024_05_15.example.Handler;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;
@Getter
@Setter
public class InfoLogger {
    static Map <String, String> log = new HashMap<>();

    public static void doLog(Employee employee){
        log.put(employee.getFullName(), employee.getRole().toString());
    }
}
