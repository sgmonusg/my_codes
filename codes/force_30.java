import java.util.*;
public class force_30{
    public static void main(String args[]){
        int arr[]={4,7,44,77,47,74,444,447,474,477,744,747,774,777};
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int temp=0;
        for(int i=0;i<14;i++){
            if(a%arr[i]==0){
                System.out.println("YES");
                temp++;
                break;
            }
        }
        if(temp==0){
            System.out.println("NO");
        }
    }
}