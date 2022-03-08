import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      Scanner snc = new Scanner(System.in);
      int n1 = snc.nextInt(),temp1 =n1;
      int n2 = snc.nextInt(),temp2 =n2;
      int rem,gcd = 0,lcm =0;
      while(n1%n2 > 0){
        rem = n1%n2;
        n1 = n2;
        n2 = rem;
        
        }
      gcd = n2;
      lcm = (temp2*temp1)/gcd;
      System.out.println(gcd);
      System.out.println(lcm);
      }
     }