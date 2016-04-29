import java.util.*;
public class force_54{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[]=new int[m];
        for(int i=0;i<m;i++){
            arr[i]=sc.nextInt();
        }
       // if(n==m){
         //   System.out.println(Math.abs(arr[n-1]-arr[0]));
        //}
        //else{
        int max=10000;
        for(int i=0;i<m-n+1;i++){
            if(Math.abs(arr[i+n-1]-arr[i])<max){
                max=Math.abs(arr[i+n-1]-arr[i]);
            }
        }
        System.out.println(max);
    }
    //}

}