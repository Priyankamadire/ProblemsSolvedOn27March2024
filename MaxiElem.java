
/*You are given an array of integers nums,there is a sliding window of size k which is moving from 
the very left of the array to the very right.
You can only see the k numbers in the window. 
Each time the sliding window moves right by one position.
Return the max sliding window.

Example 1:
Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
Explanation: 
Window position Max
------------------------ -----
[1 3 -1] -3 5 3 6 7 3
1 [3 -1 -3] 5 3 6 7 3
1 3 [-1 -3 5] 3 6 7 5
1 3 -1 [-3 5 3] 6 7 5
1 3 -1 -3 [5 3 6] 7 6
1 3 -1 -3 5 [3 6 7] 7

Example 2:
Input: nums = [1], k = 1
Output=[1]

Example 3:
Input: a[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}, k = 3
Output: 3 3 4 5 5 5 6
Explanation:
Maximum of subarray {1, 2, 3} is 3
Maximum of subarray {2, 3, 1} is 3
Maximum of subarray {3, 1, 4} is 4
Maximum of subarray {1, 4, 5} is 5
Maximum of subarray {4, 5, 2} is 5
Maximum of subarray {5, 2, 3} is 5
Maximum of subarray {2, 3, 6} is 6
 */
import java.util.*;

public class MaxiElem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int k = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.print(solve(n, k, ar));
    }

    public static ArrayList<Integer> solve(int n, int k, int arr[]) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> al = new ArrayList<>();
        int maxi = Integer.MIN_VALUE;
        while (j < n) {
            maxi = Math.max(maxi, arr[j]);
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                al.add(maxi);
                if (arr[i] == maxi) {
                    maxi = Integer.MIN_VALUE;
                    for (int p = i + 1; p <= j; p++) {
                        maxi = Math.max(arr[p], maxi);
                    }
                }
                i++;
                j++;
            }
        }
        return al;
    }
}