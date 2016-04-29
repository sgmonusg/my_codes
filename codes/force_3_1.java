import java.util.*;
public class force_3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[]=new int[n+2];
        int arr1[]=new int[n+1];
        int arr2[]=new int[n+1];
        for(int i=1;i<n+1;i++){
            arr[i]=sc.nextInt();
            arr1[arr[i]]++;
            arr2[arr[i]]=i;
        }
        arr[0]=0;
        arr1[0]=0;
        arr2[0]=0;
        
        int ar[]=new int[m+1];
        ar[0]=0;
        int temp=0;
        for(int i=1;i<m+1;i++){
            ar[i]=sc.nextInt();
            if(arr1[ar[i]]==0){
                System.out.println("Impossible");
                temp=1;
                break;
            }
            else if(arr1[ar[i]]>1){
                System.out.println("Ambiguity");
                temp=1;
                break;
            }
            
        }
        if(temp==0){
                System.out.println("Possible");
                for(int i=1;i<n+1;i++)
                System.out.print(arr2[ar[i]]+" ");
            }
    }
}