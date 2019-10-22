package edu.uprm.cse.datastructures.list.test;

import edu.uprm.cse.datastructures.list.SinglyLinkedList;

public class Main {

	public static void main(String[] args) {
		SinglyLinkedList<String> test1 = new SinglyLinkedList<String>();
		test1.add("Bob");
		test1.add("Charlie");
		test1.add("Jorge");
		test1.add("Ramon");
		test1.add("Zoe");
		
		SinglyLinkedList<String> test2 = new SinglyLinkedList<String>();
		test2.add("Bob");
		test2.add("Charlie");
		test2.add("Abigail");
		test2.add("Jorge");
		test2.add("Jorge");
		test2.add("Ramon");
		test2.add("Abigail");
		System.out.println(isSorted(test1) + "\n");
		System.out.println(isSorted(test2) + "\n");
		removeDuplicates(test2);
		for (String string : test2) {
			System.out.println(string);
		}
	}
	
	public static boolean isSorted(SinglyLinkedList<String> L) {
		for (int i = 0; i < L.size()-1; i++) {
			if(!(L.get(i).compareTo(L.get(i+1)) <= 0)) {
				return false;
			}
		}
		return true;
	}
	public static void removeDuplicates(SinglyLinkedList<String> L){
		for (String string : L) {
			if(L.firstIndexOf(string) != L.lastIndexOf(string)) {
				L.remove(L.lastIndexOf(string));
			}
		}
	}
}
