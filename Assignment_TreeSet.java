package phase1.core.programs;

import java.util.TreeSet;

public class Assignment_TreeSet {

	public static void main(String[] args) {

		 TreeSet<String> treeSet = new TreeSet<String>();
		 treeSet.add("Java");
		 treeSet.add("C-Lang");
		 treeSet.add("Python");
		 treeSet.add("JavaScript");
		 treeSet.add("C++");
		 treeSet.add("DotNet");
		 
		 System.out.println("TreeSet is : " + treeSet);
		 
		 treeSet.remove("Python");
		 treeSet.remove("C-Lang");
		 
		 treeSet.add("Ruby");
		 treeSet.add("SQL");
		 treeSet.add("Kotlin");
		 System.out.println("TreeSet after adding and removing elements : "+treeSet);
		 
		 System.out.println("Java is in the Treeset? :"+treeSet.contains("Java"));
		 treeSet.removeAll(treeSet);
		 System.out.println("TreeSet after removing all the elements : "+treeSet);
		 

	}

}
