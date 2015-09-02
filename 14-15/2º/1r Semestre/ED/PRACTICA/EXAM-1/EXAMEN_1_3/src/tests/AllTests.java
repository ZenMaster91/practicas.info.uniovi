/*
 * GUILLERMO_FACUNDO_COLUNGA
 * UO236856
 */
package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ContainerTest.class, GenericDataStructureTest.class,
		GraphNodeTest.class, GraphTest.class,
		L5_Graph_Dijkstra_sampleTest.class, SuperContainerTest.class,
		testFloyd.class })
public class AllTests {

}
