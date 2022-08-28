import java.util.*;

public class Main {

	public static int solution(int[] arr) {
		// write your code here
		HashMap <Integer, Integer> hm = new HashMap<>();
		int sum=0;
		int count = 0;
		hm.put(0,1);
		for(int i : arr){
			sum = sum+i;
			Integer frq = hm.get(sum);
			if(frq != null){
				count += frq;
				hm.put(sum, frq+1);
			}else{
				hm.put(sum,1);
			}
		}

		return count;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(solution(arr));

	}

}