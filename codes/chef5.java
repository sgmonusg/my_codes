import java.util.*;
public class chef5{
    //MSTEP
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int[][] arr=new int[n][n];
            int arr1[]=new int[n*n];
            int arr2[]=new int[n*n];
            int p=0;
            for(int k=0;k<n;k++){
                for(int j=0;j<n;j++){
                    arr[j][k]=sc.nextInt();
                    p=arr[j][k]-1;
                    arr1[p]=j;
                    arr2[p]=k;
                }
            }
            int sum=0;
            for(int j=0;j<(n*n)-1;j++){
                sum=sum+Math.abs(arr1[j]-arr1[j+1]);
                sum=sum+Math.abs(arr2[j]-arr2[j+1]);
            }
            System.out.println(sum);
            sum=0;
        }
    }
}
                    
            