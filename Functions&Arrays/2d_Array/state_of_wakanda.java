import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int r= scn.nextInt();
    int c = scn.nextInt();

    int [][] arr = new int[r][c];

    for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[0].length; j++){
            arr[i][j] = scn.nextInt();
        }
    }
    int row=0, col=0, dir = 0; //dir =0 means moving downwards
    while(row<arr.length && col<arr[0].length){
        if(dir == 0){
            for( row = 0; row<arr.length; row++){
                System.out.println(arr[row][col]);
            }
            row--;
            col++;
            dir =1;
        }
        else{//move upwards
            for(row = arr.length-1; row>=0; row--){
                System.out.println(arr[row][col]);
            }
            col++;
            dir = 0;
        }
    }
 }

}


//second approach


// import java.io.*;
// import java.util.*;

// public class Main{

// public static void main(String[] args) throws Exception {
//     Scanner scn = new Scanner(System.in);
//     int r= scn.nextInt();
//     int c = scn.nextInt();

//     int [][] arr = new int[r][c];

//     for(int i=0; i<arr.length; i++){
//         for(int j=0; j<arr[0].length; j++){
//             arr[i][j] = scn.nextInt();
//         }
//     }
//     int row=0, col=0;
//     while(col<arr[0].length){
//         if(col%2 ==  0){
//             for( row = 0; row<arr.length; row++){
//                 System.out.println(arr[row][col]);
//             }
//             col++;
//         }
//         else{
//             for(row = arr.length-1; row>=0; row--){
//                 System.out.println(arr[row][col]);
//             }
//             col++;
//         }
//     }
//  }

// }