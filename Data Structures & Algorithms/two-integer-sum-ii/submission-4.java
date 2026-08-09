class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> occ = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int comp =target-numbers[i];
            if(occ.containsKey(comp)){
                return new int[]{occ.get(comp),i+1};
            }
            occ.put(numbers[i],i+1); 
        }
        return new int[]{};
    }
}
