import java.util.*;
public class force_50{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int arr[]={6,2,5,5,4,5,6,3,7,6};
        int sum=0;
        for(int i=a;i<=b;i++){
            int index=i;
                while(index!=0){
                    sum=sum+arr[index%10];
                    index=index/10;
                }
        }
        System.out.println(sum);
    }
}
            