package DSA.Array;

import java.util.ArrayList;

public class Leader22 {
    public static void main(String[] args) {

        int n = 6;
        int arr[] = {10,22,12,3,0,6};

        ArrayList<Integer> ans = LeaderBruteForce(arr,n);

        for(int i =0; i<ans.size();i++){
            System.out.println(ans.get(i) + " ");
        }

    }

    static  ArrayList <Integer> LeaderBruteForce(int [] arr,int n){

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Boolean Leader = true;
            for (int j = i+1; j <n ; j++) {
                if(arr[j]>arr[i]){
                    Leader=false;
                    break;
                }

            }

            if (Leader == true) {

                 ans.add(arr[i]);
            }

        }

        return  ans;

    }

}
