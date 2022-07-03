import java.io.*;
import java.util.*;

public class Main{

public static void findCommEle(int[] a1, int[] a2){
    HashMap <Integer,Integer> hm = new HashMap<>();

    for(int i: a1){
        hm.put(i,0);
    }

    for(int i: a2){
        if(hm.containsKey(i)){
            System.out.println(i);
            hm.remove(i);
        }
    }
}

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();

    int arr1 []  = new int[n1];
    for(int i=0; i<n1; i++){
        arr1[i] = scn.nextInt();
    }

    int n2 = scn.nextInt();

    int arr2 []  = new int[n2];
    for(int i=0; i<n2; i++){
        arr2[i] = scn.nextInt();
    }

    findCommEle(arr1, arr2);
 }

}