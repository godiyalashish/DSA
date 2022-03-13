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

    int digit = scn.nextInt();
    int result = find(arr, digit);
    System.out.println(result);
    
}
    public static int find(int arr[],int d){
        for(int i=0; i<arr.length; i++){
        if(arr[i] == d){
            return i;
        }
    }
        return -1;
    }
    
    
 }

