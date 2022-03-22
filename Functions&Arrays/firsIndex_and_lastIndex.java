import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int arr[] = new int[n];

    for(int i=0; i<n; i++){
        arr[i] = scn.nextInt();
    }
    int target = scn.nextInt();

    int right = n-1, left=0;

    while(left<=right){
        int mid = (left+right)/2;

        if(arr[mid] > target){
            right = mid-1;
        }else if(arr[mid] < target){
            left = mid+1;
        }else{
            findFirstIndex(arr,mid);
            findLastIndex(arr,mid);
            return;
        }
    }
    System.out.println("-1");
    System.out.println("-1");

    }

    public static void findFirstIndex(int[] arr, int idx){
        int num = arr[idx];
        while(arr[idx] == num){
            idx--;
        }
        System.out.println(idx+1);
    }

    public static void findLastIndex(int[] arr, int idx){
        int num = arr[idx];
        while(arr[idx] == num){
            idx++;
        }
        System.out.println(idx-1);
    }
}