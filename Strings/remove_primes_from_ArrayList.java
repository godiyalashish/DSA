import java.io.*;
import java.util.*;

public class Main {

	public static void solution(ArrayList<Integer> al){
		int n = al.size();
		for(int i=n-1; i>=0; i--){
			int temp = al.get(i);
			if(isprime(temp)){
				al.remove(i);
			}
		}
		
	}

	public static boolean isprime(int n){
		for(int i=2; i*i<=n; i++){
			if(n%i == 0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}