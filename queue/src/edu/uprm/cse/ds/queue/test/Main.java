package edu.uprm.cse.ds.queue.test;

import edu.uprm.cse.ds.queue.DoublyLinkedQueue;
import edu.uprm.cse.ds.queue.Queue;

public class Main {

	public static void main(String[] args) {
		DoublyLinkedQueue<String> test1 = new DoublyLinkedQueue<String>();
		test1.enqueue("Jay");
		test1.enqueue("Mark");
		test1.enqueue("Jay");
		test1.enqueue("Jose");
		test1.enqueue("Jay");
		test1.enqueue("Jay");
		DoublyLinkedQueue<String> test2 = copyQueue(test1);
		deleteFromQueue(test1, "Jay");
	
		while(!test1.isEmpty()) {
			System.out.println(test1.dequeue());
		}
		System.out.println("\n");
		while(!test2.isEmpty()) {
			System.out.println(test2.dequeue());
		}
	}
	public static void deleteFromQueue(Queue<String> Q, String obj) {
		DoublyLinkedQueue<String> temp = new DoublyLinkedQueue<String>();
		while(!Q.isEmpty()) {
			String element  = Q.dequeue();
			if(!element.equals(obj)) {
				temp.enqueue(element);
			}
		}
		while(!temp.isEmpty()) {
			Q.enqueue(temp.dequeue());
		}
	}
	public static DoublyLinkedQueue<String> copyQueue(DoublyLinkedQueue<String> src){
		DoublyLinkedQueue<String> newQueue = new DoublyLinkedQueue<String>();
		DoublyLinkedQueue<String> temp = new DoublyLinkedQueue<String>();
		while(!src.isEmpty()) {
			String element = src.dequeue();
			 newQueue.enqueue(element);
			 temp.enqueue(element);
		}
		while(!temp.isEmpty()) {
			src.enqueue(temp.dequeue());
		}
		return newQueue;
	}
}
