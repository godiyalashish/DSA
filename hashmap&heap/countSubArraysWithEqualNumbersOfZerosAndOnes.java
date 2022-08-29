import java.util.*;

public class Main {

    public static int solution(int[] arr) {
        // write your code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ratio = 0, count=0;
        hm.put(0,1);
        for(int i=0; i<arr.length;i++){
            if(arr[i] == 0) ratio--;
            else ratio++;
            if(hm.containsKey(ratio)){
                int freq = hm.get(ratio);
                count += freq;
                hm.put(ratio, freq+1);
            }else hm.put(ratio, 1);
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
