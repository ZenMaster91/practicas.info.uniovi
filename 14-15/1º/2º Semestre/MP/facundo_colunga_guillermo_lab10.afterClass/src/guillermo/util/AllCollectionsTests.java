package guillermo.util;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AVLTreeTest.class,
				BinaryHeapTest.class,
				ArrayListTest.class,
				LinkedListTest.class })
public class AllCollectionsTests {

}
