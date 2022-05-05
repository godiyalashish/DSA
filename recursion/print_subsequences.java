/*in this approach we build answer from root node towards leaf node i.e root node sends answer so
far and substring*/


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        printSS(str, "");
    }

    public static void printSS(String str, String ans) {
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        char ch1 = str.charAt(0);
        printSS(str.substring(1), ans+ch1);
        printSS(str.substring(1), ans);
    }

}
