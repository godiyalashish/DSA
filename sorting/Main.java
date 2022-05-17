class Solution {
    public int[] sortArray(int[] nums) {
       bubbleSort(nums);
       return nums;
    }
    public static void swap(int nums[],int i,int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    public static void selectionSort(int nums[]){
        int n = nums.length;
        for(int itr = 1 ; itr <= n-1 ; itr++){
            int mIdx = itr-1;
            for(int i = itr ; i < n ; i++){
                if(nums[mIdx] > nums[i]) mIdx = i;
            }
            swap(nums, mIdx, itr-1);
        }
    }

    public static void bubbleSort(int nums[]){
        int n = nums.length;
        for(int itr = 1 ; itr <= n-1 ; itr++){
            for(int i = 0 ; i <= n - 1 - itr ; i++){
                if(nums[i+1] < nums[i]){
                    swap(nums, i, i+1);
                }
            }
        }
    }

    // return true if jth element is greater than ith element
  public static boolean isGreater(int[] arr, int j, int i) {
    if (arr[i] < arr[j]) {
      return true;
    } else {
      return false;
    }
  }

  public static void insertionSort(int[] arr) {
    //write your code here
    int n = arr.length;
    for(int i=1; i<n; i++){
      for(int j=i; j>0; j--){
        if(isGreater(arr, j-1, j)){
          swap(arr,j-1,j);
        }else break;
      }
    }
    
  }
}