import java.util.*;
public class test_2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int arr[]=new int[3];
        int temp=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='F'){
                temp=i;
            }
        }
        int temp1=0;
        for(int i=0;i<=temp;i++){
            if(s.charAt(i)=='C'){
                arr[0]++;}
            else if(s.charAt(i)=='H'){
                arr[1]++;
            }
            else if(s.charAt(i)=='E'){
                arr[2]++;
            }
            else{
                if(arr[0]-1>=0&&arr[1]-1>=0&&arr[2]-1>=0){
                temp1++;
                arr[0]--;
                arr[1]--;
                arr[2]--;
                }
            }
        }
        System.out.println(temp1);
    }
}
            