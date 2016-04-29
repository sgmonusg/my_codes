import java.util.*;
public class force_45{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        if((float)b/m>=(float)a){
            System.out.println(n*a);
        }
        else{
            int temp=n/m;
            int sum=0;
            sum=sum+temp*b;
            n=n%m;
            if(n*a<b){
                System.out.println(sum+n*a);
            }
            else
                System.out.println(sum+b);
        }
    }
}

            