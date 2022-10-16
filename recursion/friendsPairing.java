import java.io.*;
import java.util.*;

public class Main {
  static int counter = 1;

  public static void solution(int i, int n, boolean[] used, String asf) {
      if(i == n+1){
          System.out.println((counter++)+"."+asf);
          return;
      }
    if(used[i] == false){
        used[i] = true;
        solution(i+1, n, used, asf+"("+i+") ");
        used[i] = false;
    }else{
        solution(i+1, n , used, asf);
    }
    for(int k=i+1; k<=n; k++){
        if(used[k] == false && used[i] == false){
            used[i] = true;
            used[k] = true;
            solution(i+1,n, used, asf+"("+i+","+k+") ");
            used[i] = false;
            used[k] = false;
        }
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean[] used = new boolean[n + 1];
    solution(1, n, used, "");
  }
}
public class friendsPairing {
    
}
