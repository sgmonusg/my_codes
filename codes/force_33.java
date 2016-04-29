import java.util.*;
public class force_33{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=0;
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(b-a>=2){
                temp++;
            }
        }
        System.out.println(temp);cmd
            
    }
}
            