import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t[] = new int[n];
        for(int i=0; i < n; i++){
            t[i] = in.nextInt();
        }
        int sum=t[0];
        for(int i=1;i<n;i++){
            if(t[i]<=sum){
                sum++;
            }
            else
                sum=sum+t[i];
            
        }
        System.out.println(sum);
        
    }
}
