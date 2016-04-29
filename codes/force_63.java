import java.util.*;
public class force_63{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int min=Math.abs(arr[1]-arr[0]);
		int a[][]=new int[n][2];
		a[0][0]=arr[0];
		arr[0][1]=arr[1];
		int j=1;
		for(int i=1;i<n-1;i++){
			
			if(arr[i+1]-arr[i]<min){
				min=arr[i+1]-arr[i];
				a[][]={0};
				j=0;
				a[j][0]=arr[i];
				arr[j][1]=arr[i+1];
				j++;
			}
			else if(arr[i+1]-arr[i]==min){
				a[j][0]=arr[i];
				arr[j][1]=arr[i+1];
				j++;
				
			}
			else{
				continue;
			}
		}
		for(int i=0;i<j;i++){
				System.out.print(a[j][0]+" "+a[j][1]);
			}
		}
		
	}
}