import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str){
		String s = ""+str.charAt(0);
		int idx = 1;

		while(idx < str.length()){
			if(str.charAt(idx) == str.charAt(idx-1)){
				idx++;
			}else{
				s = s+str.charAt(idx);
				idx++;
			}
		}

		return s;
	}

	public static String compression2(String str){
		String s = ""+str.charAt(0);
		int idx = 1, count=1;

		while(idx < str.length()){
			if(str.charAt(idx) == str.charAt(idx-1)){
				idx++;
				count++;
			}else{
				if(count>1){
					s = s+count;
				}
				count =1;
				s = s+str.charAt(idx);
				idx++;
			}
		}
		if(count>1){
					s = s+count;
				}

		return s;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}