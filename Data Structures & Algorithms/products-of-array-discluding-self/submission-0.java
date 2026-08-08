class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] out =new int[nums.length];
        int[] pref =new int[nums.length];
        int[] suf =new int[nums.length];
        pref[0]=1;
        suf[nums.length-1]=1;
        for (int i = 1; i < nums.length; i++) {
            
            pref[i]=nums[i-1]*pref[i-1];
            suf[nums.length-i-1] = nums[nums.length-i]*suf[nums.length-i];
            
        }
        for (int i = 0; i < nums.length; i++) {
            out[i]=pref[i]*suf[i];
        }

        return out;
    }
}  
 