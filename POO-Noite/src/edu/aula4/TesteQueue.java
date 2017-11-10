package edu.aula4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.DelayQueue;

public class TesteQueue {

	public static void main(String[] args) {
		Deque<String> q = new ArrayDeque<>();	
		
		q.add("A");
		q.add("B");
		q.add("C");
		q.add("D");
		
		System.out.println( q.pollLast() );
		System.out.println( q.pollLast() );
		System.out.println( q.pollLast() );
		System.out.println( q.pollLast() );
		
	}

}
