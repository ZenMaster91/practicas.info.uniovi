package tests;

import static org.junit.Assert.*;
import graphs.Graph;

import org.junit.Test;


public class MartinTest {

	@Test
			// FIRST EXERCISE ABOUT FLOYD DONE IN THE THEORY CLASS ROOM
			public void TestExercise1() {
				 Graph<String> g = new Graph<String>(6);
				    
				 System.out.println ("TEST (FLOYD EXERCISE) BEGINS ***");
				 assertEquals(0, g.getSize());
				    
				 try
				 {
					 g.addNode("V1");
					 g.addNode("V2");
					 g.addNode("V3");
					 g.addNode("V4");
					 g.addNode("V5");
					 g.addNode("V6");
				 }
				 catch (Exception e)
				 {
					 System.out.println ("No repeated nodes are allowed" + e);
				 }
				    
				 assertEquals(6, g.getSize());
				 assertEquals(0,  g.getNode("V1"));
				 assertEquals(1,  g.getNode("V2"));
				 assertEquals(2,  g.getNode("V3"));
				 assertEquals(3,  g.getNode("V4"));
				 assertEquals(4,  g.getNode("V5"));
				 assertEquals(5,  g.getNode("V6"));
				 assertArrayEquals (new boolean[][]{{false, false, false, false, false, false}, {false, false, false, false, false, false}, {false, false, false, false, false, false}, {false, false, false, false, false, false}, {false, false, false, false, false, false}, {false, false, false, false, false, false}}, g.getEdges());
				 assertArrayEquals (new double[][]{{0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}}, g.getWeight());
				 g.print();
				 
				
				 try
				 {
					 g.addEdge ("V1", "V2", 3.0);
					 g.addEdge ("V1", "V3", 4.0);
					 g.addEdge ("V1", "V5", 8.0);
					 
					 g.addEdge ("V2", "V5", 5.0);
								 
					 g.addEdge ("V3", "V5", 3.0);
					 
					 g.addEdge ("V5", "V6", 3.0);
					 g.addEdge ("V5", "V4", 7.0);
					 
					 g.addEdge ("V6", "V4", 2.0);
				 }
				 catch (Exception e)
				 {
					 System.out.println ("Starting or arrival node does not exists" + e);
				 }
				
				 assertArrayEquals (new boolean[][]{{false, true, true, false, true, false}, {false, false, false, false, true, false}, {false, false, false, false, true, false}, {false, false, false, false, false, false}, {false, false, false, true, false, true}, {false, false, false, true, false, false}}, g.getEdges());
				 assertArrayEquals (new double[][]{{0.0, 3.0, 4.0, 0.0, 8.0, 0.0}, {0.0, 0.0, 0.0, 0.0, 5.0, 0.0}, {0.0, 0.0, 0.0, 0.0, 3.0, 0.0}, {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, {0.0, 0.0, 0.0, 7.0, 0.0, 3.0}, {0.0, 0.0, 0.0, 2.0, 0.0, 0.0}}, g.getWeight());
				 assertEquals ("V1-V2-V5-V4-V6-V3-", g.traverseGraphDF("V1"));
				 g.print();
			
				 ////////////////////////////////////////////////////////////////////////////////////
				 g.floyd(g.getSize());
				 //g.printFloyd();
				 assertArrayEquals (new int[][]{
						 {-1, -1, -1,  5,  2,  4}, 
						 {-1, -1, -1,  5, -1,  4},
						 {-1, -1, -1,  5, -1,  4}, 
						 {-1, -1, -1, -1, -1, -1}, 
						 {-1, -1, -1,  5, -1, -1}, 
						 {-1, -1, -1, -1, -1, -1}}, g.getP());
				 assertArrayEquals (new double[][]{
						 {00.0, 03.0, 04.0, 12.0, 07.0, 10.0}, 
						 {99.0, 00.0, 99.0, 10.0, 05.0, 08.0}, 
						 {99.0, 99.0, 00.0, 08.0, 03.0, 06.0}, 
						 {99.0, 99.0, 99.0, 00.0, 99.0, 99.0}, 
						 {99.0, 99.0, 99.0, 05.0, 00.0, 03.0}, 
						 {99.0, 99.0, 99.0, 02.0, 99.0, 00.0}}, g.getA());
						 
				 
				 try
				 {
					 assertEquals ("V1V3V5V6", "V1" + g.printFloydPath ("V1", "V6") + "V6");
				 }
				 catch (Exception e)
				 {
					 System.out.println ("Starting or arrival node does not exists" + e);
				 } 
				 
				
			}

}

