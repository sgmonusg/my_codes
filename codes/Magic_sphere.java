import java.util.*;
public class Magic_sphere{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[3];
        
        int[] arr1=new int[3];
        int i=0;
        int a=0;
        int b=0;
        for(i=0;i<3;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<3;i++){
            arr1[i]=sc.nextInt();
        }
        for(i=0;i<3;i++){
            if(arr[i]>arr1[i]){
               a=a+((arr[i]-arr1[i])/2);
            }
            else{
                b=b+(arr1[i]-arr[i]);
            }
        }
        
        if(a>=b){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
        
                