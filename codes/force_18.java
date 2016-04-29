import java.util.*;
public class force_18{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[4];
        for(int i=0;i<a;i++){
            arr[sc.nextInt()-1]++;
        }
        if(arr[0]>=arr[2]){
            arr[3]=arr[3]+arr[2];
            arr[0]=arr[0]-arr[2];
            arr[2]=0;
            arr[1]=arr[1]+arr[0]/2;
            arr[0]=arr[0]%2;
            arr[3]=arr[1]/2+arr[3];
            arr[1]=arr[1]%2;
            if(arr[1]==1||arr[0]==1)
            System.out.println(arr[3]+1);
            else
                System.out.println(arr[3]);
         }
        else {
            arr[0]=0;
            arr[3]=arr[3]+arr[0];
            arr[2]=arr[2]-arr[0];
            arr[3]=arr[3]+arr[1]/2;
            arr[1]=arr[1]%2;
            System.out.println(arr[1]+arr[2]+arr[3]);
        }
    }
}