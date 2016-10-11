import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int[] arr = new int[len];
        
        for(int i=0; i<len; i++){
            arr[i] += input.nextInt();
        }
        for(int i=len-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}