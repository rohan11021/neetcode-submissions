class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> num = new HashMap<>();
        for (int number:nums) {
            num.put(number,num.getOrDefault(number,0)+1);
        }
        for(int number:nums){
            if(num.get(number)>1){
                return true;
            }
        }
        return false;
    }
}