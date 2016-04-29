import java.util.*;
public class force_55{
    static int day(int n,int m,int sum){
        sum=sum+(n);
        
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int sum=0;
        int sum1=m;
        int j=2;
        for(int i=1;i<=n;i++){
            sum++;
           // System.out.println("sum "+sum+" "+"i "+i);
            if(i==sum1){
                sum1=m*j;
             //   System.out.println("m "+m);
                n++;
               // System.out.println("n "+n);
                j++;
            }
        }    
        
        System.out.println(sum);
    }
}