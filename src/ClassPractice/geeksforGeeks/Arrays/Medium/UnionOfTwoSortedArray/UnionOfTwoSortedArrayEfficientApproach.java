package ClassPractice.geeksforGeeks.Arrays.Medium.UnionOfTwoSortedArray;

import java.util.ArrayList;
import java.util.Scanner;

/*
Given two sorted arrays a[] and b[], where each array may contain duplicate elements , the task is to return the elements in the union of the two arrays in sorted order.
Union of two arrays can be defined as the set containing distinct common elements that are present in either of the arrays.

Examples:
Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3, 6, 7]
Output: [1, 2, 3, 4, 5, 6, 7]
Explanation: Distinct elements including both the arrays are: 1 2 3 4 5 6 7.
Input: a[] = [2, 2, 3, 4, 5], b[] = [1, 1, 2, 3, 4]
Output: [1, 2, 3, 4, 5]
Explanation: Distinct elements including both the arrays are: 1 2 3 4 5.
Input: a[] = [1, 1, 1, 1, 1], b[] = [2, 2, 2, 2, 2]
Output: [1, 2]
Explanation: Distinct elements including both the arrays are: 1 2.
 */
public class UnionOfTwoSortedArrayEfficientApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st array size:");
        int n1=sc.nextInt();
        int []arr1=new int[n1];
        System.out.println("Enter the 1st array elements:");
        for(int i=0;i<n1;i++)
        {
            System.out.print("arr1["+i+"]=");
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter the 2nd array size:");
        int n2=sc.nextInt();
        int []arr2=new int[n1];
        System.out.println("Enter the 2nd array elements:");
        for(int i=0;i<n2;i++)
        {
            System.out.print("arr2["+i+"]=");
            arr2[i]=sc.nextInt();
        }
        System.out.println(findUnion(arr1,arr2));
    }
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<a.length && j<b.length)
        {
            if(a[i]<=b[j])
            {
                if(!list.contains(a[i]))
                {
                    list.add(a[i]);
                }
                i++;
            }
            else
            {
                if(!list.contains(b[j]))
                {
                    list.add(b[j]);
                }
                j++;
            }
        }
        while(i<a.length)
        {
            if(!list.contains(a[i]))
            {
                list.add(a[i]);
            }
            i++;
        }
        while(j<b.length)
        {
            if(!list.contains(b[j]))
            {
                list.add(b[j]);
            }
            j++;
        }
        return list;
    }
}
