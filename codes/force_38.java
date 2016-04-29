import java.util.*;
public class force_38{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[][]=new int[a][a];
        for(int i=0;i<a;i++){
            arr[0][i]=1;
        }
        for(int i=0;i<a;i++){
            arr[i][0]=1;
        }
        for(int i=1;i<a;i++){
            for(int j=1;j<a;j++){
                arr[i][j]=arr[i-1][j]+arr[i][j-1];
            }
        }
        System.out.println(arr[a-1][a-1]);
    }
}