class Solution {
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }else{
            int l=2, r=x/2;
            while(l<=r){
                int mid = l+(r-l)/2;
                long temp = (long)mid*mid;
                if(temp>x){
                    r = mid-1;
                }else if(temp<x){
                    l=mid+1;
                }else{
                    return mid;
                }
            }
            return r;
        }
        
    }
}