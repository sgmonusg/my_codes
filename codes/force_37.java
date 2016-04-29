import java.util.*;
public class force_37{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a<b){
            int temp=a;
            a=b;
            b=temp;
        }
        System.out.println(b+" "+(a-b)/2);
    }
}
        