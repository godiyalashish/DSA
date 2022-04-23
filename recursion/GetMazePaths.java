import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        System.out.println(getMazePaths(0,0,n-1, m-1));
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
        ArrayList<String> mylist = new ArrayList<String>();
        if(sc <= dc ){
            ArrayList<String> horpath = getMazePaths(sr, sc+1, dr, dc);
                for(String str: horpath){
                mylist.add('h'+str);
            }
        }

        if(sr <= dr ){
        ArrayList<String> vertpath = getMazePaths(sr+1, sc, dr, dc);
            for(String str: vertpath){
                mylist.add('v'+str);
            }
        }

        
        

        return mylist;
    }

}