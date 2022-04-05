import java.io.*;
import java.util.*;

public class Main {

	public static String solution(String str){
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length()-1; i++){
			char first = str.charAt(i);
			char second = str.charAt(i+1);
			sb.append(str.charAt(i));
			sb.append(second-first);
		}
		sb.append(str.charAt(str.length()-1));

		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}