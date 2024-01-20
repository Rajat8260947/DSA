package DSA.Array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SwapArray {
    public static void main(String[] args) {

        int [] arr = {10,20,30,40,50};
        int index1 = 1;
        int index2 =3;

        swap(arr);
        System.out.println("Before swapping");
        System.out.println("fist index element " + arr[1]);
        System.out.println("second index element " + arr[3]);


    }
    public static  void swap(int[] arr){
        System.out.println("After Swapping");
        int temp;
        temp=arr[1] ;
        arr[1] =arr[3];
        arr[3] =temp;
        System.out.println("fist index element " + arr[1]);
        System.out.println("second index element " + arr[3]);

    }


}
