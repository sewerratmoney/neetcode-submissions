class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return 0;
        int count = 0;
        int max = 0;
        Set<Character> seat = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (!seat.contains(cur)) {
                count++;
                seat.add(cur);
            } else {
                count = seat.size();
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
