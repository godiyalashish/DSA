import java.util.*;

public class Main{

public static void main(String[] args) {
   Scanner snc = new Scanner(System.in);
   int n = snc.nextInt();
   int digit =0, pos=0,sum=0;
   while(n>0){
       digit = n%10;
       pos = pos+1;
       int val = pos*((int)Math.pow(10,digit-1));
       sum+=val;
       n = n/10;

   }

   System.out.print(sum);

 }
}