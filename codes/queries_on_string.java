import java.util.*;
public class queries_on_string{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int m=sc.nextInt();
        int i=0;
        int j=0;
        int l=0;
        int r=0;
        int k=0;
        char temp;
        char temp1;
        for(i=0;i<m;i++){
            l=sc.nextInt();
            l--;
            r=sc.nextInt();
            r--;
            k=sc.nextInt();
            for(j=0;j<k;j++){
                temp=s.charAt(l);
                s=s.charAt(r);
                l++;
                while(l==r){
                    temp1=s.charAt(l);
                    s=temp;
                    temp=s.charAt(l+1);
                    l++;
                }
            }
        }
        System.out.println(s);
    }
}
        