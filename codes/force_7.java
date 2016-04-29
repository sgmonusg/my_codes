import java.util.*;
public class force_7{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[]=new int[m];
        int max=0;
        String temp=sc.nextLine();
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(sc.nextLine());
            int j=0;
            while(st.hasMoreTokens()){
                arr[j]=Integer.parseInt(st.nextToken());
                j++;
            }
            //for(j=0;j<m;j++){
            //System.out.println(arr[j]);
            //}
            Arrays.sort(arr);
            if(arr[0]>max)
                max=arr[0];
        }
        System.out.println(max);
    }
}