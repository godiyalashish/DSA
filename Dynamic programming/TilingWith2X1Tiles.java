import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int prev = 2;
        int Bprev = 1;
        int nw = 0;
        for(int i=3; i<=n; i++){
            nw = prev+Bprev;
            Bprev = prev;
            prev = nw;
            nw = 0;
            
        }
        System.out.print(prev);
    }
}