package DSA.Array;

import java.util.Scanner;

public class CountMaxExceptItself {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Array Size");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter the number");
        for (int i =0; i<arr.length;i++){

            arr[i] = sc.nextInt();
        }
        int result= MaxNumber(arr);
        System.out.println("The number of element except maximum element are " + result);
    }
    public static int MaxNumber(int[] arr){
        int max = arr[0];
        int count =0;
        for (int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==max){
                count++;
            }

        }
        return arr.length-count;
    }
}
