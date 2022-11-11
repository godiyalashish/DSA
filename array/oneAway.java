import java.util.*;

class GFG {
	public static void main (String[] args) {
		String s1 ="mohit";
		String s2 = "hit";
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i =0; i<s2.length(); i++){
		    if(map.containsKey(s2.charAt(i))){
		        int val = map.get(s2.charAt(i));
		        map.put(s2.charAt(i), val+1);
		    }else{
		        map.put(s2.charAt(i), 1);
		    }
		}
		int skipped = 0;
		for(int j=0; j<s1.length(); j++){
		    char ch = s1.charAt(j);
		    if(map.containsKey(ch)){
		        int val = map.get(s1.charAt(j));
		        if(val-1 == 0){
		            map.remove(ch);
		        }else{
		           map.put(s1.charAt(j), val-1); 
		        }
		        
		    }else{
		        skipped++;
		    }
		}
		int sum = 0;
		for(Character ch : map.keySet()){
		    sum += map.get(ch);
		}
		if(sum > 1 || skipped > 1) {System.out.print("false"); return;}
		System.out.print("true"); return;
		
	}
}

//optimal approach

import java.io.*;

class GFG {
	public static void main (String[] args) {
	    String str1 = "ple";
	    String str2 = "pale";
		System.out.print(oneAway(str1, str2));
	}
	
	public static boolean oneAway(String s1, String s2){
	    if(Math.abs(s1.length() - s2.length()) > 1) return false;
	    
	    String shrt = (s1.length() > s2.length()) ? s2 : s1;
	    String grt = (s1.length() > s2.length()) ? s1 : s2;
	    
	    int index1 = 0;
	    int index2 = 0;
	    boolean foundDiff = false;
	    while(index2 < grt.length() && index1 < shrt.length() ){
	        if(shrt.charAt(index1) != grt.charAt(index2)){
	            if(foundDiff)return false;
	            foundDiff = true;
	            if(shrt.length() == grt.length()){
	                index1++;
	            }
	        }else{
	            index1++;
	        }
	        index2++;
	    }
	    return true;
	}
}
