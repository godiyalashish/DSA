import java.util.*;

public class Main {

	public static int solution(int[] arr) {
		int ans =1;
		for(int j=0; j<arr.length; j++){
			HashSet<Integer> hs = new HashSet<>();
			int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
			for(int i=j; i<arr.length; i++){
				hs.add(arr[i]);
				if(arr[i]>max)max = arr[i];
				if(arr[i]<min)min = arr[i];
				if(hs.size() == i-j+1){   //check if elemts btwn j and i are all unique
					if(i-j+1 == max-min+1){
						ans = Math.max(ans, i-j+1);
					}
				}else break;
			}
		}

		return ans;
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
