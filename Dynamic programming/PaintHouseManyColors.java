import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int c = scn.nextInt();
        int fmin = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        int arr[][] = new int[n][c];
        for(int i=0; i<n; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        int dp[][] = new int[n][c];
        for(int i=0; i<c; i++){
            dp[0][i] = arr[0][i];
            if(fmin >= dp[0][i]){
                smin = fmin;
                fmin = dp[0][i];
            }else if(smin >= dp[0][i]){
                smin = dp[0][i];
            }
        }
        
        for(int i=1; i<n; i++){
            int nleast = Integer.MAX_VALUE;
            int nsleast = Integer.MAX_VALUE;
            for(int j=0; j<c; j++){
                if(dp[i-1][j] == fmin){
                    dp[i][j] = arr[i][j] + smin;
                }else{
                    dp[i][j] = arr[i][j] + fmin;
                }
                if(dp[i][j] <= nleast){
                    nsleast = nleast;
                    nleast = dp[i][j];
                }else if(dp[i][j] <= nsleast){
                    nsleast = dp[i][j];
                }
            }
            fmin = nleast;
            smin = nsleast;
        }
        
        for(int i=0; i<c; i++){
            if(dp[n-1][i] < min){
                min = dp[n-1][i];
            }
        }
        System.out.print(min);
    }
}