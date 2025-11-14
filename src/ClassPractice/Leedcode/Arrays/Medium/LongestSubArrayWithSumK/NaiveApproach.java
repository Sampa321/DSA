package ClassPractice.Leedcode.Arrays.Medium.LongestSubArrayWithSumK;

import java.util.Scanner;

public class NaiveApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n=sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the value of k:");
        int k=sc.nextInt();
        int r = longestSubarray(arr,k);
        System.out.println("The result is :"+r);
    }
    public static int longestSubarray(int[] arr, int k) {
        // code here
        int maxc=0;
        int c;
        for(int i=0;i<arr.length;i++)
        {
            int sum=arr[i];
            c=1;
            if(sum==k && maxc<c)
            {
                maxc=c;
            }
            for(int j=i+1;j<arr.length;j++)
            {
                sum+=arr[j];
                c++;
                if(sum==k && c>maxc)
                {
                    maxc=c;

                }
            }
        }
        return maxc;

    }
}
