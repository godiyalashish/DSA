import java.io.*;
import java.util.*;

public class Main {

    public static void solution(String str, String asf,int count, int pos){
        if(pos == str.length()){
            if(count != 0) asf = asf+count;
            System.out.println(asf);
            return;
        }
        String nasf = asf;
        if(count != 0) nasf = nasf+count;
        nasf = nasf+str.charAt(pos);
        solution(str, nasf, 0, pos+1);
        solution(str, asf, count+1, pos+1);
        
    }
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        solution(str,"",0,0);
    }
    
    
}