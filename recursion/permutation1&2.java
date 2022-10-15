import java.io.*;
import java.util.*;

public class Main {

  public static void permutations(int[] boxes, int ci, int ti){
    if(ci > ti){
        for(int i=0; i<boxes.length; i++){
            System.out.print(boxes[i]);
        }
        System.out.println();
        return;
    }
        for(int i=0; i<boxes.length; i++){
            if(boxes[i] == 0){
                boxes[i] = ci;
                permutations(boxes, ci+1, ti);
                boxes[i] = 0;
            }
        }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int nboxes = Integer.parseInt(br.readLine());
    int ritems = Integer.parseInt(br.readLine());
    permutations(new int[nboxes], 1, ritems);
  }

}


//permutation 2
import java.io.*;
import java.util.*;

public class Main {

  public static void permutations(int currBox, int totalbox, int[] objStatus, int objPlaceSoFar, int totalObj, String asf){
    if(currBox > totalbox){
        if(objPlaceSoFar == totalObj){
            System.out.println(asf);
        }
        return;
    }
    if(objPlaceSoFar < totalObj){
        for(int i=0; i<objStatus.length; i++){
            if(objStatus[i] == 0){
                objStatus[i] = 1;
                permutations(currBox+1, totalbox, objStatus, objPlaceSoFar+1, totalObj, asf+(i+1));
                objStatus[i] = 0;
            }
        }
    }
    permutations(currBox+1, totalbox, objStatus, objPlaceSoFar, totalObj,asf+"0");
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int nboxes = Integer.parseInt(br.readLine());
    int ritems = Integer.parseInt(br.readLine());
    permutations(1, nboxes, new int[ritems], 0, ritems, "");
  }

}
