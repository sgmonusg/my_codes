import java.util.*;
 public class load2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        long[] arr=new long[n];
        long temp=0;
        
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(i=0;i<n/2;i++){
            temp=temp+(arr[n-1-i]-arr[0+i])/2;
            }
        System.out.println(temp);
     }
   }
