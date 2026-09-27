class Solution {
    public int largestElement(int[] nums) {
     int largeElement=nums[0];
     for(int i=1;i<nums.length;i++){
        if(nums[i]>largeElement){
            largeElement=nums[i];
        }
     }
     return largeElement;
    }
}