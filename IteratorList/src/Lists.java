import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Lists {
	
	public static void main(String[] args) {
		//creating a linked list 
			LinkedList<Integer> linkedlist = new LinkedList<>();
			linkedlist.add(5);
			linkedlist.add(4);
			linkedlist.add(6);
			linkedlist.add(1);
			linkedlist.add(2);
			System.out.println(linkedlist);
		/*
		 * This will add the linkedlist values to the new list which having less values than a 
		 */
		int a=5;
			LinkedList<Integer> newLinkedlist = new LinkedList<>();
			for (Iterator iterator = linkedlist.iterator(); iterator.hasNext();) {
		
				Integer integer = (Integer) iterator.next();
				if(integer<a){
					newLinkedlist.add(integer);
				}
				
			}
			System.out.println(newLinkedlist);
			}
		
		
		
}
