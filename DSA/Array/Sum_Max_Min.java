package DSA.Array;

import java.util.Scanner;

public class Sum_Max_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Array Size");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter the number");
        for (int i =0; i<arr.length;i++){

            arr[i] = sc.nextInt();
        }


        int sum =0;
        int max = arr[0];
        int min = arr[0];

        System.out.println("The input numbers are ");
        for (int i =0; i<arr.length;i++){



            System.out.print(arr[i]  + " " );
            // max number
            if(arr[i]>max){
                max=arr[i];
            }
            // min Number
            if(arr[i]<min){
                min=arr[i];
            }
            sum =sum+arr[i]; // sum of the number
        }
        System.out.println("");
        System.out.println(" Sum of the number is " + sum);
        System.out.println("  max number is " + max);
        System.out.println("  min  number is " + min);
    }
}
