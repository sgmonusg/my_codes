import java.util.*;
public class force_35{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i=1;
        int j=1;
        int temp=0;
        for(i=1;i<6;i++){
            for(j=1;j<6;j++){
                if(sc.nextInt()==1){
                    temp=1;
                    break;
                    
                }
                
            }
            if(temp==1){
                    break;
                }
                
        }
        //System.out.println(i);
        //System.out.println(j);
        System.out.println(Math.abs(i-3)+Math.abs(j-3));
    }
}
        