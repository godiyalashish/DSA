import java.util.*;
  
  public class Main{

  public static void input(int arr[][], Scanner scn){
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr[0].length; j++){
        arr[i][j] = scn.nextInt();
      }
    }
  }

  public static void output(int arr[][]){
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr[0].length; j++){
        System.out.print(arr[i][j]+" ");
      }System.out.println();
    }
  }
  
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int nr  = scn.nextInt();
    int nc  = scn.nextInt();
    int arr[][] = new int[nr][nc];

    input(arr, scn);
    output(arr);

    
   }

   
  }