import java.io.*;
import java.util.*;


public class Main {
public static boolean isPalindrome(String s){
	int l=0, r=s.length()-1;
	while(l<=r){
		if(s.charAt(l) != s.charAt(r)){
			return false;
		}else{
			l++;
			r--;
		}
	}
	return true;
}

	public static void solution(String str){
		for(int i=0; i<str.length(); i++){
			for(int j= i+1; j<=str.length(); j++){
				String ss = str.substring(i,j);
				if(isPalindrome(ss)){
					System.out.println(ss);
				}
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}