class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length-2;
        while(i >=0 && nums[i] >= nums[i+1])i--;
        if(i>=0){
            int j = nums.length-1;
            while(nums[i] >= nums[j])j--;
            swap(nums, i, j);
        }
        reverse(nums, i+1, nums.length -1);
    }
    
    public void reverse(int[] arr, int sindx, int eindx){
        while(eindx > sindx){
            int temp = arr[sindx];
            arr[sindx] = arr[eindx];
            arr[eindx] = temp;
            eindx--;
            sindx++;
        }
    }
    
    public void swap(int []arr, int i1, int i2 ){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}