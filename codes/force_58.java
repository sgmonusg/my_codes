import java.util.*;
public class force_58{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    int arr1[]=new int[n];
    for(int i=0;i<n;i++){
        int a=sc.nextInt();
        int b=sc.nextInt();
        arr[i]=a+b;
        arr1[i]=a-b;
    }
    Arrays.sort(arr);
    Arrays.sort(arr1);
    for(int i=0;i<n-1;i++){
        if(arr[i]==arr[i+1]){
           sum++;
           }
        if(arr1[i]==arr[i+1]){
            sum++;
        }

    }
    System.out.println(sum);
    }
}
