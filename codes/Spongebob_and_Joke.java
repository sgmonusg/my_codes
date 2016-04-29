import java.util.*;
public class Spongebob_and_Joke{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int i=0;
        int temp=0;
        int arr[]=new int[n];
        int arr1[]=new int[m];
        int arr2[]=new int[n];
        for(i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            arr2[i]=arr[i];
        }
        for(i=0;i<m;i++)
        arr1[i]=sc.nextInt();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        if(m==n){
            if(Arrays.equals(arr,arr1)){
                for(i=0;i<n-1;i++){
                    if(arr[i]==arr1[i+1]){
                        temp=1;
                        break;
                    }
                }
                if(temp==0){
                    for(i=0;i<n;i++)
                        System.out.print(arr2[i]+" ");
                }
                else{
                    System.out.println("Ambiguity");
                }
        }
            else
                System.out.println("Impossible");
        }
        else if(m>n)
            System.out.println("Impossible");
        temp=0;
        else{
            
            
    }
}
        
            