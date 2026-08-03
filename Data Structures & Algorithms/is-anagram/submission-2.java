class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character,Integer> answer = new HashMap<>();

        for(char character : s.toCharArray()){
            answer.put(character,answer.getOrDefault(character, 0)+1);
        }
        for(char character : t.toCharArray()){
            answer.put(character,answer.getOrDefault(character, 0)-1);
        }
        for (Integer value : answer.values()) {
            if(value>0 || value<0)
                return false;
        }

        return true;
    }
}
