import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     int n = scn.nextInt(),row=1, nstars=n, nspaces=0;
     
     while(row<=n){

         for(int i=1; i<=nspaces;i++){
             System.out.print("\t");
         }
         for(int i = 1;i<=nstars;i++){
             if(row>=n/2+1){
                 int col = i+nspaces;
                 if(row!=1 && (row==col || row+col==n+1)){
                     System.out.print("*\t");
                 }else if(row==n){
                     System.out.print("*\t");
                 }else{
                     System.out.print("\t");
                 }  
             }else{
                 System.out.print("*\t");
             }
             
         }

         System.out.println();
         row++;
         if(row <= n/2+1){
            nspaces++;
            nstars-=2;
         }else{
             nstars+=2;
             nspaces--;
         }
         
     }
 }
}