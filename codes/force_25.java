import java.util.*;
public class force_25{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=0;
        String str=sc.next();
        for(int i=0;i<n-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                x++;
            }
        }
        System.out.println(x);
    }
}

            