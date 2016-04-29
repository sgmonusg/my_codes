import java.util.*;
public class force_41{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=sc.nextInt();
        int max=b;
        int min=b;
        int temp=0;
        for(int i=1;i<n;i++){
            int a=sc.nextInt();
            if(a>max){
                max=a;
                temp++;
            }
            if(a<min){
                min =a;
                temp++;
            }
        }
        System.out.println(temp);
    }
}