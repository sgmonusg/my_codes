import java.util.*;
public class force_64{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        for(int k=0;k<y;k++){
		String s=sc.next();
		int n=s.length();
		int arr[]=new int[n+1];
		int j=0;
		int temp=0;
		for(int i=0;i<n;i++){
			if(s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='('){
                j++;
				if(s.charAt(i)=='{'){
					arr[j]=1;
					++j;
				}
				else if(s.charAt(i)=='['){
					arr[j]=2;
  					j++;
				}
				else{
					arr[j]=3;
					j++;
				}
			}
			else{
                j--;
				if(s.charAt(i)=='}'){
                   
					if(arr[j]==1){
					   j--;
                    }
					else{
						temp=-1;
						break;
					}
                    
				}
				else if(s.charAt(i)==']'){
                    
					if(arr[j]==2){
						j--;
					}
					else{
						temp=-1;
						break;
					}
                    
				}
				else{
                  
					if(arr[j]==3){
						j--;
                     
					}
					else{
						temp=-1;
						break;
					}
                   
				}
			}
			
		}
		if(temp==-1){
			System.out.println("NO");
		}
		else
			System.out.println("YES");
	}
}
}