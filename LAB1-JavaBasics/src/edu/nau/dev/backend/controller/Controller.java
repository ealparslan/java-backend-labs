package edu.nau.dev.backend.controller;

import edu.nau.dev.backend.structures.ArrayBasedQueue;
import edu.nau.dev.backend.structures.ArrayBasedStack;
import edu.nau.dev.backend.structures.BasicRecord;
import edu.nau.dev.backend.structures.IQueue;
import edu.nau.dev.backend.structures.IStack;

public class Controller {

	public static void main(String[] args) {
	
		IStack arrStack = new ArrayBasedStack();
		IQueue arrQueue = new ArrayBasedQueue();
		
		BasicRecord rec1 = new BasicRecord();
		rec1.id = 112;
		rec1.name = "john";
		rec1.telephoneNumber = "324234323";
		
		BasicRecord rec2 = new BasicRecord();
		rec2.id = 113;
		rec2.name = "mary";
		rec2.telephoneNumber = "345345345";
		
		BasicRecord rec3 = new BasicRecord();
		rec3.id = 114;
		rec3.name = "veli";
		rec3.telephoneNumber = "654645455";
		
		arrQueue.enqueue(rec1);
		arrQueue.enqueue(rec2);
		arrQueue.enqueue(rec3);
		
		arrStack.push(rec1);
		arrStack.push(rec2);
		arrStack.push(rec3);
		
		arrQueue.dequeue();
		arrStack.pop();
		
		System.out.println(arrQueue.printQueue());
		System.out.println(arrStack.printStack());
		
	}

}
