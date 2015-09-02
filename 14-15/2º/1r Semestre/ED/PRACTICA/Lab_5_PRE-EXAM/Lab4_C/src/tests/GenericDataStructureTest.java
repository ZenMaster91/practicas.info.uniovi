package tests;

import static org.junit.Assert.*;

import java.awt.Container;

import org.junit.Test;

import containers.GenericDataStructure;

public class GenericDataStructureTest {

	@Test
	public void test() {
		GenericDataStructure<String> a = new GenericDataStructure<String>();
		a.add("String één");
		a.add("String twee");
		System.out.println(a.toString());
		System.out.println(a.compareTwoElements(1, 0));
		
		GenericDataStructure<Integer> b = new GenericDataStructure<Integer>();
		b.add(2);
		b.add(4);
		System.out.println(b.toString());
		System.out.println(b.compareTwoElements(1, 0));
		
		//GenericDataStructure<Container> c = new GenericDataStructure<Container>();
		
	}

}
