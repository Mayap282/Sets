import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Lists {
	
	public static void main(String[] args) {
		
		Employee  e = new Employee();
		
		   List<String> l = new ArrayList<>();
		   l.add("a");
		   l.add("b");
		   l.add("c");
		   l.add("d");
		   
		   //for iterate over collection
		   for (Iterator iterator = l.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.print(string+ " ");
		   }
			
			System.out.println("\n");
			/*for (String str : l) {
				
				System.out.println(l);
				
			}*/
			
			int arr[]={2,100,2,200,45,65,3,4,2,5,6,1};
			//hashset stores the unique values but it may in random order
			Set<Integer> set = new HashSet<>();
			for (int i = 0; i < arr.length; i++) {
				set.add(arr[i]);
			}
			System.out.println(set);
			//treeset stores unique values but always in sorted order
			Set<Integer> set1 = new TreeSet<>(set);
			System.out.println(set1);
			
			
		
	

	}
}
