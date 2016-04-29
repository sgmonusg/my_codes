import java.math.*;
import java.util.*;
import java.io.*;
public class force_6{
    public static void main(String args[]){
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        
        BigInteger a=new BigInteger(stdin.readLine());
        BigInteger b=new BigInteger(stdin.readLine());
        int c=a.compareTo(b);
        if(c==-1){
            System.out.println("<");
        }
        else if(c==0){
            System.out.println("=");
        }
        else 
            System.out.println(">");
    }
}