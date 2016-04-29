import java.util.*;
public class  WDTBAM{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            String s=sc.next();
            String s1=sc.next();
            int temp=0;
            for(int j=0;j<n;j++){
                if(s.charAt(j)==s1.charAt(j)){
                    temp++;
                }
            }
          //  System.out.println("temp="+temp);
            int[] arr=new int[n+1];
            for(int j=0;j<n+1;j++){
                arr[j]=sc.nextInt();
            }
            if(temp==n){
                System.out.println(arr[n]);
            }
            else{
            int max=-1;
            for(int j=0;j<temp+1;j++){
                if(arr[j]>max){
                    max=arr[j];
                }
            }
            System.out.println(max);
            }
            
        }
    }
}