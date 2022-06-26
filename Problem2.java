/*
*  In an array of 0's and 1's find longest length of all consecutive 1's
*  Input: 1,1,1,0,0,1,0,1,1,1,1,0,1
*  Output: 4
* */

public class Problem2 {
    public static void main(String[] args) {
        int[] a = {0,1,1,1,1,1,1,0,1,1,1,1,1,1,1};
        int result = findLongestLength(a);

        System.out.println("Longest length of all consecutive 1's will be "+result);
    }
    private static int findLongestLength(int[] a){
        int n = a.length;
        int maxLength = 0;
        int count = 0;


        for(int i=0;i<n;i++){
            if(a[i]==0)
                count = 0;
            else{
                count++;
                maxLength = Math.max(count,maxLength);
            }
        }
        return maxLength;
    }
}


/*
* Time complexity = theta(n)
* Space complexity = O(1)
* */