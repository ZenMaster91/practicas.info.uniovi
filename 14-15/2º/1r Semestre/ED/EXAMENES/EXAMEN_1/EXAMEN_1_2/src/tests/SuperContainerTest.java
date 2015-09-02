/*
 * GUILLERMO_FACUNDO_COLUNGA
 * UO236856
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import containers.Container;
import containers.GenericDataStructure;
import containers.SuperContainer;

public class SuperContainerTest {

	@Test
	public void test() {
		SuperContainer<String, String> sc = new SuperContainer<String, String>(new Container<String>("Contained string"), "Info", 0);
		System.out.println(sc.toString());
	}

}
