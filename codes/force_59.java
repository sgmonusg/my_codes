import java.util.*;
public class force_59{
	public static void main(String args[]){
	int arr[]=new int[100];
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=0;i<n;i++){
		arr[sc.nextInt()]++;
	}
	for(int i=0;i<100;i++){
		System.out.print(arr[i]+" ");
	}
	}
}