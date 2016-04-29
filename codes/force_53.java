import java.util.*;
public class force_53{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=sc.nextInt();
        int sum=n;
        while(n>=b){
            int temp=n%b;
            n=n/b;
            sum=sum+n;
            n=n+temp;
        }
        System.out.println(sum);
    }
}
            