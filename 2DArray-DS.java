import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] val = new int[6][6];
        int temp;
        int ans = Integer.MIN_VALUE;
        
        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                val[i][j] = input.nextInt();
            }
        }
        
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                temp = val[i][j] + val[i][j+1] + val[i][j+2]
                        + val[i+1][j+1]
                        + val[i+2][j] + val[i+2][j+1] + val[i+2][j+2];
                ans = Math.max(temp, ans);
            }
        }
        System.out.print(ans);
    }
}