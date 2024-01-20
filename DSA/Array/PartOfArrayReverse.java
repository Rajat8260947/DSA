package DSA.Array;

public class PartOfArrayReverse {
    public static void main(String[] args) {
        int []arr = {2,3,4,5,6,7,6,8,5,2};
        int start_index=3;
        int end_index=7;
        reverse(arr,start_index,end_index);
        System.out.println("After reverse");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }

    }
    public static  void reverse(int[]arr,int sp,int ep){
        while(sp<ep){
            int temp =arr[sp];
            arr[sp] =arr[ep];
            arr[ep]=temp;
            sp++;
            ep--;
        }

    }

}
