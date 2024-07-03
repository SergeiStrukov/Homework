package _28_06_24;

public class Tasks {
    String[] array = {"123", "hfsjkd", "dsjh"};
    int[] res;

    public Tasks() {
        Do doTask = (strings) -> {
            int[] lengths = new int[strings.length];
            for (int i = 0; i < strings.length; i++) {
                lengths[i] = strings[i].length();
            }
            return lengths;
        };
        res = doTask.check(array);
    }

    public static void main(String[] args) {
        Tasks tasks = new Tasks();
        for (int length : tasks.res) {
            System.out.println(length);
        }
    }
}

@FunctionalInterface
interface Do {
    int[] check(String[] strings);
}