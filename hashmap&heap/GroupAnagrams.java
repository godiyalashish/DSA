import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String arr[] = new String[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.next();
        }
        
        ArrayList<ArrayList<String>> res = getAnagrams(arr);
        for(ArrayList<String> list : res){
            for(String s: list){
                System.out.print(s+" ");
            }
            System.out.println();
        }
        
    }
    public static ArrayList<ArrayList<String>> getAnagrams(String arr[]){
        HashMap<HashMap<Character, Integer>, ArrayList<String>> bmap = new HashMap<>();
        
        for(String str: arr){
            HashMap<Character, Integer> fmap = new HashMap<>();
            for(int i = 0; i<str.length(); i++){
                Character ch = str.charAt(i);
                fmap.put(ch, fmap.getOrDefault(ch,0)+1);
            }
            
            if(bmap.containsKey(fmap)){
                ArrayList<String> list = bmap.get(fmap);
                list.add(str);
            }else{
                ArrayList <String> list = new ArrayList<>();
                list.add(str);
                bmap.put(fmap, list);
            }
            
        }
        
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        for(ArrayList<String> l: bmap.values()){
            res.add(l);
        }
        
        return res;
    }
}