package ex13;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTest1 {
    public static void main(String[] args) {
        // HashSet
        HashSet<String> set1 = new HashSet<>();

        set1.add("Milk");
        set1.add("Bread");
        set1.add("Butter");
        set1.add("Cheese");
        set1.add("Ham");
        set1.add("Ham");

        System.out.println(set1);

        if (set1.contains("Ham")) {
            System.out.println("Ham도 포함되어 있음");
        }

        // LinkedHashSet - 입력 순서대로 출력
        LinkedHashSet<String> set2 = new LinkedHashSet<>();

        set2.add("Milk");
        set2.add("Bread");
        set2.add("Butter");
        set2.add("Cheese");
        set2.add("Ham");
        set2.add("Ham");

        System.out.println(set2);

        if (set2.contains("Ham")) {
            System.out.println("Ham도 포함되어 있음");
        }

        // TreeSet - 알파벳 순대대로 출력
        TreeSet<String> set3 = new TreeSet<>();

        set3.add("Milk");
        set3.add("Bread");
        set3.add("Butter");
        set3.add("Cheese");
        set3.add("Ham");
        set3.add("Ham");

        System.out.println(set3);

        if (set3.contains("Ham")) {
            System.out.println("Ham도 포함되어 있음");
        }
    }
}
