import java.util.*;
public class force_24{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int j=0;
        char[] s=new char[str.length()/2+1];
        for(int i=0;i<str.length();i=i+2){
            s[j]=str.charAt(i);
            j++;
        }
        Arrays.sort(s);
        System.out.print(s[0]);
        for(int i=1;i<str.length()/2+1;i++){
            System.out.print("+"+s[i]);
        }
        System.out.println();
    }
}