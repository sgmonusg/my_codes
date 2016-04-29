import java.util.*;
public class force_52{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        StringBuffer bf=new StringBuffer(t);
        bf.reverse();
        //System.out.println(bf);
        if(s.equals(bf.toString())){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}
