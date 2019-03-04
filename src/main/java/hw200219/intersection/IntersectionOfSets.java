package hw200219.intersection;

import java.util.*;

public class IntersectionOfSets {
    public static void main(String[] args) {


        //Initialisation of the first list
        List<String> firstList = Arrays.asList("A", "B", "C");

        //Initialisation of the second list
        List<String> secondList = Arrays.asList("C", "A", "D", "O");

        //Create intersection of lists
        Set<String> intersectionOfTwoLists = new TreeSet<String>();
        for(String s: firstList){
            if (secondList.contains(s)){
                intersectionOfTwoLists.add(s);
                System.out.println(s); //Out -> (A,C)
            }
        }
    }
}
