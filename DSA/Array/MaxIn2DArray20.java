package DSA.Array;

public class MaxIn2DArray20 {
    public static void main(String[] args) {
        int[][] arr = {
                {23,4,1},
                {13,3,4,56,23},
                {43,54,34,12}

        };
        int ans = max(arr);
        System.out.println("The max element is "  + ans);
    }

    static int max (int[][]arr){
        int Maxelement = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>Maxelement){
                    Maxelement=arr[i][j];
                }

            }


        }
        return Maxelement;
    }

}
