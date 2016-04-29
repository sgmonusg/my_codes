import java.util.*;
public class chef2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int temp=0;
        int temp1=0;
        for(int j=0;j<t;j++){
            int n=sc.nextInt();
            String s=sc.next();
            int arr1[]=new int[n];
            for(int i=0;i<n-1;i++){
                arr1[i]=(int)s.charAt(i);
            }
            String s1=sc.next();
            int arr2[]=new int[n];
            for(int i=0;i<n;i++){
                arr2[i]=(int)s1.charAt(i);
            }
            temp1=0;
            int i=0;
            while(i<n){
                while(i<n){
                    if(arr1[i]==arr2[i]){
                        temp++;
                        i++;
                    }
                    else{
                        i++;
                        break;
                    }
                }
                if(temp>temp1){
                    temp1=temp;
                }
            }
           // System.out.println("temp1="+temp1);
            int arr[]=new int[n+1];
            for(i=0;i<n+1;i++){
                arr[i]=sc.nextInt();
            }
            int max=-1;
            for(i=0;i<temp1+1;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            System.out.println(max);
            temp=0;
        }
    }
}
                
    