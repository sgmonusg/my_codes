import java.util.*;
public class force_34{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int arr[]=new int[10];
        for(int i=0;i<str.length();i++){
            arr[(int)str.charAt(i)-48]++;
            if(arr[4]>7||arr[7]>7){
                break;
            }
        }
        int sum=arr[4]+arr[7];
        if(sum==7||sum==4){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}
        