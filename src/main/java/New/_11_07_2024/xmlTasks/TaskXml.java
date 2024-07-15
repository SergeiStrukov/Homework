package New._11_07_2024.xmlTasks;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TaskXml {
//    1. Создайте простой XML файл с информацией о книге (название, автор, год издания) и напишите программу для его чтения.
//    public static void main(String[] args) {
//        String fileName = "book.xml";
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
//            String line;
//            while (((line = reader.readLine()) != null)) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//public static void main(String[] args) {
//    String fileName = "book.xml";
//
//    try {
//        File file = new File(fileName);
//
//        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//        Document doc = dBuilder.parse(file);
//
//        doc.getDocumentElement().normalize();
//
//        System.out.println("Корневой элемент: " + doc.getDocumentElement().getNodeName());
//
//        NodeList nList = doc.getElementsByTagName("book");
//
//        for (int temp = 0; temp < nList.getLength(); temp++) {
//            Node nNode = nList.item(temp);
//
//            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
//                Element eElement = (Element) nNode;
//
//                String title = eElement.getElementsByTagName("title").item(0).getTextContent();
//                String author = eElement.getElementsByTagName("author").item(0).getTextContent();
//                String year = eElement.getElementsByTagName("year").item(0).getTextContent();
//
//                System.out.println("Название книги: " + title);
//                System.out.println("Автор: " + author);
//                System.out.println("Год издания: " + year);
//            }
//        }
//    } catch (Exception e) {
//        e.printStackTrace();
//    }
//}
}
