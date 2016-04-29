import java.util.*;
public class force_27{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        Arrays.sort(arr);
        int sum1=0;
        int temp=0;
        for(int i=n-1;sum1<=sum/2;i--){
            sum1=sum1+arr[i];
            temp++;
        }
        System.out.println(temp);
    }
}