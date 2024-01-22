package DSA.Array;

import java.util.ArrayList;

public class MoveZeroToEnd {
    public static void main(String[] args) {
         int [] arr ={1,0,2,3,2,0,0,4,5,1};

         int [] ans = moveZero(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");



    }
    public static int [] moveZero(int[]arr){

//         int j =-1;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]==0){
//                j=i;
//                break;
//            }
//
//        }
//
//        if(j==-1) return arr;
//
//        for (int i = j+1; i < arr.length ; i++) {
//            if(arr[i]!=0){
//                int temp=arr[i];
//                arr[i]=arr[j];
//                arr[j]=temp;
//                j++;
//
//            }
//
//        }
//     return  arr;

        // or Brute force Approach

        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                temp.add(arr[i]);
            }

        }
        int nz = temp.size();

        for (int i = 0; i <nz ; i++) {
            arr[i] = temp.get(i);

        }

        for (int i = nz; i < arr.length; i++) {
            arr[i]=0;

        }


        return  arr;



    }





}
