import java.util.*;
public class project_euler_1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long sum=0;
        int i=0;
        int n=0;
        int j=0;
        for(j=0;j<t;j++){
            n=sc.nextInt();
            n--;
        for(i=1;i<=(n/3);i++)
            sum=sum+(3*i);
        //System.out.println(sum);
        for(i=1;i<=(n/5);i++)
            sum=sum+(5*i);
        //System.out.println(sum);
        for(i=1;i<=(n/15);i++)
            sum=sum-(15*i);
        System.out.println(sum);
        }
        sum=0;
    }
}