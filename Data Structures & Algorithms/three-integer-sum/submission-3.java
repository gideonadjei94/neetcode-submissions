/*

 - Sort the nums in the array.
 - Loop through the array (nums)
 - Stop when the first number after sorting > 0. 
    reason: There won't be any triplet that will sum up to 0 if the first number in the array is > than  0 eg. nums = [1,2,3]
 - Continue if the on the second or > 0th (thus 1st el, to prevent duplicate) element and the element is == to the prev.
 - Initial the left and right pointer
 - Loop while the left is < the right to get the other two numbers
 - If the sum is greater than 0, need more lesser numbers reduce the right else do otherwise.
 - If sum == 0 ( foound a set), add to the resulting list, increase left and reduce right.
 - Continue to move the left forward if it is still < right and left == prev left.
 - Return the resulting list

*/



class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1, right = nums.length - 1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum > 0)
                    right--;
                else if(sum < 0)
                    left++;
                else{
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left - 1])
                        left++;
                }
            }

        }

        return res;
    }
}
