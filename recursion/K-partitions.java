import java.io.*;
import java.util.*;

public class Main {
    static int counter = 0;

	public static void solution(int i, int n, int k, int ssf, ArrayList<ArrayList<Integer>> ans) { //ssf is sets so far ie non empty sets.
		//write your code here
		if(i > n){
		    if(ssf == k){
		        System.out.print(++counter+". ");
		        for(ArrayList<Integer> set : ans){
		            System.out.print(set+ " ");
		        }
		        System.out.println();
		    }
		    return;
		}
		for(int j=0; j<ans.size(); j++){
		    if(ans.get(j).size() > 0){
		        ans.get(j).add(i);
		        solution(i+1, n, k, ssf, ans);
		        ans.get(j).remove(ans.get(j).size()-1);
		    }else{
		        ans.get(j).add(i);
		        solution(i+1, n, k, ssf + 1, ans);
		        ans.get(j).remove(ans.get(j).size()-1);
		        break;
		    }
		}
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		for(int i  = 0; i < k; i++) {
			ans.add(new ArrayList<>());
		}
		solution(1, n, k, 0, ans);

	}

}