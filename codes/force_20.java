import java.util.*;
public class force_20{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int j=0;
        int k=0;
        int temp=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0'){
                k=0;
                j++;
                if(j==7){
                    System.out.println("YES");
                    temp=-1;
                    break;
                    
                }
            }
            else{
                j=0;
                k++;
                if(k==7){
                    System.out.println("YES");
                    temp=-1;
                    break;
                    
                }
            }
        }
        if(temp!=-1)
           System.out.println("NO");
    }
}
                
                    