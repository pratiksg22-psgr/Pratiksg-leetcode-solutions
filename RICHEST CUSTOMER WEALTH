class Solution {
    public int maximumWealth(int[][] accounts) {
        int richest = 0;
        for (int[] row : accounts) {
            int sum = 0;
            for (int money : row) sum += money;
            richest = Math.max(richest, sum);
        }
        return richest;
    }
}
