import java.util.*;
public class force_22{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==1&&b==10){
            System.out.println(-1);
        }
        else{
        if(a!=0){
        if(b!=10){
        for(int i=0;i<a;i++){
            System.out.print(b);
        }
        }
        else{
            for(int i=0;i<a-1;i++)
            System.out.print(2);
            System.out.println("0");
        }
    }
        else{
            System.out.println("-1");
        }
    }
    }
}
        
        