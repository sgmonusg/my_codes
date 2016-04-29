import java.util.*;
public class force_62{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s[][]=new String[100][n];
		int a1[][]=new int[100][n];
		for(int i=0;i<n;i++){
			int a=sc.nextInt();
			arr[a]++;
			if(i<n/2){
			a1[a][arr[a]]=1;
			}
			else
				a1[a][arr[a]]=-1;
			s[a][arr[a]]=sc.next();
		}
		for(int i=0;i<100;i++){
			for(int j=0;j<arr[i];j++){
				if(a1[i][j]==1){
					System.out.println("-"+" ");
				}
				else if(a1[i][j]==-1){
				System.out.print(s[i][j]+" ");
				}
			}
		}
	}
}