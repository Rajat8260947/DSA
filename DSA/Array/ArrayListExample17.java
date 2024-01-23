package DSA.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample17 {
    public static void main(String[] args) {
    // syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner sc = new Scanner(System.in);
//        list.add(67);
//        list.add(68);
//        list.add(69);
//        list.add(70);
//        System.out.println(list.contains(67));
//        list.set(0,99);
//        list.remove(3);
//        System.out.println(list);
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());

        }
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i));//pass index here  , list[index] syntax will not work here;

        }



        
    }
}
