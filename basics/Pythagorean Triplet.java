import java.util.Scanner;
  
  public class Main{
  
  public static void main(String[] args) {
     Scanner snc = new Scanner(System.in);
     int a = snc.nextInt();
     int b = snc.nextInt();
     int c = snc.nextInt();

     if(a*a > b*b){
       if(a*a > c*c){
         if(a*a == (b*b)+(c*c)){
           System.out.print("true");
         }else{
           System.out.println("false");
         }
       }else{
         if(c*c == (b*b)+(a*a)){
           System.out.print("true");
         }else{
           System.out.println("false");
         }
       }
     }else{
       if(b*b >c*c){
         if(b*b == (c*c)+(a*a)){
           System.out.print("true");
         }else{
           System.out.println("false");
         }
       }else{
         if(c*c == (b*b)+(a*a)){
           System.out.print("true");
         }else{
           System.out.println("false");
         }
       }
     }
   }
  }