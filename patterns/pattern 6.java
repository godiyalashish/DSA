import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int row=1, nstars = (n/2)+1, nspaces=1;

        while(row <= n){
            for(int i=1; i<=nstars; i++){
                System.out.print("*\t");
            }
            for(int i=1; i<=nspaces; i++){
                System.out.print("\t");
            }
            for(int i=1; i<=nstars;i++){
                System.out.print("*\t");
            }

            System.out.println();

            if(row <= n/2){
                nspaces= nspaces+2;
                nstars--;
            }else{
                nspaces=nspaces-2;
                nstars++;
            }

            row++;
        }

    }
}