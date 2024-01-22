package DSA.Array;

import java.util.Scanner;

public class IsArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Array Size");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter the number");
        for (int i =0; i<arr.length;i++) {

            arr[i] = sc.nextInt();
        }

            Boolean result = IsSorted(arr,n);
            System.out.println("Is the array Sorted ? : "+ result);
        }



    public static  Boolean IsSorted(int [] arr , int n){
        for (int i = 1; i <n; i++) {
            if(arr[i]<arr[i-1])
                return false;
        }

        return  true;
    }

}
