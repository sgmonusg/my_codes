import java.util.*;
import java.lang.*;
import java.math.*;
public class force_4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        BigInteger k=sc.nextBigInteger();
        BigInteger b=sc.nextBigInteger();
        BigInteger a=sc.nextBigInteger();
        BigInteger c=b.mod(k);
        //System.out.println(c);
        b=b.add(k.subtract(c));
        //System.out.println(b);
        BigInteger q=new BigInteger("1");
        BigInteger sum=new BigInteger("0");
        if(c.intValue()==0){
            sum=sum.add(q);
        }
        int res=b.compareTo(a);
        while(res<=0){
            
          //  System.out.println(b);
            sum=sum.add(q);
            b=b.add(k);
            //System.out.println(sum);
            res=b.compareTo(a);
        }
         System.out.println(sum);
    }
}
        
        
        