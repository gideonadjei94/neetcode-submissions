class Solution {
    public boolean hasDuplicate(int[] nums) {

     HashSet<Integer> setOfNums = new HashSet<>();

        for(int num : nums){
            if(setOfNums.contains(num))
                return true;
            setOfNums.add(num);
        }

        return false;
    }
}