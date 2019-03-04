package hw200219.intersection;

import java.util.*;

public class IntersectionOfSets {
    public static void main(String[] args) {
        List<String> firstList = Arrays.asList("A", "B", "C");
        List<String> secondList = Arrays.asList("C", "A", "D", "O");
        Set<String> intersectionOfTwoLists = new HashSet<String>();
        for(String s: firstList){
            if (secondList.contains(s)){
                intersectionOfTwoLists.add(s);
                System.out.println(s); //Out -> (A,C)
            }
        }
    }
}
