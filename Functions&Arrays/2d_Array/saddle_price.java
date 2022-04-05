import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for(int i =0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scn.nextInt(); 
            }
        }

        SaddlePrice(arr);
    }

    public static void SaddlePrice(int[][] arr){
        int n= arr.length;
        for(int i=0; i<n; i++){
            int smallest = arr[i][0],indx = 0;
            for(int j=1; j<n; j++){
                if(arr[i][j]<smallest){
                    smallest = arr[i][j];
                    indx = j;
                }
            }
            int largest = smallest;
            for(int j=0; j<n;j++){
                if(largest<arr[j][indx]){
                    largest = arr[j][indx];
                }
            }
            if(largest == smallest){
                System.out.println(smallest);
                return;
            }
        }
        System.out.println("Invalid input");
        return;
    }

}