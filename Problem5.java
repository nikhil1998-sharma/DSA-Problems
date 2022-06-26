/*
*   Best Time to Buy and Sell Stock II
*
*   https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
*
* */

public class Problem5 {
    public static void main(String[] args) {
        int[] a = {7,1,5,3,6,4};
        int bestTime = bestTimeToBuySellStock(a);
        System.out.println(bestTime);
    }

    private static int bestTimeToBuySellStock(int[] a) {
        int n = a.length;
        if(n<=1) return 0;

        int bestTime = 0;
        int i=1,j=0;


        while(i<n){
            if(a[j]<a[i]){
                bestTime+=a[i]-a[j];
            }
            i++;j++;

        }

        return bestTime;
    }
}
