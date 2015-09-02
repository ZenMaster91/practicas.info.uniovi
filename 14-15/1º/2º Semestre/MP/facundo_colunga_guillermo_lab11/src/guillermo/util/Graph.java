/**
 * 05.11.14 02.33
 * Guillermo_Facundo_Colunga
 * UO236856
 */
package guillermo.util;

import java.util.ArrayList;

public class Graph<T> {
	// Graph attributes
	private ArrayList<GraphNode<T>> nodes;
	private boolean[][] edges;
	private double[][] weight;
	private int size;
	// FLOYD attributes
	private double[][] A;
	private int[][] P;
	// DIJKSTRA attributes
	private double[] D;
	private int[] PD;
	// Constants
	public final static int INDEX_NOT_FOUND = -1;
	public final static Double MAX_NUMBER = Double.MAX_VALUE;

	/**
	 * Constructor that creates a graph with n nodes. At the moment of creation,
	 * the nodes will be empty.
	 * 
	 * @param n
	 *            Number of nodes.
	 * @throws Exception
	 */
	public Graph(int n) {
		if (n > 0) {

			nodes = new ArrayList<GraphNode<T>>();

			edges = new boolean[n][n];
			weight = new double[n][n];
			size = 0;
		}
	}

	/**
	 * Returns the element stored in the graph node of the selected index
	 * 
	 * @param index
	 * @return T element stored in position "index".
	 */
	public T getElement(int index) {
		if (index < 0 || index >= size)
			throw new IllegalArgumentException("Wrong index");
		return nodes.get(index).getElement();
	}

	/**
	 * Returns the number of elements in the graph.
	 * 
	 * @return number of elements in the graph.
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Returns the adjacency matrix for the graph. The first element is the
	 * origin and the second one the destination. If the content of a cell is
	 * true, it means there's a connection.
	 * 
	 * @return Adjacency matrix for the graph.
	 */
	public boolean[][] getEdges() {
		return edges;
	}

	/**
	 * Returns the weight matrix for the graph.
	 * 
	 * @return Weight matrix of the graph.
	 */
	public double[][] getWeight() {
		return weight;
	}

	/**
	 * Returns the index of an element. If the element is not in the graph, -1
	 * will be returned.
	 * 
	 * @param element
	 *            Object to be found in the graph.
	 * @return Index of the element.
	 */
	public int getNode(T element) {
		for (int i = 0; i < size; i++) {
			if (getElement(i).equals(element))
				return i;
		}

		return INDEX_NOT_FOUND;
	}

	/**
	 * Adds a new element to the graph.
	 * 
	 * @param element
	 * @throws Exception
	 */
	public void addNode(T element) throws Exception {
		for (GraphNode<T> node : nodes) {
			if (node.getElement().equals(element))
				throw new Exception("Element is already in the graph.");
		}

		nodes.add(new GraphNode<T>(element));
		this.size += 1;
	}

	/**
	 * Creates an edge between two existing nodes given the elements they
	 * contain.
	 * 
	 * @param origin
	 * @param dest
	 * @param weight
	 * @throws Exception
	 */
	public void addEdge(T origin, T dest, double weight) throws Exception {
		this.weight[getNode(origin)][getNode(dest)] = weight;
		edges[getNode(origin)][getNode(dest)] = true;
	}

	/**
	 * Returns true if there is an edge in a certain direction given the
	 * elements in the origin and destination node.
	 * 
	 * @param origin
	 * @param dest
	 * @return
	 * @throws Exception
	 */
	public boolean existsEdge(T origin, T dest) throws Exception {
		return edges[getNode(origin)][getNode(dest)];
	}


	// METHODS II
	/**
	 * Traverses the graph starting from a selected element and returns the
	 * string representing the path that was taken.
	 * 
	 * @param element
	 * @return string representing the path that.
	 */
	public String traverseGraphDF(T element) {
		for (GraphNode<T> node : nodes) {
			node.setVisited(false);
		}
		int v = getNode(element);
		return (DFPrint(v));
	}

	/**
	 * Internal method used by traverseGraphDF() implementing its main
	 * functionality.
	 * 
	 * @param v
	 *            starting node index
	 * @return String that traverseGraphDF should return
	 */
	private String DFPrint(int v) {
		nodes.get(v).setVisited(true);
		String aux = (getElement(v).toString());
		for (int i = 0; i < size; i++) {
			if (edges[v][i] && !nodes.get(i).isVisited())
				aux += "-" + DFPrint(i);
		}

		return aux;
	}


	// METHODS III
	/**
	 * Removes a node from the graph.
	 * 
	 * TO DO: Test
	 * 
	 * @param element
	 *            Element stored in the node to be removed.
	 * @throws Exception
	 *             Throws an exception if the node doesn't exist.
	 */
	public void removeNode(T element) throws Exception {
		int index = getNode(element);
		if (index < 0)
			throw new Exception("Attempting to remove a non existing node");

		nodes.remove(index);
		for (int i = index; i < size; i++) {
			for (int j = 0; j < size; j++) {
				weight[i][j] = weight[i + 1][j];
				weight[j][i] = weight[j][i + 1];
				edges[i][j] = edges[i + 1][j];
				edges[j][i] = edges[j][i + 1];
			}
			weight[i][i] = weight[i + 1][i + 1];
			edges[i][i] = edges[i + 1][i + 1];
		}
		size--;
	}

	/**
	 * Removes an edge between two nodes.
	 * 
	 * @param origin
	 *            Element contained in the node that's the starting point of the
	 *            edge.
	 * @param dest
	 *            Element contained in the node that's the end point of the
	 *            edge.
	 * @throws Exception
	 *             Throws and exception if the edge does not exist.
	 */
	public void removeEdge(T origin, T dest) throws Exception {
		if (!existsEdge(origin, dest))
			throw new Exception("There's no edge between the selected nodes");

		edges[getNode(origin)][getNode(dest)] = false;
		weight[getNode(origin)][getNode(dest)] = 0.0;
	}


	// FLOYD ALGORITHM
	/**
	 * Returns matrix A from Floyd's algorithm. Contains the minimum cost of
	 * going to any node from any other node.
	 * 
	 * @return Floyd's A matrix
	 */
	public double[][] getA() {
		return A;
	}

	/**
	 * Returns matrix P from Floyd's algorithm. Contains the previous node that
	 * must be visited to get to any node from any other node.
	 * 
	 * @return Floyd's P matrix
	 */
	public int[][] getP() {
		return P;
	}

	/**
	 * Returns a string containing the path with the minimum cost to get from
	 * one node to a different one using Floyd's algorithm
	 * 
	 * @param departure
	 *            node
	 * @param destination
	 *            node
	 * @return string describing the minimum cost path.
	 */
	public String printFloydPath(T departure, T destination) {
		if (departure.equals(destination))
			return departure.toString();

		int start = getNode(departure);
		int end = getNode(destination);
		int step = P[start][end];

		// I think the following two lines wouldn't be needed if P didn't have
		// -1 when there's a direct connection.
		if (step == -1 && edges[start][end])
			step = start;

		return printFloydPath(departure, getElement(step))
				+ getElement(end).toString();
	}

	/**
	 * Initializes the A matrix giving it the weight of the edges of going
	 * directly from each node to all the others, with infinite
	 * (Double.MAX_VALUE) if there's no direct connection.
	 */
	private void initFloyd() {
		A = getWeight();
		P = new int[size][size];

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				P[i][j] = -1;
				if (A[i][j] == 0.0 && i != j)
					A[i][j] = MAX_NUMBER;
			}
		}
	}

	/**
	 * Executes the algorithm. Calculates the weight of going from each node to
	 * all the others making a stop through a different node each time. If it's
	 * less than the direct value, the A matrix is updated and the intermediate
	 * node is written in the P matrix.
	 */
	public void floyd(int size) {
		initFloyd();

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				for (int k = 0; k < size; k++) {
					if ((A[i][k] + A[k][j]) < A[i][j]) {
						A[i][j] = (A[i][k] + A[k][j]);
						P[i][j] = k;
						i = 0;
						j = 0;
					}
				}
			}
		}
	}

	// DIIJKSTRA ALGORITHM
	/**
	 * Returns matrix D from Dijkstra's algorithm. Contains the minimum cost of
	 * going to any node from the node the algorithm has been executed over.
	 * 
	 * @return Dijkstra's D matrix
	 */
	public double[][] getD() {
		double[][] aux = new double[1][D.length];
		aux[0] = D;
		return aux;
	}

	/**
	 * Returns matrix P from Dijkstra's algorithm. Contains the previous node
	 * that must be visited to get to any node from the node the algorithm has
	 * been executed over.
	 * 
	 * @return Dijkstra's P matrix
	 */
	public int[] getPD() {
		return PD;
	}

	/**
	 * Initializes Dijkstra's algorithm creating matrices D and P and giving
	 * them the initial values: If there's an edge between two node, D will
	 * contain its weight and P the index of the starting node, otherwise D will
	 * contain infinite and P -1.
	 * 
	 * @param departureNode
	 *            node the execute Dijkstra's algorithm over.
	 */
	private void initDijkstra(T departureNode) {
		D = new double[size];
		PD = new int[size];
		int departureIndex = getNode(departureNode);

		for (int i = 0; i < size; i++) {
			// Constructing D
			if (edges[departureIndex][i])
				D[i] = weight[departureIndex][i];
			else
				D[i] = MAX_NUMBER;
			// Constructing PD
			if (weight[departureIndex][i] > 0)
				PD[i] = departureIndex;
			else
				PD[i] = -1;
		}

		D[getNode(departureNode)] = MAX_NUMBER;
		PD[getNode(departureNode)] = getNode(departureNode);
	}

	/**
	 * Executes Dijkstra's algorithm.
	 * 
	 * @param departureNode node to execute the algorithm over.
	 */
	public void dijkstra(T departureNode) {
		initDijkstra(departureNode);
		boolean[] S = new boolean[size];
		S[getNode(departureNode)] = true;
		int w;

		for (int i = 0; i < size; i++) {
			if (S[i]) {
				for (int e = 0; e < size; e++) {
					if (edges[i][e]) {

						w = getMin(D, S);
						if (w < 0)
							break;
						S[w] = true;

						for (int m = 0; m < size; m++) {
							if (!S[m]) {

								if ((weight[w][m] != 0)
										&& D[w] + weight[w][m] < D[m]) {
									D[m] = D[w] + weight[w][m];
									PD[m] = w;
								}
							}
						}
					}

				}
			}
		}
	}

	/**
	 * Returns the index of the non-visited node with the minimum cost.
	 * 
	 * @param D
	 *            Dijkstra's D vector
	 * @param S
	 *            set of visited nodes
	 * @return non-visited node with the minimum cost.
	 */
	private int getMin(double[] D, boolean[] S) {
		double minCost = MAX_NUMBER;
		int nodeWithMinCost = -1;
		for (int j = 0; j < size; j++) {
			if (!S[j]) {
				if (D[j] < minCost) {
					minCost = D[j];
					nodeWithMinCost = j;
				}
			}
		}
		return nodeWithMinCost;
	}

	// EXAM
	/**
	 * Checks whether a node is strongly connected, i.e. there is a path from
	 * the node to every other node in the graph and at the same time from every
	 * other node to it.
	 * 
	 * @param node
	 *            Node to check
	 * @return whether the node is strongly connected
	 */
	public boolean isStronglyConnected(T node) {
		int index = getNode(node);
		floyd(size);
		boolean result = true;

		for (int i = 0; i < size; i++) {
			if (A[index][i]==MAX_NUMBER && index != i)
				result = false;
			if (A[i][index]==MAX_NUMBER && index != i)
				result = false;
		}

		return result;
	}

}
