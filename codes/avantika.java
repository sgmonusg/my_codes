import java.util.*;

public class avantika{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int t=sc.nextInt();
        int i=0;
        while(i<t){
            int n=sc.nextInt();
            int []arr=new int[n];
            int j;
            for(j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }
            int m=sc.nextInt();
            for(j=0;j<m;j++){
                int[] arr1=new int[2];
                int k;
                for(k=0;k<2;k++){
                    arr1[k]=sc.nextInt();
                }
                int a=arr1[0];
                int l=arr1[1]-arr1[0]+1;
                int[] arr2=new int[l];
                for(k=0;k<l;k++){
                    arr2[k]=arr[a];
                    a++;
                }
                Arrays.sort(arr2);
                k=0;
                a=1;
                while(k<arr2.length){
                    if(arr2[k]==arr2[a]){
                        k++;
                    }
                    else{
                        arr2[++a]=arr2[i++];
                    }
                }
                //sort arr2 and remove duplicates
                //let that be arr3
                int sum=0;
                a=1;
                for(k=0;k<arr2.length;k++){
                    arr2[k]=a*arr2[k];
                    a++;
                }
                for(k=0;k<arr2.length;k++){
                    sum=arr2[k]+sum;
                }
                System.out.println(sum);
            }
            i++;
        }
    }
}