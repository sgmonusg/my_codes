import java.util.*;
public class force_29{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int temp=0;
        String str=sc.next();
        int arr[]=new int[27];
        for(int i=0;i<str.length();i++){
            arr[(int)str.charAt(i)-(int)'a']++;
            if(arr[(int)str.charAt(i)-(int)'a']==1){
                temp++;
            }
        }
        //System.out.println(temp);
        if(temp%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else
            System.out.println("IGNORE HIM!");
    }
}

        