import java.util.*;
public class force_61{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[100];
	for(int i=0;i<n;i++){
		arr[sc.nextInt()]++;
		String s=sc.next();
	}
        int sum=0;
	for(int i=0;i<100;i++){
		sum=sum+arr[i];
		System.out.print(sum+" ");
	}
    }
}