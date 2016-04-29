import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sort {
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    public static void insertIntoSorted(int[] ar,int s) {
        //System.out.println(ar[s-1]);
        int temp=0;
        int q=ar[s-1];
        for(int i=s-2;i>=0&&q<ar[i];i--){
            //System.out.println(i);
               ar[i+1]=ar[i];
                temp=i;
          //  System.out.println(temp);
                printArray(ar);
        }
        
        ar[temp]=q;
        //System.out.println(ar[temp]);
        printArray(ar);
        // Fill up this function  
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar,s);
    }
    
    
    
    
    
}
