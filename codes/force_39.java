import java.util.*;
public class force_39{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int r=1;
        int temp=0;
        int i=0;
        int x=0;
        int sum=0;
        for(i=0;i<a;i++){
            if(i!=a-1){
                x=a-i-1;
            temp=r*x;
           // System.out.println("temp="+temp);
            r++;
            //System.out.print("temp"+sum+" ");
            sum=sum+temp;
            //System.out.println("temp_after"+sum);
            }
            else{
                 sum=sum+a;
               
        }
        }
        
        System.out.println(sum);
    }
}
        
        