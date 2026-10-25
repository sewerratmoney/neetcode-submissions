class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> out = new ArrayList<>();
        Map<List<Integer>, List<String>> m = new HashMap<>();

        for (String word : strs) {
            List<Integer> letters = new ArrayList<>(Collections.nCopies(26, 0));
            for (int i = 0; i < word.length(); i++) {
                int count = letters.get(word.charAt(i) - 'a');
                letters.set(word.charAt(i) - 'a', count + 1);
            }
            if (!m.containsKey(letters)) {
                List<String> anagrams = new ArrayList<>();
                anagrams.add(word);
                m.put(letters, anagrams);
            } else {
                m.get(letters).add(word);
            }
        }
        
        for (Map.Entry<List<Integer>, List<String>> entry : m.entrySet()) {
            out.add(entry.getValue());
        } 

        return out;
    }
}
