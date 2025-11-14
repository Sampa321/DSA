package HomePractice.GeeksForGeeks.Arrays.Easy;

/*Given an increasing sorted rotated array arr[] of distinct integers. The array is right-rotated k times.
Find the value of k.Let's suppose we have an array arr[] = [2, 4, 6, 9], if we rotate it by 2 times it will
look like this:
After 1st Rotation : [9, 2, 4, 6]
After 2nd Rotation : [6, 9, 2, 4]*/

import java.util.Scanner;

public class FindNoOfRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the array:");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i]=sc.nextInt();
        }
        int result=findKRotation(arr);
        System.out.println(result);
    }

    public static int findKRotation(int arr[]) {
        if(arr.length==1)
        {
            return 0;
        }
        int c=0;
        int small = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(small>arr[i])
            {
                small=arr[i];
                c=i;
            }
        }
        return c;
    }
}
