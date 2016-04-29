import java.util.*;
public class force_36{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(arr[0]%2==0&&arr[1]%2==0){
                for(int i=2;i<n;i++){
                    if(arr[i]%2==1){
                        System.out.println(i+1);
                        break;
                    }
                }
            }
            else if(arr[0]%2==1&&arr[1]%2==1){
                for(int i=2;i<n;i++){
                    if(arr[i]%2==0){
                        System.out.println(i+1);
                        break;
                    }
                }
               
            }
            else if(arr[0]%2==1&&arr[1]%2==0){
                if(arr[2]%2==0){
                    System.out.println("1");
                    
                }
                else
                    System.out.println("2");
            }
            else{
                if(arr[2]%2==0){
                    System.out.println("2");
                    
                }
                else
                    System.out.println("1");
            }
                
    }
}