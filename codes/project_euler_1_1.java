import java.util.*;
public class project_euler_1_1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long sum=0;
        long n=0;
        long j=0;
        long k=0;
        for(j=0;j<t;j++){
            n=sc.nextInt();
            n--;
            k=n/3;
            sum=sum+(((k*(k+1))/2)*3);
        //System.out.println(sum);
            k=n/5;
            sum=sum+(((k*(k+1))/2)*5);
        //System.out.println(sum);
            k=n/15;
            sum=sum-(((k*(k+1))/2)*15);
        System.out.println(sum);
        sum=0;
        }
        
    }
}