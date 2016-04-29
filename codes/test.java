import java.util.*;
public class test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int diff=n-1900;
            int spec=diff/4;
            if((diff%4==0 && diff%100!=0) || diff%400==0){
                diff=diff+spec;
            }
            else
                diff=diff+spec+1;
            diff=diff%7;
            if(diff==1){
                System.out.println("monday");
            }
            else if(diff==2){
                System.out.println("tuesday");
            }
            else if(diff==3){
                System.out.println("wednesday");
            }
            else if(diff==4){
                System.out.println("thursday");
            }
            else if(diff==5){
                System.out.println("friday");
            }
            else if(diff==6){
                System.out.println("saturday");
            }
            else{
                System.out.println("sunday");
            }
        }
    }
}