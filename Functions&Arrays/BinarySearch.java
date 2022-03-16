import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args){
    // write your code here
    Scanner snc = new Scanner(System.in);
    int n = snc.nextInt();

    int[] arr = new int[n];
    for(int i=0; i<arr.length; i++){
        arr[i] = snc.nextInt();
    }
    }

public static int BinarySearch(int[] arr, int k ){
    int st = 0, ed = arr.length-1, mid=0;

    while(st<=ed){
        int mid = (st+ed)/2
        if(arr[mid]>k){
            st = mid+1;
        }else if(arr[mid]<k){
            ed = mid-1;
        }else{
            return mid;
        }
    }
    return -1;
}
}