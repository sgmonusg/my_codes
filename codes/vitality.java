import java.util.*;
public class vitality{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int i=0;
        int j=0;
        int sum=0;
        int[] arr1=new int[m];
        int[] arr=new int[(2*m)];
        int[] arr2=new int[n];
        int k=0;
        for(i=0;i<n;i++){
            for(j=0;j<(2*m);j++)
                arr[j]=sc.nextInt();
            sum=0;
            k=0;
            for(j=0;j<2*m;j++){
                sum=arr[j]+arr[j+1];
                arr1[k]=sum;
                //System.out.println(sum);
                k++;
                j++;
            }
            k=0;
            sum=0;
            for(k=0;k<m;k++){
            if(arr1[k]==2){
                arr1[k]=1;
            }
            }
            //for(j=0;j<m;j++){
                //System.out.println("arr1:"+arr1[j]);
            //}
            for(j=0;j<m;j++){
                if(arr1[j]>0)sum=sum+1;
            }
            arr2[i]=sum;
            //System.out.println(sum);
        }
        sum=0;
        for(i=0;i<n;i++)
            sum=sum+arr2[i];
        System.out.println(sum);
    }
}
            