import java.util.*;

public class Main {

    public static int solution(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ratio = 0, length=0;
        hm.put(0,-1);
        for(int i=0; i<arr.length;i++){
            if(arr[i] == 0) ratio--;
            else ratio++;
            if(hm.containsKey(ratio)){
                int newLen = i - hm.get(ratio);
                if(newLen>length)length = newLen;
            }else hm.put(ratio, i);
        }

        return length;
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
