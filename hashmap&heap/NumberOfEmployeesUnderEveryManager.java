import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    //write your code here
    HashMap <String, HashSet<String>> hm = new HashMap<>();
    String ceo = "";
    for(int i=0; i<n; i++){
      String emp = scn.next(), mng = scn.next();
      HashSet<String> emplist = hm.get(mng);
      if(emp.equals(mng)){
        ceo = mng;
        continue;
      }
      if(emplist == null){
        emplist = new HashSet<String>();
        emplist.add(emp);
        hm.put(mng, emplist);
      }else{
        emplist.add(emp);
      }
    }

    HashMap<String, Integer> ans = new HashMap<>();
    traverse(ceo, hm, ans);
    for(String mng : ans.keySet()){
      int freq = ans.get(mng);
      System.out.println(mng +" "+freq);
    }
  }

  public static int traverse(String mng, HashMap<String,HashSet<String>> tree, HashMap<String, Integer> ans)
  {
    HashSet<String>emplist = tree.get(mng);

    if(emplist == null){
      ans.put(mng,0);
      return 1;
    }

    int size = 0;
    for(String emp : emplist){
      size += traverse(emp, tree, ans);
    }
    ans.put(mng, size);
    return size+1;
  }

}public class NumberOfEmployeesUnderEveryManager {
    
}
