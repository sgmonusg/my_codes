import java.util.*;
public class force_19{    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=0;
        for(int i=0;i<n;i++){
            String str=sc.next();
            if(str.charAt(1)=='+'){
                x++;
            }
            else
                x--;
        }
        System.out.println(x);
            
    }
}