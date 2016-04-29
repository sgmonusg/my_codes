import java.util.*;
public class force_44{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<26){
            System.out.println("NO");
        }
        else{
            String str=sc.next();
            str=str.toLowerCase();
            //System.out.println(str);
            int temp=0;
            int arr[]=new int[26];
            for(int i=0;i<n;i++){
                arr[(int)str.charAt(i)-(int)'a']++;
                if(arr[(int)str.charAt(i)-(int)'a']==1){
                    temp++;
                }
            }
           // for(int i=0;i<26;i++){
             //   System.out.print(arr[i]+" ");
            //}
            if(temp==26){
                System.out.println("YES");
            }
            else
                System.out.println("NO");
    }
}
}