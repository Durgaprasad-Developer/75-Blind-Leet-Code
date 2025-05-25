// https://leetcode.com/problems/two-sum/description/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> numbers = new HashMap<Integer,Integer>();
        int[] A = new int[2];
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];

            if(numbers.containsKey(complement)){
                A[0] = numbers.get(complement);;
                A[1] = i;
                return A;
            }
            numbers.put(nums[i],i);
        }
        return A;
    }
}