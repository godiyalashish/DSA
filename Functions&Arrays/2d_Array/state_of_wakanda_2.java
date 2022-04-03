import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][] arr = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        int r=0, c=0, count=0;

        for(int i=0; i<n; i++){
            int row =r, col =c;
            for(int j=0; j<n-i ;j++){
                System.out.println(arr[row][col]);
                row++;
                col++;
            }
            c++;
        }
    }

}