import java.util.*;
public class force_56_1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(n*m<4){
            System.out.println("Akshat");
        }
        else{
            int sum=n*m;
            String str=Integer.toBinaryString(sum);
            //System.out.println((int)str.charAt(0));
            if(str.length()%2!=0){
            if(((int)str.charAt(0)-48)==1){
                System.out.println("Malvika");
            }
            else
                System.out.println("Akshat");
        }
            else{
                if(((int)str.charAt(0)-48)==1){
                System.out.println("Akshat");
            }
            else
                System.out.println("Malvika");
        }
        }
        
    }
}
            