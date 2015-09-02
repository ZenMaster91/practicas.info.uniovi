package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import BinaryHeap.BinaryHeap;

public class BinaryHeapTest {

	@Test
	public void addTest(){
	
		BinaryHeap<Integer> a = new BinaryHeap<Integer>();
		a.add(10);
		a.add(9);
		a.add(8);
		//a.print();
		assertTrue(a.toString().equals("[8, 10, 9]"));
		a.add(7);
		//a.print();
		assertTrue(a.toString().equals("[7, 8, 9, 10]"));
		a.add(6);
		//a.print();
		assertTrue(a.toString().equals("[6, 7, 9, 10, 8]"));
		a.add(5);
		//a.print();
		assertTrue(a.toString().equals("[5, 7, 6, 10, 8, 9]"));
		a.add(4);
		//a.print();
		assertTrue(a.toString().equals("[4, 7, 5, 10, 8, 9, 6]"));
		a.add(2);
		//a.print();
		assertTrue(a.toString().equals("[2, 4, 5, 7, 8, 9, 6, 10]"));
	}

	@Test
	public void getMin()
	{
		
		BinaryHeap<Integer> heap = new BinaryHeap<Integer>();
		heap.add(9);
		heap.add(8);
		heap.add(7);
		heap.add(6);
		heap.add(5);
		heap.add(1);
		heap.add(2);
		heap.add(3);
		heap.add(4);
		       
		System.out.print("Before executing...");
		heap.print();
		assertEquals(heap.toString(), "[1, 3, 2, 4, 7, 8, 5, 9, 6]");
		assertEquals (1, (int) heap.getMin());
		System.out.print("After executing... ");
		heap.print();
		assertEquals(heap.toString(), "[2, 3, 5, 4, 7, 8, 6, 9]");

	}
}
