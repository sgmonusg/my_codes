import java.util.*;
public class project_euler_3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int i=0;
        for(i=0;i<t;i++){
            n=sc.nextLong();
            for(j=2;j<=Math.sqrt(n);j++){
                if(n%j==0){
                    temp=1;
                    temp1=1;
                    n=n/j;
                    if(j>=k){
                        k=j;
                    }
                    j=1;
                }
                if(temp1==0){
                    if(n>=k){
                        temp2=1;
                        k=n;
                    }
                }
                temp1=0;
            }
                if(temp==0){
                    System.out.println(n);
                }
                else
                    System.out.println(k);
                
                    
    }
}
