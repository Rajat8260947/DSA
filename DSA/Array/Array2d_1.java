package DSA.Array;

import java.util.Scanner;

public class Array2d_1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter The row ");
        int m = sc.nextInt();
        System.out.println("Enter The  column");
        int n = sc.nextInt();
        int [][] arr = new int[m][n];
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n; j++) {
                arr[i][j] = sc.nextInt();

            }

        }
        System.out.println("....................");
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }

    }
}
