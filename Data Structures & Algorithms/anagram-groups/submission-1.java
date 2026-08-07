class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,List<String>> answer = new HashMap<>();

        for (String string : strs) {
            char[] chars =string.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            answer.computeIfAbsent(key, ke -> new ArrayList<>()).add(string);
        }
       return new ArrayList<>(answer.values());
    }
}
