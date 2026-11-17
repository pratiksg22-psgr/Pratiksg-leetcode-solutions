class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String sentence : sentences) {
            int words = sentence.trim().split("\\s+").length;
            max = Math.max(max, words);
        }
        return max;
    }
}
