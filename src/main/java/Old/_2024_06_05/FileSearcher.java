package Old._2024_06_05;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class FileSearcher {
//    public static void main(String[] args) {
//
//        List<File> files = new LinkedList<>();
//        long startTime = System.currentTimeMillis();
//
//
//
//        long endTime = System.currentTimeMillis();
//
//        System.out.println("************************************");
//        System.out.println("TIME: " + (endTime - startTime));
//        System.out.println("************************************");
//
//        files.forEach(System.out::println);
//    }

    public static void main(String[] args) {
        File rootFile = new File("D:\\");
        List<File> fileList = new ArrayList<>();
        getFiles(rootFile, fileList);
        for (File file : fileList) {
            System.out.println(file.getAbsolutePath());
        }
    }

    //сделать точно такой же, но не рекурсивно
//    private static void searchFile(File rootFile, List<File> files) {
//        if (rootFile.isDirectory()) {
//            System.out.println("Searching for.... " + rootFile.getAbsolutePath());
//            File[] subFiles = rootFile.listFiles();
//            if (subFiles != null) {
//                for (File subFile : subFiles) {
//                    if (subFile.isDirectory()) {
//                        searchFile(subFile, files);
//                    } else {
//                        for (File file : subFiles) {
//                            if (file.getName().endsWith(".pdf")) {
//                                files.add(subFile);
//                            }
//                        }
//                    }
//                }
//            }
//        }
//    }

    private static void getFiles(File rootFile, List<File> fileList) {
        Stack<File> stack = new Stack<>();
        stack.push(rootFile);
        while (!stack.isEmpty()) {
            File currentFile = stack.pop();
            if (currentFile.isDirectory()) {
                File[] directoryFiles = currentFile.listFiles();
                if (directoryFiles != null) {
                    for (File file : directoryFiles) {
                        if (file.isDirectory()) {
                            stack.push(file);
                        } else if (file.getName().toLowerCase().endsWith(".txt")) {
                            fileList.add(file);
                        }
                    }
                } else {
                    System.err.println("Не удалось получить список файлов для: " + currentFile.getAbsolutePath());
                }
            } else if (currentFile.getName().toLowerCase().endsWith(".txt")) {
                fileList.add(currentFile);
            }
        }
    }
}

//реализовать поиск файлов только при помощи Path Files walkFileTree()
//    private static void searchFilewalkTreeFiles(File rootFile, List<File> files) {
//        Path rootPath = rootFile.toPath();
//
//        Files.walkFileTree(rootFile, )
//    }

