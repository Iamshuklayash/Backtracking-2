//78. Subsets Medium.java
//TIME(O(2^n))
//SPACE(O(n))
class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        helper(temp, nums, 0);
        return result;
    }
    public void helper(List<Integer> path,int[] nums,int index){
        if(index == nums.length ){
           result.add(new ArrayList<>(path));
            return;
        }
        path.add(nums[index]);
        helper(path,nums,index + 1);
        path.remove(path.size()-1);
        helper(path,nums,index + 1);
        
        }
}
