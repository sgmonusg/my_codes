import java.util.*;
public class force_60{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[100];
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			arr[sc.nextInt()]++;
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<arr[i];j++){
				System.out.print(i+" ");
			}
		}
	}
}