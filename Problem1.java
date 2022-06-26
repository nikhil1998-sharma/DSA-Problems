/*
* Given an sorted array, print frequency of each element
*
* */

public class Problem1 {
    public static void main(String[] args) {
        int[] a = {1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 10};
        printFrequencyOfEachElement(a);
    }
    private static void printFrequencyOfEachElement(int[] a){
        int i=0,j=0;
        int n = a.length;

        while(i<n){
            if(a[j]!=a[i]){
                System.out.println("Frequency of "+a[j]+" is "+(i-j));
                j=i;
            }else i++;
        }
        System.out.println("Frequency of "+a[j]+" is "+(i-j));
    }
}

/*
*  Time Complexity = theta(n) because exactly n operations will be required
*  Space Complexity = O(1)
* */