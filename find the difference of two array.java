import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> a = new HashSet<>(), b = new HashSet<>();
        for (int n : nums1) a.add(n);
        for (int n : nums2) b.add(n);
        List<Integer> first = new ArrayList<>(), second = new ArrayList<>();
        for (int n : a) if (!b.contains(n)) first.add(n);
        for (int n : b) if (!a.contains(n)) second.add(n);
        return Arrays.asList(first, second);
    }
}
