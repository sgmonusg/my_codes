import java.util.*;
public class force_26{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int temp=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='H'||str.charAt(i)=='Q'||str.charAt(i)=='9'){
                System.out.println("YES");
                temp=1;
                break;
            }
        }
        if(temp==0){
            System.out.println("NO");
        }
    }
}
