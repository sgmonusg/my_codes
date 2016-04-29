import java.util.*;
public class gift{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int i=0;
        int j=0;
        int temp=1;
        long sum=0;
        int[] arr=new int[n];
        int[] arr1=new int[n];
        int[][] arr2=new int[m][m];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                temp++;
            }
            else{
                arr1[i]=temp;
                temp=1;
            }
        }
        if(arr[n-2]!=arr[n-1])
            arr1[n-1]=1;
        else 
            arr1[n-1]=2;
        
        for(i=0;i<n-1;i++){
            for(j=i;j<n-1;j++){
            if(arr1[j]==0){
                arr1[j]=arr1[j+1];
                arr1[j+1]=0;
            }
          }
        }
        //for(i=0;i<n;i++){
         // System.out.print(arr1[i]);
        //}
        //System.out.println("");
        for(i=0;i<m;i++){
            for(j=0;j<m;j++){
                if(i!=j)
                arr2[i][j]=arr1[i]*arr1[j];
                else
                    arr2[i][j]=0;
            }
        }
         //for(i=0;i<m;i++){
           // for(j=0;j<m;j++){
             //   System.out.print(arr2[i][j]);
            //}
            //System.out.println("");
         //}
        for(i=0;i<m;i++){
            for(j=i;j<m;j++){
                sum=sum+arr2[i][j];
            }
        }
        System.out.println(sum);
    }
}