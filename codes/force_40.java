import java.util.*;
public class force_40{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long m=sc.nextLong();
        Long a=sc.nextLong();
        long sum=a-1;
        for(long i=1;i<m;i++){
            long b=sc.nextLong();
            if(b<a){
                sum=sum+(n-a);
                sum=sum+b;
                a=b;
            }
            else{
                sum=sum+(b-a);
                a=b;
            }
        }
        System.out.println(sum);
    }
}
            