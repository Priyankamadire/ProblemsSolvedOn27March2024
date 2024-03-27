
/*A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums, find a peak element, and return its index. 
If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -8. 
In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

You must write an algorithm that runs in O(log n) time.

 

Example 1:
Input: nums = [1,2,3,1]
Output: 2

Explanation: 
3 is a peak element and your function should return the index number 2.
Example 2:

Input: nums = [1,2,1,3,5,6,4]
Output: 5
Explanation: Your function can return either index number 1 where the peak element is 2, 
or index number 5 where the peak element is 6.


If there are two or more peak elements , display the highest peak element index */
import java.util.*;

public class PeakElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(solve(n, arr));
        System.out.print(solvebinser(n, arr));
    }

    public static int solve(int n, int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[i + 1] && arr[i - 1] < arr[i]) {
                return i;
            }
        }
        return 0;
    }

    public static int solvebinser(int n, int arr[]) {
        int s = 0;
        int e = n - 1;
        while (s < e) {
            int m = s + (e - s) / 2;
            if (arr[m] > arr[m + 1]) {
                e = m;
            } else {
                s = m + 1;
            }
        }
        return s;
    }

}