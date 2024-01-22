package DSA.Array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Array Size");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the number");
        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the searching number from given array");
        int num = sc.nextInt();

        int index = linearSearch(arr,n,num);
        System.out.println("The searching number index is  " + index);
    }
    public  static  int linearSearch(int[]arr,int n,int num){
        for (int i = 0; i < n; i++) {
            if(arr[i]==num){
                return  i;
            }

        }

        return -1;

    }


}
