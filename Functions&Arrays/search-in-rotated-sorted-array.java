class Solution {
    public int search(int[] nums, int target) {
         int l = 0 , r = nums.length-1;
        while(l<=r){
            int mid= l+(r-l)/2;
            if(nums[mid] == target){return mid;}
            if(nums[l]<=nums[mid]){
                //left part of nums[mid] is sorted
                if(target<nums[mid] && target>=nums[l]){//element is present in left part
                    r = mid-1;
                }else{//if element is not in the left part
                    l = mid+1;
                }
            }else{
                //right part of nums[mid] id sorted 
                if(target>nums[mid] && target<=nums[nums.length-1]){
                    l = mid+1;
                }else{
                    r = mid-1;
                }
            }
        }
        return -1;
    }
}