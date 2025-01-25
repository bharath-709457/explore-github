//https://leetcode.com/problems/richest-customer-wealth/
public class MaximumWealth_LeetCode {

    public static void main(String[] args) {
    int[][] accounts = {{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum = sum + i;
            }
            if (max < sum) max = sum;
        }
        return max;
    }
}
