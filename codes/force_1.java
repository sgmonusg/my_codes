import java.util.*;
public class force_1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr);
        int temp=0;
        for(int i=0;i<n;i++){
            if(arr[i]==arr[i+1]){
                temp=1;
                break;
            }
        }
        int temp1=0;
        for(int i=0;i<n;i++){
        if(arr[i]==arr1[i]){
            temp1=-1;
        }
        else{
            temp=0;
            break;
        }
        }
        if(temp==0){
        if(temp1==-1){
            System.out.println("Possible");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]);
            }
        }
        else
            System.out.println("Impossible");
        }
        else
            System.out.println("Ambiguity");
    }
}
        