
import java.util.*;
class chef1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }
            int sum=0;
            int temp=1;
            int j=0;
            while(j<n-1){
            while(j<n-1){
                if(arr[j]<arr[j+1]){
                    temp++;
                    //System.out.println("temp="+temp);
                    j++;
                    //System.out.println("j="+j);
                }
                else{
                    j++;
                    //System.out.println("j="+j);
                    break;
                }
            }
                sum=sum+((temp*(temp+1))/2);
                //System.out.println("sum="+sum);
                temp=1;
            }
            if(n!=1&&arr[n-2]>arr[n-1])
                sum=sum+1;
            if(sum!=0)
               System.out.println(sum);
            else
                System.out.println(sum+1);
               sum=0;
        }
    }
}
                    
                    