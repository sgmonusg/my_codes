import java.util.*;
public class test_1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int sum=0;
            if((a%2!=0)){
                while(a!=1){
                    a=a/2;
                    sum++;
                }
                while(b!=1){
                    b=b/2;
                    sum++;
                }
                System.out.println(sum);
                sum=0;
            }
            else{
                if(a>b){
                    while(a!=b){
                        sum++;
                        a=a/2;
                    }
                }
                else{
                    while(a!=b){
                        sum++;
                        b=b/2;
                    }
                    
                }
                System.out.println(sum);
                sum=0;
            }
        }
    }
}
                    
                
                