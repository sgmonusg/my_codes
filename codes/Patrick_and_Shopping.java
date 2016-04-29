import java.util.*;
public class Patrick_and_Shopping{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int d1=sc.nextInt();
        int d2=sc.nextInt();
        int d3=sc.nextInt();
        int d4=0;
        int d5=0;
        int d6=0;
        if((d1+d2)>=d3){
            d4=d3;
        }
        else{
            d4=(d1+d2);
        }
        if((d1+d3)>=d2){
            d5=d2;
        }
        else{
            d5=(d1+d3);
        }
        if((d3+d2)>=d1){
            d6=d1;
        }
        else{
            d6=(d3+d2);
        }
        System.out.println(d4+d5+d6);
    }
}
        