import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n= scn.nextInt();

    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = scn.nextInt();
    }
    int result = span(arr);
    System.out.println(result);
 }

 public static int span(int arr[]){
     int large=0, small=arr[0];

     for(int i=0;i<arr.length;i++){
         if(arr[i]<small){
             small = arr[i];
         }
         if(arr[i] > large){
            large = arr[i];
         }
     }
     return (large-small);
 }

}