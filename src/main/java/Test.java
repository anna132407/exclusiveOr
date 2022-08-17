import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set <Integer> set1 = new HashSet<>();
        Set <Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        System.out.println(set1);
        System.out.println(set2);
        Set<Integer> set3 = new HashSet<Integer>(set1);
        set1.removeAll(set2);
        set2.removeAll(set3);
        set1.addAll(set2);
        System.out.println(set1);



    }
}
