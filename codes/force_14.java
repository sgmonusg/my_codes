import java.util.*;
public class force_14{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int arr[]=new int[a];
            for(int i=0;i<a;i++){
                arr[i]=sc.nextInt();
            }
            if(arr[b-1]==0){
                int i=0;
                for(i=0;arr[i]!=0;i++){
                    continue;
                }
                System.out.println(i);
            }
            else{
            int temp=b;
            for(int i=b;i<a;i++){
                if(arr[i]==arr[b-1]){
                    temp++;
                    //System.out.println(arr[i]);
                }
                else{
                    break;
                }
            }
            System.out.println(temp);
            }
        
    }
}
            
        