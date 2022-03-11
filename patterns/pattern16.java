import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
    int n = scn.nextInt();int row=1,nspaces=(2*n-1)-2,count=1, ndigits= (2*n-1)-nspaces,col;
    
    while(row<=n){
        ndigits= (2*n-1)-nspaces;col=1;
        for(int i=1; i<=ndigits/2; i++){
            if(i<=(2*n-1)/2){
                System.out.print(i+"\t");
            }
        }
        for(int i=1; i<=nspaces; i++){
            System.out.print("\t");
        }
        for(int i=ndigits/2+1;i<=ndigits;i++){
                int temp2 = i+nspaces;
                int temp = (2*n-temp2);
                System.out.print(temp+"\t");
        }
        row++;
        
        if(row==n){
           nspaces=0;
        }else{
            nspaces -=2;
        }
        System.out.println();
    }
 }
}