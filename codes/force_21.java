import java.util.*;
public class force_21{
    public static void  main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=-1;
        int c=0;
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            c=c-a;
            c=c+b;
            if(c>max){
                max=c;
            }
        }
        System.out.println(max);
    }
}