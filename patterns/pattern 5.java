import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int row=1, nstars=1, nspaces=n/2;

        while(row <= n){
            for(int i=1; i<=nspaces;i++){
                System.out.print("\t");
            }
            for(int j=1; j<=nstars; j++){
                System.out.print("*\t");
            }
            System.out.println();
            if(row<=n/2){
                nspaces = nspaces-1;
                nstars = nstars+2;
            }else{
                nspaces = nspaces+1;
                nstars = nstars- 2;
            }

            row++;
        }


    }
}