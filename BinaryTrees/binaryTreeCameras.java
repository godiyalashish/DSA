class Solution {
    int count =0;
    public int minCameraCover(TreeNode root) {
        int res = countCameras(root);
        if(res == -1) count++;
        return count;
    }
    
    public int countCameras(TreeNode root){
        if(root == null){
            return 1;//already covered
        }
        
        int rightSideCount = countCameras(root.right);
        int leftSideCount = countCameras(root.left);
        
        if(rightSideCount == -1 || leftSideCount == -1){
            count++;
            return 0;//camera
        }
        
        if(rightSideCount == 1 && leftSideCount == 1){
            return -1;//needs camera
        }
        
        return 1;
    }
}