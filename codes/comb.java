import java.util.*;
public class comb{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int fac=1;
        if(n==1){
            System.out.println(20);
        }
        else{
            for(i=1;i<=(3*n);i++){
                fac=fac*i;
        }
                 int nCk = 1;
                 for (int k = 0; k <=3; k++) {
                     nCk = nCk * (((3*n)-k)/(k+1));
        }
                 nCk=nCk*7;
                 System.out.println((fac-nCk));
        }
    }
}
