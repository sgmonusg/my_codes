import java.util.*;
public class force_10{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long m=sc.nextLong();
        long a=sc.nextLong();
        long x=n/a;
        if(n%a!=0){
            x++;
        }
        long y=(m-1)/a;
        if((m-1%a)!=0||m-1==0){
            y++;
        }
        //System.out.println(x);
        //System.out.println(y);
        System.out.println(x*y);
    }
}