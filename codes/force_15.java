import java.util.*;
public class force_15{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s1=sc.next();
    String s=s1.toLowerCase();
    char[] str=new char[s.length()];
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='y'){
            continue;
        }
        else{
            System.out.print("."+s.charAt(i));
        }
    }
}
}
        