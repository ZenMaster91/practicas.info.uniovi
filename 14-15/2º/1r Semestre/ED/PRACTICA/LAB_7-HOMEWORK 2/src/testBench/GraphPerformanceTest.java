/**
 * 05.11.14 02.33
 * Guillermo_Facundo_Colunga
 * UO236856
 */
package testBench;

import graphs.Graph;

public class GraphPerformanceTest {

	private static final int MAX_WEIGHT = 100;

	/**
	 * Return a graph of integer element containing n nodes Every node is
	 * connected with each other by an edge of weight calculated as a random
	 * value.
	 * 
	 * @param int n Number of nodes
	 * @return Graph of integer element containing n nodes
	 * @throws Exception if there's an error adding an edge or a node
	 */
	public static Graph<Integer> initGraph(Integer n) throws Exception {
		Graph<Integer> graph = new Graph<Integer>(n);

		for (int i = 0; i < n; i++) {
			graph.addNode(i);
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				graph.addEdge(i, j, (int) Math.random() * MAX_WEIGHT);
			}
		}

		return graph;

	}

	/**
	 * Calls to the initGraph(n) method and applies Dijkstra's algorithm on the
	 * resulting graph.
	 * 
	 * @param n Number of nodes
	 * @throws Exception
	 */
	public static void runDijkstra(Integer n) throws Exception {
		Graph<Integer> graph = initGraph(n);
		for (int i = 0; i < n; i++)
			graph.dijkstra(i);
	}

	/**
	 * Calls to the initGraph(n) method and applies the Dijkstra algorithm on
	 * the resulting graph.
	 * 
	 * @param n Number of nodes
	 * @throws Exception
	 */
	public static void runFloyd(Integer n) throws Exception {
		Graph<Integer> graph = initGraph(n);
		graph.floyd(graph.getSize());

	}

}