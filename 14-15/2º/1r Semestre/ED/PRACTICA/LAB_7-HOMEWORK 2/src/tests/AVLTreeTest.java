/**
 * 05.11.14 02.33
 * Guillermo_Facundo_Colunga
 * UO236856
 */
package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import AVLTree.AVLNode;
import AVLTree.AVLTree;


public class AVLTreeTest {
	@Before
	public void beforeTest()
	{
		System.out.println("---------------------------------\n");
		System.out.println("Test Class: "+getClass());
		System.out.println("Author: Guillermo Facundo Colunga");
		System.out.println("AuthorID: UO236856\n");
		System.out.println("---------------------------------\n\n");
	}
	@After
	public void afterTest()
	{
		System.out.println("-------------------------------------------\n");
		System.out.println("        END OF THE METHOD TEST TEST\n");
		System.out.println("-------------------------------------------\n\n");
	}
	
	/**
	 * Test for the toString method. Creates a new AVL tree, adds some nodes and runs the method for some of them.
	 * After that checks that the methos is runing properly.
	 * @expected Exception when adding a null node.
	 * @throws Exception
	 */
	@Test (expected=Exception.class)
	public void toStringTest() throws Exception
	{
		System.out.println("------------- Inicializing the toStringTest() method -------------\n");
		AVLTree<Character> a = new AVLTree<Character>();

		//Possitive testing
		a.add('b');
		System.out.println(a.toString());
		assertEquals("b(0)--", a.toString());
		a.add('a');
		System.out.println(a.toString());
		assertEquals ("b("+a.getRoot().getBF()+")a(0)---", a.toString());
		a.add('c');
		System.out.println(a.toString()+"\n");
		assertEquals ("b("+a.getRoot().getBF()+")a(0)--c(0)--", a.toString());
	
		System.out.println("------------- Ending OK the toStringTest() method -------------\n");
		//Negative testing ( NOT NECESSARY )
		
		//We launch an exception and then we chechk if the method add works properly.
		a.add(null);
		System.out.println(a.toString());
		assertEquals ("b("+a.getRoot().getBF()+")a(0)--c(0)--", a.toString());
	}
	
	/**
	 * Test for the search method. Creates a new AVL tree, adds some nodes and runs the method for some of them that exists
	 * and also for some of them that does not exists and for some exceptions.
	 * @throws Exception
	 */
	@Test
	public void searchTest() throws Exception {
		System.out.println("------------- Inicializing the searchTest() method -------------\n");
		//Creating a tree.
		AVLTree<Character> b = new AVLTree<Character>();
		
		//Some nodes to the AVL tree b.
		b.add('b');
		b.add('a');
		b.add('c');
		b.add('f');
		System.out.println("Current working tree: "+b.toString()+"\n");
		assertEquals ("b("+b.getRoot().getBF()+")a(0)--c("+b.getRoot().getRight().getBF()+")-f(0)--", b.toString());
		
		//Possitive testing
		System.out.println("Positive testing starting... ");
		assertEquals(true, b.search('c'));
		System.out.println("The result of searching 'c' is.... "+b.search('c')+" | assertEquals : true");
		assertEquals(true, b.search('b'));
		System.out.println("The result of searching 'b' is.... "+b.search('b')+" | assertEquals : true");
		assertEquals(true, b.search('a'));
		System.out.println("The result of searching 'a' is.... "+b.search('a')+" | assertEquals : true");
		assertEquals(true, b.search('f'));
		System.out.println("The result of searching 'f' is.... "+b.search('f')+" | assertEquals : true"+"\n");
		
		//Negative testing
			//1srt - Part with assertNotEquals.
		System.out.println("Negative testing starting... ");
		System.out.println("1srt - Part ");
		assertNotSame(false, b.search('c'));
		System.out.println("The result of searching 'c' is.... "+b.search('c')+" | assertNotSame : false");
		assertNotSame(false, b.search('b'));
		System.out.println("The result of searching 'b' is.... "+b.search('b')+" | assertNotSame : false");
		assertNotSame(false, b.search('a'));
		System.out.println("The result of searching 'a' is.... "+b.search('a')+" | assertNotSame : false");
		assertNotSame(false, b.search('f'));
		System.out.println("The result of searching 'f' is.... "+b.search('f')+" | assertNotSame : false"+"\n");
		
		//2nd - Part with assertEquals and trying exceptions.
		System.out.println("2nd - Part ");
		assertEquals(false, b.search('g'));
		System.out.println("The result of searching 'g' is....  "+b.search('g')+" | assertEquals : false");
		assertEquals(false, b.search(null));
		System.out.println("The result of searching 'null' is.... "+b.search(null)+" | assertEquals : false");
		assertEquals(false, b.search(' '));
		System.out.println("The result of searching ' ' is.... "+b.search(' ')+" | assertEquals : false");
		assertEquals(false, b.search('0'));
		System.out.println("The result of searching '0' is.... "+b.search('0')+" | assertEquals : false");
		assertEquals(false, b.search('/'));
		System.out.println("The result of searching '/' is.... "+b.search('/')+" | assertEquals : false");
		assertEquals(false, b.search('@'));
		System.out.println("The result of searching '@' is.... "+b.search('@')+" | assertEquals : false"+"\n");
		
		System.out.println("------------- Ending OK the searchTest() method -------------\n");
	}
	
	@Test
	public void searchReturnTest() throws Exception {
		System.out.println("------------- Inicializing the searchReturnTest() method -------------\n");
		//Creating a tree.
		AVLTree<Character> c = new AVLTree<Character>();
		
		//Some nodes to the AVL tree c.
		c.add('b');
		c.add('a');
		c.add('c');
		c.add('f');
		System.out.println("Current working tree: "+c.toString()+"\n");
		assertEquals ("b("+c.getRoot().getBF()+")a(0)--c("+c.getRoot().getRight().getBF()+")-f(0)--", c.toString());
		
		//Possitive testing
		System.out.print("Positive testing starting... ");
		assertEquals(c.getRoot().getElement(), c.searchReturn('b'));
		assertEquals(c.getRoot().getLeft().getElement(), c.searchReturn('a'));
		assertEquals(c.getRoot().getRight().getElement(), c.searchReturn('c'));
		assertEquals(c.getRoot().getRight().getRight().getElement(), c.searchReturn('f'));
		System.out.println("PASSED");
		
		//Negative testing
		System.out.print("Negative testing starting... ");
		assertNotSame(c.getRoot().getElement(), c.searchReturn('c'));
		assertNotSame(c.getRoot().getElement(), c.searchReturn('a'));
		assertNotSame(c.getRoot().getRight().getRight().getElement(), c.searchReturn('b'));
		System.out.println("PASSED");
		
		//All test OK
		System.out.println("Possitive and negative tests... PASSED\n");
		
		System.out.println("------------- Ending OK the searchReturnTest() method -------------\n");
	}
	
	@Test
	public void getMaxTest() throws Exception
	{
		System.out.println("------------- Inicializing the getMaxTest() method -------------\n");
		//Creating a tree.
		AVLTree<Character> d = new AVLTree<Character>();
	
		//Some nodes to the AVL tree c.
		d.add('b');
		d.add('a');
		d.add('d');
		d.add('c');
		System.out.println("Current working tree: "+d.toString()+"\n");
		
		//Possitive testing
		System.out.print("Positive testing starting... ");
		assertEquals('d', (char) d.getMax());
		System.out.println("PASSED");
		
		//Negative Testing
		System.out.print("Negative testing starting... ");
		assertNotSame('a', (char) d.getMax());
		assertNotSame('b', (char) d.getMax());
		assertNotSame('c', (char) d.getMax());
		System.out.println("PASSED\n");
		
		System.out.println("------------- Ending OK the getMaxTest() method -------------\n");
	}
	
	@Test
	public void removeTest() throws Exception
	{
		System.out.println("------------- Inicializing the removeTest() method -------------\n");
		//Creating a tree.
		AVLTree<Character> e = new AVLTree<Character>();
	
		e.add('b');
		e.add('a');
		e.add('d');
		e.add('c');
		assertEquals ("b("+e.getRoot().getBF()+")a("+e.getRoot().getLeft().getBF()+")--d("+e.getRoot().getRight().getBF()+")c(0)---", e.toString());
		System.out.println("Current working tree: "+e.toString()+"\n");
		System.out.println("Removing... d"+"\n");
		e.remove('d');
		assertEquals ("b(1)a(0)--c(0)--", e.toString());
		System.out.println("Current working tree: "+e.toString()+"\n");
		System.out.println("Removing... a"+"\n");
		e.remove('a');
		assertEquals ("b(1)-c(0)--", e.toString());
		System.out.println("Current working tree: "+e.toString()+"\n");
		System.out.println("Removing... b"+"\n");
		e.remove('b');
		assertEquals ("c(0)--", e.toString());
		System.out.println("Current working tree: "+e.toString()+"\n");
		
		
		System.out.println("------------- Ending OK the removeTest() method -------------\n");
	}
	
	@Test
	public void updateHeightTest() throws Exception
	{
		System.out.println("------------- Inicializing the updateHeightTest() method -------------\n");
		//Creating a tree
		AVLTree<Character> f = new AVLTree<Character>();
		
		f.add('b');
		assertEquals ("b(0)--", f.toString());
		assertEquals (0, f.getRoot().getHeight());
		System.out.println("Current working tree: "+f.toString()+"\n");
		System.out.println("Current root height (b): "+f.getRoot().getHeight()+"\n");
		
		f.add('a');
		assertEquals (1, f.getRoot().getHeight());
		assertEquals (0, f.getRoot().getLeft().getHeight());
		assertEquals ("b("+f.getRoot().getBF()+")a(0)---", f.toString());
		System.out.println("Current working tree: "+f.toString()+"\n");
		System.out.println("Current root height (b): "+f.getRoot().getHeight()+"\n");
		System.out.println("Current (a) height: "+f.getRoot().getLeft().getHeight()+"\n");
		
		f.add('d');
		assertEquals (1, f.getRoot().getHeight());
		assertEquals (0, f.getRoot().getLeft().getHeight());
		assertEquals (0, f.getRoot().getRight().getHeight());
		assertEquals ("b("+f.getRoot().getBF()+")a("+f.getRoot().getLeft().getBF()+")--d(0)--", f.toString());
		System.out.println("Current working tree: "+f.toString()+"\n");
		System.out.println("Current root height (b): "+f.getRoot().getHeight()+"\n");
		System.out.println("Current (a) height: "+f.getRoot().getLeft().getHeight()+"\n");
		System.out.println("Current (d) height: "+f.getRoot().getRight().getHeight()+"\n");
		
		f.add('c');
		assertEquals (2, f.getRoot().getHeight());
		assertEquals (0, f.getRoot().getLeft().getHeight());
		assertEquals (1, f.getRoot().getRight().getHeight());
		assertEquals (0, f.getRoot().getRight().getLeft().getHeight());
		assertEquals ("b("+f.getRoot().getBF()+")a("+f.getRoot().getLeft().getBF()+")--d("+f.getRoot().getRight().getBF()+")c(0)---", f.toString());
		System.out.println("Current working tree: "+f.toString()+"\n");
		System.out.println("Current root height (b): "+f.getRoot().getHeight()+"\n");
		System.out.println("Current (a) height: "+f.getRoot().getLeft().getHeight()+"\n");
		System.out.println("Current (d) height: "+f.getRoot().getRight().getHeight()+"\n");
		System.out.println("Current (c) height: "+f.getRoot().getRight().getLeft().getHeight()+"\n");
		
		System.out.println("------------- Ending OK the updateHeightTest() method -------------\n");
	}
	
	@Test
	public void getBFTest() throws Exception
	{
		System.out.println("------------- Inicializing the getBFTest() method -------------\n");
		//Creating a tree
		AVLTree<Character> g = new AVLTree<Character>();
		
		g.add('b');
		assertEquals (0, g.getRoot().getBF());
		assertEquals ("b("+g.getRoot().getBF()+")--", g.toString());
		System.out.println("Current working tree: "+g.toString()+"\n");
		g.add('a');
		assertEquals (-1, g.getRoot().getBF());
		assertEquals ("b("+g.getRoot().getBF()+")a(0)---", g.toString());
		System.out.println("Current working tree: "+g.toString()+"\n");
		g.add('c');
		assertEquals (0, g.getRoot().getBF());
		assertEquals ("b("+g.getRoot().getBF()+")a(0)--c(0)--", g.toString());
		System.out.println("Current working tree: "+g.toString()+"\n");
		g.add('f');
		assertEquals (1, g.getRoot().getBF());
		assertEquals ("b("+g.getRoot().getBF()+")a(0)--c(1)-f(0)--", g.toString());
		System.out.println("Current working tree: "+g.toString()+"\n");
		g.add('g');
		assertEquals (2, g.getRoot().getBF());
		assertEquals ("b("+g.getRoot().getBF()+")a(0)--c(2)-f(1)-g(0)--", g.toString());
		System.out.println("Current working tree: "+g.toString()+"\n");
		
		System.out.println("------------- Ending OK the getBFTest() method -------------\n");
	}
	
	/*
	 * By the moment this Test does not work.
	 */
	@Test @Ignore
	public void joinTest() throws Exception
	{
		System.out.println("------------- Inicializing the joinTest() method -------------\n");
		//Creating some trees
		AVLTree<Character> a = new AVLTree<Character>();
		AVLTree<Character> b = new AVLTree<Character>();
		AVLTree<Character> c = new AVLTree<Character>();
		//a.add('a');
		//b.add('c');
		//b.add('d');
		c=a.joins(b);
		System.out.println("Current working tree ( a ): "+a.toString()+"\n");
		System.out.println("Current working tree ( b ): "+b.toString()+"\n");
		System.out.println("Current working tree ( c ): "+c.toString()+"\n");
		assertEquals("",c.toString());
		System.out.println("------------- Inicializing the joinTest() method -------------\n");
	}
	
	@Test
	public void singleLeftRotation() throws Exception
	{
		//Creating a tree.
		AVLTree<Character> a = new AVLTree<Character>();
		
		//Adding some nodes.
		a.add('a');
		a.add('b');
		a.add('c');
		a.add('d');
		a.add('e');
		a.add('f');
		//a.getRoot().updateBFP(a.getRoot());
		//Testing
		assertEquals("d(0)b(0)a(0)--c(0)--e(1)-f(0)--", a.toString());
	}
}
