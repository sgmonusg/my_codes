import java.util.*;
public class force_28{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int x1=sc.nextInt();
        int max=Math.abs(x1-x);
        int y1=sc.nextInt();
        if(Math.abs(y1-y)>max){
            max=Math.abs(y1-y);
        }
        System.out.println(max);
    }
}