import java.util.*;

public class gcd{
    public static void main(){
        //forming the power sets
        public static <T> Set<Set<T>> powerSet(Set<T> originalSet) {
    Set<Set<T>> sets = new HashSet<Set<T>>();
    if (originalSet.isEmpty()) {
     sets.add(new HashSet<T>());
     return sets;
    }
    List<T> list = new ArrayList<T>(originalSet);
    T head = list.get(0);
    Set<T> rest = new HashSet<T>(list.subList(1, list.size())); 
    for (Set<T> set : powerSet(rest)) {
     Set<T> newSet = new HashSet<T>();
     newSet.add(head);
     newSet.addAll(set);
     sets.add(newSet);
     sets.add(set);
    }  
    return sets;
}
        
        
        
        //forming the gcd for each set
               BigInteger bi1, bi2, bi3;

 // assign values to bi1, bi2
       Scanner sc=new Scanner(System.in);
 bi1 = sc.nextBigInteger();
 bi2 = sc.nextBigInteger();

 // assign gcd of bi1, bi2 to bi3
 bi3 = bi1.gcd(bi2);      
        