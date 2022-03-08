import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int l = scn.nextInt();
        int h = scn.nextInt(),count=0;

        for(int i=l; i<=h; i++){
            for(int j =2; j*j<=i; j++){
                if(i%j == 0){
                    count++;
                    break;
                }
            }if(count!= 0){
                count = 0;
            }else{
                System.out.println(i);
            }
        }
    }
}