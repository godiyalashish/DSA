import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        int n = (new Scanner(System.in)).nextInt();
        System.out.println(getStairPaths(n));
    }

    public static ArrayList<String> getStairPaths(int n) {

        if(n==0){
            ArrayList<String> base = new ArrayList<String>();
            base.add("");
            return base;
        }

        ArrayList<String> newList = new ArrayList<String>();
        if(n>=1){
            ArrayList<String> list1 = getStairPaths(n-1);
            for(String st: list1){
                newList.add(1+st);
            }
        }


        if(n>=2){
            ArrayList<String> list2 = getStairPaths(n-2);
            for(String st: list2){
                newList.add(2+st);
            }
        }

        if(n>=3){
            ArrayList<String> list3 = getStairPaths(n-3);
            for(String st: list3){
                newList.add(3+st);
            }
        }

        return newList;
    }

}