import java.util.*;

class factorial
{
    
    factorial(int n){
        int a=1,i=1;
        for(i=1;a<n;++i)
        {
            a=a*i;
        }
        if(a==n){
            System.out.println("factorial");
        }
        else{
            System.out.println("not a factorial");
        }
    }
}
    
public class demo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        factorial ob=new factorial(n);
    }
}