import java.util.*;
import java.lang.*;
public class digits{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int temp=0;
        double i=Math.pow(10,(n-1));
        while(i<Math.pow(10,n))
        {
            if(i%t==0){
                temp=1;
                break;
            }
            i++;
        }
        if(temp==0){
            System.out.println("-1");
        }
        else{
            System.out.println((int)(i));
        }
    }
}
        