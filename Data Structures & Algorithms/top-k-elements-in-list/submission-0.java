class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for (int i : nums) {
            freq.put(i, freq.getOrDefault(i,0)+1);
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(freq.entrySet());
        list.sort((a,b)-> b.getValue() - a.getValue());

        int[] ans = new int[k];
        for (int index = 0; index < k; index++) {
            ans[index]=list.get(index).getKey();
        }
        return ans;
    }
}
