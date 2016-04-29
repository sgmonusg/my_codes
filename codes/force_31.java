import java.util.*;
public class force_31{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String s="hello";
       // System.out.println(s);
       // System.out.println(str);
        int j=0;
        for(int i=0;i<str.length();i++){
            if(s.charAt(j)==str.charAt(i)){
                j++;
                if(j==5)
                    break;
            }
        }
        if(j==5){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}