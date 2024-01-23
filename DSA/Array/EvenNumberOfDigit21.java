package DSA.Array;
// given an array nums of integer , return how many of them contain an even number of digit
public class EvenNumberOfDigit21 {
    public static void main(String[] args) {
       int arr [] ={12,345,2,6,7896};
       int ans = findNumber(arr);
        System.out.println(countdigit(0));// count the digit
        System.out.println(ans);

        // number of digit count formula // (int)(Math.log10(num))+1;

    }
    static  int findNumber(int[] arr) {
        int count = 0;
        for(int num: arr){
            if(evenumberOfdigit(num)){
                count++;
            }
        }
        return  count;
    }
    static  Boolean evenumberOfdigit (int num){
       int   numberOfdigit = countdigit(num);
//       if(  numberOfdigit %2 ==0){
//           return  true;
//
//        }
//       return  false;


       return  numberOfdigit %2 ==0;
    }

    static  int countdigit(int num){
        if(num<0){
            num = num*-1;
        }
        if(num==0){
            return 1;
        }
         int count =0;
        while (num>0){
            count++;
            num = num/10;

        }
        return  count;
    }


}
