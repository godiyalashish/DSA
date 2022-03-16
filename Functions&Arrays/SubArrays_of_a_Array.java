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

    for(int i=0; i<arr.length; i++){
        for(int j=i; j<arr.length; j++){
            for(int k=i; k<=j; k++){
                System.out.print(arr[k]+"\t");
            }System.out.println();
        }
        
    }

 }

}