import java.util.*;
import java.math.*;

public final class force_5 {

 static public void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  long k = sc.nextLong();
  long a = sc.nextLong();
  long b = sc.nextLong();

  long firstDivisible = a+(k-a%k)%k;
  System.out.println((b-firstDivisible+1+(k-1))/k);
 }

}