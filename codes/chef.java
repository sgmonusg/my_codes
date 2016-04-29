import java.util.*;
public class chef{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int temp=n;
            int arr[]=new int[n];
            for(int k=0;k<n;k++){
                arr[k]=sc.nextInt();
            }
            int sum=0;
            int pro=0;
            for(int j=0;j<n-1;j++){
                sum=arr[j];
                pro=arr[j];
                // System.out.println(sum);
                // System.out.println(pro);
                for(int k=j+1;k<n;k++){
                    sum=sum+arr[k];
                    pro=pro*arr[k];
                    
                  //      System.out.println(sum);
                    //    System.out.println(pro);
                    if(sum==pro){
                        temp++;
                      //  System.out.println(sum);
                        //System.out.println(pro);
                    }
                }
            }
            System.out.println(temp);
        }
    }
}
                    
            
        