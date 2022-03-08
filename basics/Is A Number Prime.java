import java.util.Scanner;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
       int n = scn.nextInt(),count=0;

       for(int j=1; j<=n; j++){

       int num = scn.nextInt();
       for(int i=2; i*i<= num ; i++){
         if(num%i == 0){
           count++;
           break;
         }
       }if(count != 0){
         System.out.println("not prime");
         count =0;
       }else{
         System.out.println("prime");
       }
       }
   }
  }