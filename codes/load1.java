import java.util.*;
 public class load{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        int[] arr=new int[n];
        int temp=0;
        int temp1=0;
        
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        
        while(arr[n-1]-arr[0]!=1&&arr[n-1]-arr[0]!=0){
            if(arr[n-1]-arr[0]%2==0){
                temp=(arr[n-1]-arr[0])/2;
            }
            else{
                temp=(arr[n-1]-arr[0]-1)/2;
            }
            temp1=temp1+temp;
            arr[0]=arr[0]+temp;
            arr[n-1]=arr[n-1]-temp;
            Arrays.sort(arr);
            
        }
        System.out.println(temp1);
     }
   }