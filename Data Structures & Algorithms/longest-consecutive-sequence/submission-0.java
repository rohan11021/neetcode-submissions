class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
        set.add(num);   
        }
        int curSeq =1;
        int maxSeq =0;
        for (int num : nums) {
            if(set.contains(num-1)){
                continue;
            }else{
                while(set.contains(num+1)){
                    curSeq++;
                    num+=1;
                }
                if(maxSeq<curSeq){
                    maxSeq=curSeq;
                }
            } 
            curSeq=1;
        }
        return maxSeq;
    }
}
