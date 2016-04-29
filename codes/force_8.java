import java.util.*;
public class force_8{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[]=new int[m];
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            for(;x>0;x--){
                arr[sc.nextInt()-1]++;
            }
        }
        Arrays.sort(arr);
        if(arr[0]==0){
            System.out.println("NO");
        }
        else
            System.out.println("YES");
                
    }
}