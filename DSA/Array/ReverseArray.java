package DSA.Array;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Array Size");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter the number");
        for (int i =0; i<arr.length;i++){

            arr[i] = sc.nextInt();
        }

        System.out.println("The input numbers are");
        for (int i =0; i<arr.length;i++) {


            System.out.print(arr[i] + " ");
        }

        reverse(arr);
        System.out.println();
        System.out.println("after Swapping Reverse Element Are ");

        for (int i =0; i<arr.length;i++) {


            System.out.print(arr[i] + " ");
        }

    }
    public static  void reverse(int [] arr){
        int sp = 0;
        int ep = arr.length-1;
        while(sp<ep) {
            int temp= arr[sp];
            arr[sp] =arr[ep];
            arr[ep]=temp;
            sp++;
            ep--;
        }


    }


}
