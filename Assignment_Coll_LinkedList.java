package phase1.core.programs;

import java.util.Iterator;
import java.util.LinkedList;

public class Assignment_Coll_LinkedList {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("May");
		ll.add("June");
		ll.add("July");
		ll.add("August");
		ll.addFirst("April");
		ll.add("November");

		ll.addLast("December");
		ll.addFirst("January");

		ll.add(1, "March");
		ll.add(1, "February");

		ll.add(8, "September");
		ll.add(9, "October");

		// Printing all the months in the order
		System.out.println("Months in order : " + ll);

		// Printing the even months
		System.out.println("Even months in a year: ");
		for (int i = 1; i < ll.size(); i++) {
			if (i % 2 != 0) {
				System.out.println(ll.get(i));
			}
		}
		// Printing the odd months
		System.out.println("Odd months in a year: ");
		for (int i = 0; i < ll.size(); i++) {
			if (i % 2 == 0) {
				System.out.println(ll.get(i));
			}
		}
		// using iterator to fetch and print all the elements
		System.out.println("Printing all the months using iterator: ");
		Iterator itr = ll.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// Printing first and last month of year together
		System.out.println("First and last month of year together :" + ll.getFirst() + "---" + ll.getLast());

		// Printing the list after Removing my birthday month
		ll.remove("May");
		System.out.println("After removing my birthday month: " + ll);

		// Checking whether the linkedList contains any winter month or not
		System.out.println("Does LinkedList contains any winter month ---'December'? " + ll.contains("December"));

		// Fetching first and last months using peek
		System.out.println("First and last months using peek() :" + ll.peekFirst() + "---" + ll.peekLast());

		// Removing first and last months using poll
		System.out.println("Removing First and last months using poll() :" + ll.pollFirst() + "---" + ll.pollLast());
		System.out.println(ll);

	}

}
