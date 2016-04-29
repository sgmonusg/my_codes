import java.util.*;

public class demo2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int i=0;
            for(i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int temp=0;
            int temp1=0;
            for(i=0;i<n;i++){
                if(arr[i]%2==0){
                    temp=temp+1;
                }
                else{
                    temp1=temp1+1;
                }
            }
            if(temp>temp1){
                System.out.println("READY FOR BATTLE");
            }
            else{
                System.out.println("NOT READY");
            }
        }
    }
            