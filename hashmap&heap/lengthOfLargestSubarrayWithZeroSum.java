import java.util.*;

public class Main {
	
	public static int solution(int[] arr) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		int sum=0, length=0;
		hm.put(0,-1);
		for(int i=0; i<arr.length; i++){
			sum += arr[i];
			if(hm.containsKey(sum)){
				int idx = hm.get(sum);
				int curLength = i-idx;
				if(curLength > length) length=curLength;
			}else hm.put(sum, i);
		}

		return length;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(solution(arr));
	}

}