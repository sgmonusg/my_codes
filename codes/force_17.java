import java.util.*;
public class force_17{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int sum=0;
        int count=0;
        for(int i=0;i<t;i++){
            
            for(int j=0;j<3;j++){
                sum=sum+sc.nextInt();
            }
            if(sum>=2){
                count++;
            }
            sum=0;
        }
        System.out.println(count);
    }
}