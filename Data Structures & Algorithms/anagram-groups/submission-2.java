class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,List<String>> answer = new HashMap<>();

        for (String string : strs) {
            char[] chars =string.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            answer.putIfAbsent(key,new ArrayList<>());
            answer.get(key).add(string);
        }
       return new ArrayList<>(answer.values());
    }
}
