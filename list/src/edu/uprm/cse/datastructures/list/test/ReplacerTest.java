package edu.uprm.cse.datastructures.list.test;

import edu.uprm.cse.datastructures.list.ArrayList;
import edu.uprm.cse.datastructures.list.List;

public class ReplacerTest {
	
	private static List<String> names = new ArrayList<String>();
	
	public static void main(String[] args) {
		//setup
		names.add("Bob");
		names.add("Joe");
		names.add("Bob");
		names.add("Ned");
		names.add("Bob");
		names.add("Ned");
		
		int changes = Replacer(names, "Bob", "Jil");
		System.out.println(changes);
		Object[] result = names.toArray();
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static int Replacer(List<String> L, String X, String Y) {
		int count = 0;
		for (int i = 0; i < L.size(); i++) {
			if(L.get(i).equals(X)) {
				L.remove(i);
				L.add(Y, i);
				count++;
			}
		}
		return count;
	}

}
