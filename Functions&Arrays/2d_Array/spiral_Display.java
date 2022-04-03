import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int row= scn.nextInt();
        int col = scn.nextInt();

        int [][] arr = new int[row][col];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        int rmin = 0, rmax = arr.length-1, cmin=0, cmax=arr[0].length-1,count=0;

        while(count<row*col){
            for(int r=rmin; r<=rmax && count<row*col; r++){
                System.out.println(arr[r][cmin]);
                count++;
            }

            for(int c=cmin+1; c<=cmax && count<row*col; c++){
                System.out.println(arr[rmax][c]);
                count++;
            }
            for(int r2=rmax-1; r2>=rmin && count<row*col; r2--){
                System.out.println(arr[r2][cmax]);
                count++;
            }
            for (int c2 = cmax-1; c2 >= cmin+1 && count<row*col; c2--) {
                System.out.println(arr[rmin][c2]);
                count++;
            }

            rmin++;
            rmax--;
            cmin++;
            cmax--;
        }
    }

}