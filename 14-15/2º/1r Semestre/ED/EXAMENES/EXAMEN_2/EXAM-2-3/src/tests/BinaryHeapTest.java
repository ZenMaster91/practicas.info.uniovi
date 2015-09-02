package tests;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.junit.Test;

import BinaryHeap.BinaryHeap;

public class BinaryHeapTest {

	@Test
	public void addTest(){
		Integer[] array = {0,1,2,3};
		BinaryHeap<Integer> b = new BinaryHeap<Integer>(array);
		b.print();
		assertTrue(b.toString().equals("[0, 1, 2, 3]"));
		
		Integer[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		BinaryHeap<Integer> c = new BinaryHeap<Integer>(arr);
		c.print();
		assertTrue(c.toString().equals("[1, 2, 5, 4, 3, 9, 6, 10, 7, 8]"));
	
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
		//assertEquals(heap.toString(), "[1, 3, 2, 4, 7, 8, 5, 9, 6]");
		assertEquals (1, (int) heap.getMin());
		System.out.print("After executing... ");
		heap.print();
		//assertEquals(heap.toString(), "[2, 3, 5, 4, 7, 8, 6, 9]");

	}
	
	/**
	 * Martin Test.
	 */
	@Test
	public void test_sort_order_A () {
					
		 Integer[] input = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		 BinaryHeap<Integer> heap = new BinaryHeap<Integer>(input);

		 String result = "";

		 // print elements in sorted order
		 while (!heap.isEmpty()) 
		 {
			 int x = heap.getMin();
			 result += x;
		 }
		 		 
		 assertEquals(result, "12345678910"); 
	}
		
	/**
	 * Martin Test.
	 */
	@Test
	public void test_sort_order_B () {
					
		 BinaryHeap<Integer> heap = new BinaryHeap<Integer>();
		 heap.add(2);
		 heap.add(5);
		 heap.add(1);
			 
		 String result = "";

		 // print elements in sorted order
		 while (!heap.isEmpty()) 
		 {
			 int x = heap.getMin();
			 result += x;
			}
		 
		 assertEquals(result, "125"); 
	}
		
}

