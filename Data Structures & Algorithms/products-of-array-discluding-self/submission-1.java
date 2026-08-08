class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] out =new int[nums.length];
        int suffix=1;
        out[0]=1;
        for (int i = 1; i < nums.length; i++) {
            out[i]=nums[i-1]*out[i-1];
        }
        for (int i = 1; i < nums.length; i++) {
            suffix*=nums[nums.length-i];
            out[nums.length-i-1]*=suffix;
        }

        return out;
    }
}  
 