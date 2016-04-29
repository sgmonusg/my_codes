import java.util.*;
public class project_euler_2_2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        long i=0;
        long k=0;
        long j=0;
        long n=0;
        long sum=0;
        long x=0;
        long z=0;
        long y=0;
        for(i=0;i<t;i++){
            n=sc.nextLong();
            x=1;
            y=2;
            for(j=0;j<n;j++){
                z=x+y;
                x=y;
                y=z;
                //System.out.print(z+" ");
                if(z%2==0){
                    sum=sum+z;
                   // System.out.println(sum);
                }
                if(z>n){
                    break;
                }
            }
            if(z%2==0){
                 sum=sum-z;
                 //System.out.println(sum);
            }

            sum=sum+2;
            System.out.println(sum);
            sum=0;
        }
    }
}
