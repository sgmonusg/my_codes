import java.util.*;
public class Tricky_sum_1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long n=0;
        long k;
        long g=1;
        long sum;
        int t=sc.nextInt();
        int i=0;
        for(i=0;i<t;i++){
            g=1;
            n=sc.nextInt();
            sum=(n*(n+1))/2;
            for(k=0;g<=n;k++){
                sum=sum-(2*g);
                g=g*2;
            }
            System.out.println(sum);
            
        }
    }
}
            