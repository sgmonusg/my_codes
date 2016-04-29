import java.util.*;
public class force_42{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a=sc.next();
        String b=sc.next();
        int sum=0;
        for(int i=0;i<n;i++){
            int temp=Math.abs((int)a.charAt(i)-(int)b.charAt(i));
            if(temp>5){
                sum=sum+10-temp;
            }
            else
                sum=sum+temp;
        }
        System.out.println(sum);
    }
}