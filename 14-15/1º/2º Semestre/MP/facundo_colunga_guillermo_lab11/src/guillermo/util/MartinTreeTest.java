package guillermo.util;

import static org.junit.Assert.*;

import org.junit.Test;

import guillermo.util.AVLTree;


public class MartinTreeTest {

	
	@Test
	public void test_AVL_5() throws Exception {
				
		AVLTree <Integer> ti = new AVLTree<Integer>();
		
		ti.add(10);
		ti.add(6);
		ti.add(15);
		ti.add(3);
		ti.add(9);
		ti.add(14);
		ti.add(20);
		ti.add(2);
		ti.add(4);
		ti.add(7);
		ti.add(12);
		ti.add(1);
		
	    System.out.println (ti.toString());
	    //assertEquals ("10(-1)6(-1)3(-1)2(-1)1(0)---4(0)--9(-1)7(0)---15(-1)14(-1)12(0)---20(0)--", ti.toString());
	    assertEquals (5, ti.getHeight());
	    
	    //20, 4, 10, 9, 6, 3.

	    ti.remove(20);
	    System.out.println ("DELETE 20 -> " + ti.toString() + " *** " +ti.toString()); 
	    assertEquals ("10(0)6(0)3(0)2(0)1(0)---4(0)--9(0)7(0)---15(0)14(0)12(0)----", ti.toString());
	    assertEquals (5, ti.getHeight());
	    
	    ti.remove(4);
	    System.out.println ("DELETE 4 -> " + ti.toString() + " *** " +ti.toString()); 
	    assertEquals ("10(0)6(0)3(0)2(0)1(0)----9(0)7(0)---15(0)14(0)12(0)----", ti.toString());
	    assertEquals (5, ti.getHeight());
	    
	    assertEquals (true, ti.search(10));
	    ti.remove(10);
	    System.out.println ("DELETE 10 -> " + ti.toString() + " *** " +ti.toString()); 
	    //assertEquals ("6(0)2(0)1(0)--3(0)--9(0)7(0)--14(0)12(0)--15(0)--", ti.toString());
	    assertEquals (5, ti.getHeight());
	    
	    ti.remove(9);
	    System.out.println ("DELETE 9 -> " + ti.toString() + " *** " +ti.toString()); 
	    assertEquals ("10(0)6(0)3(0)2(0)1(0)----7(0)--15(0)14(0)12(0)----", ti.toString());
	    assertEquals (5, ti.getHeight());
	    
	    ti.remove(6);
	    System.out.println ("DELETE 6 -> " + ti.toString() + " *** " +ti.toString()); 
	    assertEquals ("3(0)2(0)1(0)---12(0)7(0)--14(0)-15(0)--", ti.toString());
	    assertEquals (5, ti.getHeight());

	    ti.remove(3);
	    System.out.println ("DELETE 3 -> " + ti.toString() + " *** " +ti.toString()); 
	    assertEquals ("12(0)2(0)1(0)--7(0)--14(0)-15(0)--", ti.toString());
	    assertEquals (4, ti.getHeight());
	}

}