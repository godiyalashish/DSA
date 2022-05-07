import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        printEncodings(str,"");
    }

    public static void printEncodings(String str,String asf) {
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }

        char ch1 = str.charAt(0);
        if(ch1 == '0'){
            return;
        }else{
            char encd = (char)('a'+(ch1-'1'));
            printEncodings(str.substring(1), asf+encd);
        }

        if(str.length() > 1){
            String temp = str.substring(0,2);
            int ch2 = Integer.parseInt(temp);
            if(ch2<27){
                char ecd = (char)('a'+(ch2-1));
                printEncodings(str.substring(2), asf+ecd);
            }
        }


        
    }

}