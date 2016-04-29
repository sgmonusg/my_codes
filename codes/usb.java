import java.util.*;
public class usb{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int i=0;
        int sum=0;
        int temp=0;
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(i=n-1;i>=0;i--){
            if(sum<m){
                sum=sum+arr[i];
                //System.out.println(sum);
                temp++;
            }
        }
        System.out.println(temp);
    }
}
            