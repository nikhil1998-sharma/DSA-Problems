/*
*  Move all 0's to the end of given array
*  Input:  8,0,1,3,0,0,5
*  Output: 8,1,3,5,0,0,0
*  Expected time complexity is O(n) and extra space is O(1).
* */

public class Problem3 {
    public static void main(String[] args) {
       int[] a = {8,0,1,3,0,0,5};
       moveZerosToEnd(a);
       for(int e:a)
           System.out.print(e+" ");
    }

    private static void moveZerosToEnd(int[] a) {
        int n=a.length;
        int i=0,j=0;

        while(i<n){
            if(a[i]==0){
                i++;
            }else if(a[i]>0 && i==j){
                i++;j++;
            }else{
                a[j] = a[i];
                a[i] = 0;
                i++;j++;
            }
        }
    }
}
