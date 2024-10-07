package New._11_09_24;

import lombok.Getter;

@Getter
public class Info {

    public String getInfo(Employee employee) {
        String info = "";
        if (employee == null) {
            throw new NullPointerException("Employee is null");
        }
        if (employee.getRole() == Role.LEVEL_CEO) {
            info = "CEO";
        } else {
            return "Access denied";
        }

        InfoLogger infoLogger = new InfoLogger();
        infoLogger.doLog(employee);

        return info;
    }

    @Override
    public String toString() {
        return "Info{}";
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setRole(Role.LEVEL_CEO);
        employee.setFullName("Sergei");
        employee.setAge(25);

        Info info = new Info();
        System.out.println(info.getInfo(employee));

        System.out.println(InfoLogger.log);
    }
}
