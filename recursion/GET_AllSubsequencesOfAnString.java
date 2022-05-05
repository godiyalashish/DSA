import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(gss(str));
    }

    public static ArrayList<String> gss(String str) {

        if(str.length() == 0){
            ArrayList<String> base= new ArrayList<String>();
            base.add("");
            return base;
        }
        
        String res = str.substring(1);
        char ch = str.charAt(0);

        ArrayList<String> rres = gss(res);  

        ArrayList<String> mylist = new ArrayList<String>();

        for(String st: rres){
            mylist.add(st);
        }

        for(String st: rres){
            mylist.add(ch+st);
        }

        return mylist;
        
        }

}