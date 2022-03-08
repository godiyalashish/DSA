import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     Scanner snc = new Scanner(System.in);
     int n = snc.nextInt();
     while(n>0){
       System.out.println(n%10);
       n = n/10;
     }
    }
   }