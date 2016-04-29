import java.util.*;
public class force_16{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a%2==0&&b%2==0){
            System.out.println((a/2)*b);
        }
        else if(a%2==0&&b%2!=0){
            System.out.println((a/2)*b);
        }
        else if(a%2!=0&&b%2==0){
            System.out.println(a*(b/2));
        }
        else{
            System.out.println(((a/2)*b)+b/2);
        }
    }
}