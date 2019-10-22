package edu.uprm.cse.ds.stack.maintest;

import edu.uprm.cse.ds.stack.ArrayStack;

public class Main {

	public static void main(String[] args) {
		ArrayStack<String> test1 = new ArrayStack<String>();
		test1.push("Martin");
		test1.push("Tom");
		test1.push("Martin");
		test1.push("Jerry");
		deleteFromStack(test1, "Martin");
		while(!test1.isEmpty()) {
			System.out.println(test1.pop());
		}
	}
	
	public static void deleteFromStack(ArrayStack<String> S, String obj) {
		ArrayStack<String> temp = new ArrayStack<String>();
		while(!S.isEmpty()) {
			String element = S.pop();
			if(!element.equals(obj)) {
				temp.push(element);
			}
		}
		while(!temp.isEmpty()) {
			S.push(temp.pop());
		}
		
	}

}