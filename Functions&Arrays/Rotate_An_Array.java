import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void rev(int a[], int l, int h){
    while(l<h){
      int temp = a[l];
      a[l] = a[h];
      a[h] = temp;
      l++;
      h--;
    }
  }

  public static void rotate(int[] a, int k){
    // write your code here
    k %= a.length;
    if(k<0){
      k += a.length;
    }
    int l = a.length - k;
    int h = a.length-1;
    rev(a,l,h);
    rev(a,0,l-1);
    rev(a,0,a.length-1);

   
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}