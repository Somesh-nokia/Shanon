package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class Arrylist2 {
	public static void main(String[] args) {
		LinkedList al = new LinkedList();
		al.add("Somesh");
		al.add (1001);
		al.add (1);
		al.add(100); 
		al.add (null);
		
		
		
		//System.out.println(al);
		
		System.out.println(al.get(0));
		System.out.println(al.get(3));
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		al.add(2,1007);
		System.out.println(al);
	    al.remove(2);
	    System.out.println(al);
	
		

		
	}

}
