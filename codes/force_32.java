import java.util.*;
public class force_32{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int n=sc.nextInt();
        int temp=0;
        for(int i=1;i<=n;i++){
            if(i%a==0||i%b==0||i%c==0||i%d==0){
                temp++;
            }
        }
        System.out.println(temp);
    }
}