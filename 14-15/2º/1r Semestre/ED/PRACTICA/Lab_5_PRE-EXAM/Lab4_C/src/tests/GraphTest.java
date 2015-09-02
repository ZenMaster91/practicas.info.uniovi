package tests;
import static org.junit.Assert.*;
import graphs.Graph;

import org.junit.Test;


public class GraphTest {

	@Test
	public void TestEditing() {
		 Graph<Character> g1 = new Graph<Character>(3);
		    
		 System.out.println ("TEST 1 (EDITING) BEGINS ***");
		 assertEquals(0, g1.getSize());
		    
		 try
		 {
			 g1.addNode('a');
		 }
		 catch (Exception e)
		 {
			 System.out.println ("No repeated nodes are allowed" + e);
		 }
		    
		 assertEquals(1, g1.getSize());
		 assertEquals(0,  g1.getNode('a'));
		 assertArrayEquals (new boolean[][]{{false,false,false}, {false,false,false}, {false,false,false}}, g1.getEdges());
		 assertArrayEquals (new double[][]{{0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}}, g1.getWeight());
		
		 
		 
		 // Test nodes for nodes not found
		 assertEquals(Graph.INDEX_NOT_FOUND,  g1.getNode('b'));
		 
		 
		 // No repeated nodes is allowed
		 try
		 {
			 g1.addNode('a');
		 }
		 catch (Exception e)
		 {
			 System.out.println ("No repeated nodes are allowed" + e);
		 }
		 
		 
		 try
		 {
			 g1.addNode('b');
			 g1.addNode('c');
		 }
		 catch (Exception e)
		 {
			 System.out.println ("No repeated nodes are allowed" + e);
		 }

		 assertEquals(3, g1.getSize());
		 assertEquals(0, g1.getNode('a'));
		 assertEquals(1, g1.getNode('b'));
		 assertEquals(2, g1.getNode('c'));
			
		 assertArrayEquals (new boolean[][]{{false,false,false}, {false,false,false}, {false,false,false}}, g1.getEdges());
		 assertArrayEquals (new double[][]{{0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}}, g1.getWeight());
		 
		 // Testing edges
		 try
		 {
			 g1.existsEdge('b', 'd');
		 }
		 catch (Exception e)
		 {
			 System.out.println ("Starting|arrival node does not exists" + e);
		 }
		 
		 try
		 {
			 assertEquals (false, g1.existsEdge('b', 'c'));
		 }
		 catch (Exception e)
		 {
			 System.out.println ("Starting or arrival node does not exists" + e);
		 }
		 
		 assertArrayEquals (new boolean[][]{{false,false,false}, {false,false,false}, {false,false,false}}, g1.getEdges());
		 assertArrayEquals (new double[][]{{0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}}, g1.getWeight());
		 
		 try
		 {
			 g1.addEdge ('b', 'c', 5.0);
			 assertEquals (true, g1.existsEdge('b', 'c'));
		 }
		 catch (Exception e)
		 {
			 System.out.println ("Starting or arrival node does not exists" + e);
		 }
		 
		 assertArrayEquals (new boolean[][]{{false,false,false}, {false,false,true}, {false,false,false}}, g1.getEdges());
		 assertArrayEquals (new double[][]{{0.0, 0.0, 0.0}, {0.0, 0.0, 5.0}, {0.0, 0.0, 0.0}}, g1.getWeight());
		 
		 assertEquals ("a"   , g1.traverseGraphDF('a'));
		 assertEquals ("b-c" , g1.traverseGraphDF('b'));
		 
		 try 
		 {
			 g1.addNode('x');
			 g1.addNode('y');
			 g1.addNode('z');
			 assertEquals(3, g1.getNode('x'));
			 assertEquals(4, g1.getNode('y'));
			 assertEquals(5, g1.getNode('z'));
			 
			 
			 try {
			 g1.removeNode('z');
			 assertEquals(-1, g1.getNode('z'));}
			 catch(Exception e) { System.out.println("Exception in line  114"); } try {
			 g1.addEdge ('x', 'y', 4.5);
			 assertEquals (true, g1.existsEdge('x', 'y'));//ask martin for the exception.
			 } catch (Exception e) { System.out.println("Exception in line 118 "); } try {
			 g1.removeEdge('x', 'y');
			 assertEquals (false, g1.existsEdge('x', 'y'));//ask martin for the exception.
			 } catch (Exception e) { System.out.println("Exception in line 120 "); }
			 
			 
		 } catch (Exception e) {
			 System.out.println("Exception:... "+e);
		 }
	}

}

