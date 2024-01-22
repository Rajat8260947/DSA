package DSA.Array;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Array Size");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter the number");
        for (int i =0; i<arr.length;i++){

            arr[i] = sc.nextInt();
        }
        int slargest = secondLargest(arr,n);
        System.out.println("The Second Largest Element is " + slargest);

    }

     public static int secondLargest(int []arr,int n){
        int largest = arr[0];
        int slargest = -1;
         for (int i = 1; i < n; i++) {
             if(arr[i]>largest){
                 slargest = largest;
                 largest=arr[i];
             }
             else if(arr[i]<largest  && arr[i]>slargest){
                 slargest = arr[i];
             }

         }
         return  slargest;

     }

}
