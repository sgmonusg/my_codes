import java.util.*;
public class project_euler_2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int i=0;
        int k=0;
        int j=0;
        int n=0;
        int sum=0;
        for(i=0;i<t;i++){
            n=sc.nextInt();
            int[] arr=new int[n];
            arr[0]=1;
            arr[1]=2;
            for(j=2;j<n;j++){
                arr[j]=arr[j-1]+arr[j-2];
                if(arr[j]>n){
                    k=j;
                    break;
                }
            }
            //for(j=0;j<k;j++){
              //  System.out.print(arr[j]+" ");
            //}
            //System.out.println();
            for(j=0;j<k;j++){
                if(arr[j]%2==0){
                    sum=sum+arr[j];
                }
            }
            System.out.println(sum);
            sum=0;
        }
    }
}
