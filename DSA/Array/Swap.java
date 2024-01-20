package DSA.Array;




import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number");
        int n1 =sc.nextInt();
        System.out.println("Enter The Second Number");
        int n2 =sc.nextInt();
        swap(n1,n2);
        System.out.println(n1); //10 but it is reverse 20 and 10
        System.out.println(n2); //20
    }

    public static void swap(int n1, int n2){
        System.out.println("After Swapping");
        int temp;
        temp =n1;
        n1=n2;
        n2=temp;
        System.out.println("The First Number is " + n1);
        System.out.println("The Second Number is " + n2);

    }




}
