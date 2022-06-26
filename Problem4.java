/*
*  Minimum sum subarray
*  Time complexity = theta(n)
*  Space complexity = O(1)
* */


public class Problem4 {
    public static void main(String[] args) {
        int[] a = {4,2,8,9,1};
        int minSum = minimumSumSubArray(a);
        System.out.println(minSum);
    }

    private static int minimumSumSubArray(int[] a) {
       int n = a.length;
//       int i=0,j=0;
       int currSum = 0;
       int minSum = Integer.MAX_VALUE;



       for(int i=0;i<n;i++){
           currSum+=a[i];
           if(currSum<minSum){
               minSum = currSum;
           }
           if(currSum>0){
                      currSum = 0;
           }
       }
    return minSum;
    }
}
