import java.util.*;
public class force_51 {
    public static void main(String args[])throws Exception{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       String str=br.readLine();
       String str1=br.readLine();
       int n=Integer.parseInt(str);
       StringTokenizer st=new StringTokenizer(str1);
       int arr[]=new int[1000000000];
       int arr1[]=new int[1000000000];
       int b[]=new int[1000000000];
       int c[]=new int[1000000000];
       int temp=0;
       int i=0;int j=0;
       while(st.hasMoreTokens()){
           int a=Integer.parseInt(st.nextToken());
           arr[a]++;
           if(arr[a]==2){
               temp++;
               Arrays.fill(arr,0);
               b[j]=arr1[a];
               c[j]=i+1;
               j++;
           }
           else{
               arr1[a]=i+1;
           }
           i++;
       }
       if(temp==0){
           System.out.println("-1");
       }
       else{
           System.out.println(temp);
           for(i=0;i<temp;i++){
               System.out.println(b[i]+" "+c[i]);
           }
       }
    }
}
               
           
           