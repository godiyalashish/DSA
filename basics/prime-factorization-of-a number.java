import java.util.*;

public class Main{

public static void main(String[] args) {
  Scanner snc = new Scanner(System.in);
  int n = snc.nextInt();
  for(int fact=2; fact*fact<=n; fact++){
    while(n%fact == 0){
      n /= fact;
      System.out.print(fact+" ");
    }
  }
  if(n!= 1){
    System.out.print(n);
  }
 }
}