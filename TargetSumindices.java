
/*Two Sum Problem with Sorted Input Array

Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, 
find two numbers such that they add up to a specific target number. Let these two numbers be 
numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
Return the indices of the two numbers, index1 and index2, added by one as an integer array 
[index1, index2] of length 2.
The tests are generated such that there is exactly one solution. You may not use the same element 
twice.
Your solution must use only constant extra space.

Example 1:

Input: N=4 numbers = [2,7,11,15], target = 9
Output: [1,2]

Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].  

Example 2:

Input: N=3 numbers = [2,3,4], target = 6
Output: [1,3]

Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].

Example 3:

Input: N=2 numbers = [-1,0], target = -1
Output: [1,2]

Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2]
 */
import java.util.*;

public class TargetSumindices {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        // int t = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        System.out.print(Arrays.toString(solve(n, arr, t)));
    }

    public static int[] solve(int n, int arr[], int t) {
        int s = 0;
        int e = n - 1;
        while (s < e) {
            int sum = arr[s] + arr[e];
            if (sum == t) {
                return new int[] { s + 1, e + 1 };
            } else if (sum < t) {
                s++;
            } else {
                e--;
            }
        }
        return new int[0];
    }
}