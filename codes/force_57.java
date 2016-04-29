import java.util.*;
public class force_57{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int temp=0;
        long min=1000000000;
        long sum=0;
        int flag=0;
        for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();

                if(arr[i]%2==0){
                    sum=sum+arr[i];
                }
                else{
                        if(arr[i]<min){
                            min=arr[i];
                        }
                        if(flag==0){
                            temp=arr[i];
                            flag=1;
                        }
                        else{
                           sum=sum+arr[i]+temp;
                           flag=0;
                        }
                }

            }
            if(flag==1){
                if(temp>min){
                    sum=sum-min+temp;
                }
            }
            System.out.println(sum);
        }
    }
