import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        int temp=0;
        int i=0;
        int j=0;
        int sum=0;
        int temp1=0;
        int temp2=0;
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                temp=arr[j][i+1]+arr[j][i]+arr[j][i+2];
                if(temp>sum){
                    sum=temp;
                    temp1=j;
                    temp2=i;
                }   
            }
        }
        //System.out.println(temp1);
        //System.out.println(temp2);
        //System.out.println(sum);
        i=temp2;
        int sum1=sum+arr[temp1+1][i+1]+arr[temp1+2][i]+arr[temp1+2][i+1]+arr[temp1+2][i+2];
        sum=0;
        //System.out.println(sum1);
        for(i=1;i<5;i++){
            for(j=1;j<5;j++){
                if(arr[j][i]>sum){
                    sum=arr[i][j];
                    temp1=j;
                    temp2=i;
                }   
            }
        }
        i=temp2;
        temp=sum+arr[temp1-1][i-1]+arr[temp1-1][i]+arr[temp1-1][i+1]+arr[temp1+1][i-1]+arr[temp1+1][i]+arr[temp1+1][i+1];
        if(temp>sum1){
            sum1=temp;
        }
        temp=0;
        sum=0;
        for(i=0;i<4;i++){
            for(j=2;j<6;j++){
                temp=arr[j][i]+arr[j][i+1]+arr[j][i+2];
                if(temp>sum){
                    sum=temp;
                    temp1=j;
                    temp2=i;
                }   
            }
        }
        //System.out.println(sum);
        j=temp1;
        i=temp2;
        int sum2=sum+arr[j-2][i]+arr[j-2][i+1]+arr[j-2][i+2]+arr[j-1][i+1];
        if(sum2>sum1){
            System.out.println(sum2);
            //System.out.println(i);
            //System.out.println(j);
        }
        else{
            System.out.println(sum1);
            //System.out.println(i);
            //System.out.println(j);
        }
        
        
    }
}
