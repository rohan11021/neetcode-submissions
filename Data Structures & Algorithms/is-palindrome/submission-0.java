class Solution {
    public boolean isPalindrome(String s) {
        
        String str = s.replaceAll("[^0-9a-zA-Z]", "").toLowerCase();
        
        return str.contentEquals(new StringBuilder(str).reverse().toString());
    }
}
