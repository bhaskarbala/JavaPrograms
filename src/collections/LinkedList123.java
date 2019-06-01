package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList123
{
	public static void main(String[] args) {
		LinkedList <Books>l=new LinkedList<Books>();
		l.add(new Books(111,"Java","JameGrosliy"));
		l.add(new Books(222,"Computer","CharalseBobbyji"));
		l.add(new Books(333,"Selenium","ThrouughWorks"));
		l.addFirst(new Books(555,"null","Ra"));
		l.addFirst(new Books(559,"null","Ra"));
		l.addFirst(new Books(557,"Null","RA"));
		l.addFirst(new Books(558,"null","Ra"));
		l.addFirst(new Books(556,"null","Ra"));
		// Object are available are not in whether check to use iterators
		ListIterator <Books>it=l.listIterator();
		
		
		
		it.add(new Books(121,"121","454"));
		while(it.hasNext()) {
			Books b=it.next();
			if(b.bookName.equals("null")) {
				it.remove();
			}
			
		}
		
		//For each loop
		for(Books ll:l) {
			System.out.println(ll.bookId+" "+ll.bookAuthor+" "+ll.bookName);
		}
		
		
	}

}
