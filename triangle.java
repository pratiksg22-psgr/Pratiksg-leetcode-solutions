class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {

        int n = triangle.size();

        // dp stores the minimum path sum from each position
        // to the bottom.
        int[] dp = new int[n];

        // Start with the last row
        for (int i = 0; i < n; i++) {
            dp[i] = triangle.get(n - 1).get(i);
        }

        // Work from the second-last row to the top
        for (int i = n - 2; i >= 0; i--) {

            for (int j = 0; j <= i; j++) {

                dp[j] = triangle.get(i).get(j)
                       + Math.min(dp[j], dp[j + 1]);
            }
        }

        return dp[0];
    }
}

