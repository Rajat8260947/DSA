package DSA.Array;

public class BinarySearch23 {

    public static void main(String[] args) {
        int []arr = {2,3,5,67,87,112,115};
        int target = 8115;
        int ans = BinarySearch(arr,target);
        System.out.println("The target value index is " + ans);
    }

    public  static  int BinarySearch(int[]arr,int target){

        int si=0;
        int  ei = arr.length-1;


        while(si<=ei){
            int mid = (si+ei)/2;// or mid = s+e-s/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(target>arr[mid]){
                si=mid+1;
            }
            else {
                ei=mid-1;
            }
        }

        return  -1;

    }

}
