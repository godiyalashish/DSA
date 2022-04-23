import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        System.out.println(getMazePaths(0,0,n-1,m-1));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        if(sr == dr && sc == dc){
            ArrayList<String> base = new ArrayList<String>();
            base.add("");
            return base;
        }

        if(sr>dr || sc>dc){
            ArrayList<String> base = new ArrayList<String>();
            return base;
        }

        ArrayList<String> myList = new ArrayList<>();

        for(int i=1; i<=dc; i++){
            for(String p: getMazePaths(sr, sc+i,dr, dc)){
                myList.add("h"+i+p);
            }
        }
        
        for(int j=1; j<=dr; j++){
            for(String p: getMazePaths(sr+j, sc,dr, dc)){
                myList.add("v"+j+p);
            }
        }

        int s = findSmallest(dr, dc);
        for(int k=1; k<=s; k++){
            for(String p: getMazePaths(sr+k, sc+k,dr, dc)){
                myList.add("d"+k+p);
            }
        }

        return myList;
    }

    public static int findSmallest(int r, int c){
        int smallest = r;
        if(c<r){
            smallest = c;
        }
        return smallest;
    }

}