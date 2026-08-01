class Solution {
    public boolean hasDuplicate(int[] nums) {
        int flag=0;
        for(int i=0;i<nums.length;i++){
            for(int j=1+i;j<nums.length;j++){
            if(nums[i]==nums[j]){
                flag=1;
                return true;
            }
        }}
            return false;
        }
}