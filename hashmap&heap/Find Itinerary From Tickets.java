import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int noofpairs_src_des = scn.nextInt();
		HashMap<String, String> map = new HashMap<>();
		for (int i = 0; i < noofpairs_src_des; i++) {
			String s1 = scn.next();
			String s2 = scn.next();
			map.put(s1, s2);	
		}

		//write your code here
		String Source = getSource(map);
		System.out.print(Source);
		for(int i=0; i<noofpairs_src_des; i++){
			Source = map.get(Source);
			System.out.print(" -> "+Source);
		}
		System.out.print(".");

	}

	public static String getSource(HashMap<String, String> map){
		HashMap<String, Boolean> hm = new HashMap<>();
		for(String src : map.keySet()){
			String dest = map.get(src);

			hm.put(dest, false);
			if(hm.containsKey(src) == false){
				hm.put(src, true);
			}
		}
		for(String src : hm.keySet()){
			if(hm.get(src) == true){
				return src;
			}
		}

		return null;
	}
}
