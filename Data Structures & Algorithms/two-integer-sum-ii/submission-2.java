class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> occ = new HashMap<>();
        for (int index = 0; index < numbers.length; index++) {
           occ.put(numbers[index],index); 
        }
        for (int i = 0; i < numbers.length; i++) {
            if(occ.containsKey(target-numbers[i])){
                return new int[]{i+1,occ.get(target-numbers[i])+1};
            }
        }

        return new int[]{};
    }
}
