import java.util.*;
public class force_23{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=sc.nextLine();
        s=s.toLowerCase();
        s1=s1.toLowerCase();
        int a=s.compareTo(s1);
        if(a<0)
            System.out.println("-1");
        else if(a==0)
            System.out.println("0");
        else
            System.out.println("1");
    }
}
            
            