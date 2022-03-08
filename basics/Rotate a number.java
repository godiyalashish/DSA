import java.util.Scanner;
   
   public class Main{
   
   public static void main(String[] args) {
     Scanner snc  = new Scanner(System.in);
     int n = snc.nextInt(),temp1 = n,count=0;
     int t = snc.nextInt();

     while(temp1>0){
       temp1 /= 10;
       count++;
     }
      
      t = t%count;
      if(t<0){
        t=count+t;
      }

      int temp2 = n%(int)Math.pow(10,t);
      n = n/(int)Math.pow(10,t);
      n = (temp2*(int)Math.pow(10,count-t))+n;
      System.out.print(n);


    }
   }