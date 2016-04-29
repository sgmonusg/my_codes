import java.util.*;
public class force_46{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int temp=1;
        for(int i=1;i<n;i++){
            int b=sc.nextInt();
            if(a!=b){
                temp++;
            }
            a=b;
        }
        System.out.println(temp);
    }
}