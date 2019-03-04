package hw200219.intersection;

import java.util.*;

public class IntersectionOfSets {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Initialisation of the first list
        int countOfElementsInFirstList = sc.nextInt();
        sc.nextLine();
        List<String> firstList = new  ArrayList<String>(countOfElementsInFirstList);
        for (int i = 0; i < countOfElementsInFirstList; i++) {
            String s = sc.nextLine();
            firstList.add(s);
        }
        //Initialisation of the second list
        int countOfElementsInSecondList = sc.nextInt();
        List<String> secondList = new ArrayList<String>(countOfElementsInSecondList);
        sc.nextLine();
        for (int i = 0; i < countOfElementsInSecondList; i++) {
            String s = sc.nextLine();
            secondList.add(s);
        }
        //Create intersection of lists
        Set<String> intersectionOfTwoLists = new TreeSet<String>();
        for(String s: firstList){
            if (secondList.contains(s)){
                intersectionOfTwoLists.add(s);
                System.out.println(s);
            }
        }
    }
}
