class Solution {
    public int lengthOfLongestSubstring(String s) {
        s.trim();
        if (s.isEmpty()) return 1;
        int count = 0;
        int max = 0;
        Set<Character> seat = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (!seat.contains(cur)) {
                count++;
                seat.add(cur);
            } else {
                max = Math.max(max, count);
                count = 1;
                seat = new HashSet<>();
                seat.add(cur);
            }
        }
        return max;
    }
}
