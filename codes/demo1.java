import java.util.*;
class factorial
{
    factorial(int n){
        int a=1,i=1;
        while(a<n){
            a*=i;
            i++;
        }
        if(a==n){
            System.out.println("factorial");
        }
        else{
            System.out.println("not a factorial");
        }
    }
}
    
public class demo1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        factorial ob = new factorial(n);
    }
}