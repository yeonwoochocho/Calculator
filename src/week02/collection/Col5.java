package week02.collection;

import java.util.HashSet;
import java.util.Set;

public class Col5 {
    public static void main(String[] args) {
        Set<Integer> intSet = new HashSet<>();

        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(1);
        intSet.add(3);

        for (Integer value: intSet){
            System.out.println(value);
        }

        System.out.println(intSet.contains(2));
        System.out.println(intSet.contains(5));


    }
}
