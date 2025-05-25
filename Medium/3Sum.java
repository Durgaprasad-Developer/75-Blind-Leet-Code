// https://leetcode.com/problems/3sum/description/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<ArrayList<Integer>> m = new HashSet<>();
        
        int n = nums.length;
        for(int i=0; i<n; i++){
            HashSet<Integer> num = new HashSet<>();
            for(int j=i+1; j<n; j++){
                int third = -(nums[i]+nums[j]);
                if(num.contains(third)){
                    ArrayList<Integer> array = new ArrayList<>();
                    array.add(nums[i]);
                    array.add(nums[j]);
                    array.add(third);
                    Collections.sort(array);
                    m.add(array);
                }
                num.add(nums[j]);
            }
        }
        List<List<Integer>> ans =  new ArrayList<>();
        for(ArrayList<Integer> i : m) {
            List<Integer> temp = i;
            ans.add(temp);
        }
        return ans;
    }
}