package DSA.Array;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Array Size");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the rotate times");

        int k= sc.nextInt();
        k = k%n;

        System.out.println("Enter the number");
        for (int i =0; i<arr.length;i++){

            arr[i] = sc.nextInt();
        }

        System.out.println("The input numbers are");
        for (int i =0; i<arr.length;i++) {


            System.out.print(arr[i] + " ");
        }
        int sp = 0;
        int ep = arr.length-1;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        System.out.println();
        System.out.println("after rotate Element Are ");

        for (int i =0; i<arr.length;i++) {


            System.out.print(arr[i] + " ");
        }

    }
    public static  void reverse(int [] arr,int sp ,int ep){

        while(sp<ep) {
            int temp ;
            temp=arr[sp];
            arr[sp]= arr[ep];
            arr[ep]=temp;
            sp++;
            ep--;
        }


    }



}


