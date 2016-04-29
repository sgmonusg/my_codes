import java.util.*;
import java.lang.*;
public class Tricky_sum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int n;
        int i=0;
        int j=0;
        int k=0;
        double g=0;
        long sum=0;
        for(i=0;i<t;i++){
            n=sc.nextInt();
            k=0;
            g=Math.pow(2,k);
            for(j=0;j<=n;j++){
                if(j%g==0){
                    sum=sum-j;
                    k++;
                    g=Math.pow(2,k);
                }
                else
                    sum=sum+j;
            }
            sum=sum-2;
            System.out.println(sum);
            sum=0;
        }
    }
}
            