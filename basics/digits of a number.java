import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int num = scn.nextInt(),tnum = num,ndigit=0;
      while(tnum != 0){
        ndigit ++;
        tnum /= 10;
      }
      while(ndigit > 0){
        int temp2 = num/((int)Math.pow(10,ndigit-1));
        num = num%((int)Math.pow(10,ndigit-1));
        System.out.println(temp2);
        ndigit--;
        
      } 
     }
    }