import java.util.*;
public class force_13{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            String s=sc.next();
            int l=s.length();
            if(l<=10){
                System.out.println(s);
            }
            else{
                System.out.print(s.charAt(0));
                System.out.print(l-2);
                System.out.println(s.charAt(l-1));
            }
        }
    }
}