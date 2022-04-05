import java.io.*;
import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

	public static String toggleCase(String str){
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch>='a' && ch<='z'){
				//convert to upper case
				char uc = (char)((ch-'a')+'A');
				sb.append(uc);
			}else if(ch>= 'A' && ch<='Z'){
				//convert to lower case 
				char lc = (char)((ch-'A')+'a');
				sb.append(lc);
			}
		}
		return sb.toString();
	}

}