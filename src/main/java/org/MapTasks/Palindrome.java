package org.MapTasks;
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("MadaM"));
    }
    public static boolean isPalindrome(String message) {
        List<Character> list = new LinkedList<>();
        char[] character = message.toCharArray();
        for (int i = 0; i < character.length; i++) {
            list.add(character[i]);
        }
        int previousIndex = 0;
        int lastIndex = list.size()-1;
        boolean isPalindrome = true;
        Iterator<Character> iterator = list.listIterator();
        ListIterator<Character> listIterator = list.listIterator(list.size());
        while (iterator.hasNext() && listIterator.hasPrevious() && previousIndex < lastIndex) {
            if (iterator.next() != listIterator.previous()) {
                isPalindrome = false;
                break;
            }
            previousIndex++;
            lastIndex--;
        }
        return isPalindrome;
    }
}
