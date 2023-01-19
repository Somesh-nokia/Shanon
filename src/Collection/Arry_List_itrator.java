package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Arry_List_itrator {
public static void main(String[] args) {
	LinkedList l= new LinkedList();
	l.add ("Ganesh");
	l.add(null);
	l.add (1);
	l.add(10.5);
	l.add(null);
	l.add('A');
	/*
	System.out.println(l);// print entire data
	System.out.println(l.size()); //print size
	System.out.println(l.isEmpty());//false
	System.out.println(l.contains(l));
	System.out.println(l.get(0));
	System.out.println(l.get(3));
	l.add(2,007);// shift right
	System.out.println(l);
	l.remove(2);//shift left
	System.out.println(l); */
	 Iterator itr = l.iterator();
	 while (itr.hasNext()) {
		 System.out.println(itr.next());
	 }
	

}
}
