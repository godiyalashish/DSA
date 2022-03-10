import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int row=1, ndigits=1, nspaces=n/2,num=1;

        while(row <= n){
            for(int i=1; i<=nspaces;i++){
                System.out.print("\t");
            }
            int temp = num;
            for(int j=1; j<=ndigits; j++){
                System.out.print(temp+"\t");
                if(j <= ndigits/2){
                    temp =temp+1;
                }else{
                    temp = temp-1;
                }
            }
            System.out.println();
            if(row<=n/2){
                nspaces = nspaces-1;
                ndigits = ndigits+2;
                num=num+1;
            }else{
                nspaces = nspaces+1;
                ndigits = ndigits- 2;
                num = num-1;
            }

            row++;
        }


    }
}