package stringsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortingStringWithCollections {

    static Scanner sc = new Scanner(System.in);
    static int n = 0;
    static List<String> stringList = new ArrayList<String>();

    public static void init(){
        String temp;
        for (int i = 0; i < n; i++) {
            temp  = sc.nextLine();
            stringList.add(temp);
        }
        Collections.sort(stringList);
    }

    public static void printAll(){
        for (int i = 0; i < n; i++) {
            System.out.println(stringList.get(i));
        }
    }

    public static void main(String[] args) {
        n = sc.nextInt();
        sc.nextLine();
        init();
        printAll();
    }
}
