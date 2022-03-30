import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int r= scn.nextInt(), c=scn.nextInt();
        int arr[][] = new int[r][c];
        input(arr, scn);
        findExitPoint(arr);
    }

    public static void input(int arr[][], Scanner scn){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static void findExitPoint(int arr[][]){
        int dir = 0, r=0, c=0;
        while(r>=0 && r<arr.length && c>=0 && c<arr[0].length){
            dir = (dir+arr[r][c])%4;
            if(dir == 0){
                c++;
            }
            else if(dir == 1){
                r++;
            }else if(dir == 2){
                c--;
            }else{
                r--;
            }
            
        }
        if(dir == 0){
                c--;
            }
            else if(dir == 1){
                r--;
            }else if(dir == 2){
                c++;
            }else{
                r++;
            }
        System.out.println(r);
        System.out.println(c);
    }

}