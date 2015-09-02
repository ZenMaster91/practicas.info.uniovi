package graphs;

import java.util.ArrayList;

public class Graph<T> {
	private ArrayList<GraphNode<T>> nodes;
	private boolean[][] edges;
	private double[][] weight;

	// for floyd
	private double[][] A;
	private int[][] P;

	// for dijkstra
	private double[] D;
	private int[] PD;

	private int size;

	public final static int INDEX_NOT_FOUND = -1;
	public final static double MAX_NUMBER = 99.0;

	/**
	 * Main Constructor
	 * 
	 * @param n Number of nodes.
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
	 * Getter the number of elements in the graph.
	 * 
	 * @return number of elements in the graph.
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Getter the adjacency matrix for the graph. The first element is the
	 * origin and the second one the destination. If true the's a conection,
	 * false otherwise.
	 * 
	 * @return the adjacency matrix for the graph.
	 */
	public boolean[][] getEdges() {
		return edges;
	}

	/**
	 * Getter the weight matrix for the graph.
	 * 
	 * @return theweight matrix of the graph.
	 */
	public double[][] getWeight() {
		return weight;
	}

	
	/**
	 * Getter the index of an element. If the element is not in the graph, -1 ( INDEX_NOT_FOUND ).
	 * 
	 * @param element T Object to be found in the graph.
	 * 
	 * @return Index of the element. If is not found returns -1;
	 */
	public int getNode(T element) {
		for (int i = 0; i < size; i++) {
			if (nodes.get(i).getElement().equals(element))
				return i;
		}

		return INDEX_NOT_FOUND;
	}

	/**
	 * Adds a new element to the graph.
	 * 
	 * @param element
	 * 
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
	 * Creates an edge between two existing nodes given.
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
	 * @return true if exists and edge between the two nodes, false otherwise.
	 * @throws Exception
	 */
	public boolean existsEdge(T origin, T dest) throws Exception {
		return edges[getNode(origin)][getNode(dest)];
	}

	// METHODS II-------------------------------------------------------------
	/**
	 * Set the visited flag for each node to false.
	 * 
	 * @param T element
	 * @return the flag of the node.
	 */
	public String traverseGraphDF(T element) {
		for (GraphNode<T> node : nodes) {
			node.setVisited(false);
		}
		int v = getNode(element);
		return (DFPrint(v));
	}

	/**
	 * This is a inner method that sets the node to true and returns a String with the
	 * path of the graph.
	 * 
	 * @param an integer v, the index of the node.
	 * @return String that is the path that follows the graph.
	 */
	private String DFPrint(int v) {
		nodes.get(v).setVisited(true);
		String aux = (nodes.get(v).getElement().toString());
		for (int i = 0; i < size; i++) {
			if (edges[v][i] && !nodes.get(i).isVisited())
				aux += "-" + DFPrint(i);
		}
		return aux;
	}

	/**
	 * Remove a node from the graph
	 * 
	 * @param The T element that will be remove
	 * @throws Exception if the element is not found, an exception is thrown.
	 */

	public void removeNode(T element) throws Exception {
		for (GraphNode<T> node : nodes) {
			if (node.getElement().equals(element)) {
				int i = getNode(element);
				if (i >= 0) {
					--size;
					if (i != size + 1) { // it is not the last node

						// replaces by the last node
						nodes.remove(element);

						// replace elements in the vectors edges and weights
						for (int j = 0; j <= size; j++) {
							edges[j][i] = edges[j][size];
							edges[i][j] = edges[size][j];
							weight[i][j] = weight[size][j];
							weight[j][i] = weight[j][size];
						}
						// loop (diagonal)
						edges[i][i] = edges[size][size];
						weight[i][i] = weight[size][size];
					}
				}

				nodes.remove(element);
			} else
				throw new Exception("Element is not in the graph.");
		}

		this.size -= 1;
	}

	/**
	 * Will remove the edge between two elements
	 * 
	 * @param T element inicial node
	 * @param T eleemt destination node
	 * @throws Exception  in case that the edge doesn't exist an exception is throws
	 */
	public void removeEdge(T origin, T dest) throws Exception {

		if (getNode(origin) == -1 || getNode(dest) == -1) {
			throw new Exception("one of the elements is not found");
		}
		this.weight[getNode(origin)][getNode(dest)] = 0;
		edges[getNode(origin)][getNode(dest)] = false;

	}

	/**
	 * Will print the graph
	 */
	public void print() {

		for (int k = 0; k < size; k++)
			nodes.get(k).print();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(edges[i][j] + "(");
				System.out.print(weight[i][j] + ")");
			}
			System.out.println();
		}
	}

	/*
	 * Guillermo_Facundo_Colunga
	 * UO236856
	 * 
	 * Floyd algorithm Starts here.
	 * 
	 */

	/*
	 * Getter the double A matrix.
	 * 
	 * @return the matrix A.
	 */
	public double[][] getA() {
		return A;

	}

	/*
	 * Getter the P integer matrix.
	 * 
	 * @returns the P matrix; -1 means no conection.
	 */
	public int[][] getP() {
		return P;

	}

	/*
	 * Initialize the P and A matrices.
	 * 
	 * @return a double matrix that correspond with A, weight matrix.
	 */
	protected double[][] initsFloyd() {

		A = getWeight();
		P = new int[size][size];

		for (int i = 0; i < A.length; i++)
			for (int j = 0; j < A[0].length; j++) {

				P[i][j] = -1;

				if (A[i][j] == 0.00 && i != j) {

					A[i][j] = (int) MAX_NUMBER;

				}

				// if(i==j)
				// A[i][j]=0;

			}
		return A;

	}

	/*
	 * Floyd main algorithm. 
	 * 
	 * @param intenger An, iterations.
	 * @return a double matrix A
	 */
	public double[][] floyd(int An) {
		if (An <= getSize()) {
			initsFloyd();

			for (int i = 0; i < An; i++)
				for (int j = 0; j < getSize(); j++)
					for (int k = 0; k < getSize(); k++) {
						if (A[i][k] + A[k][j] < A[i][j]) {
							A[i][j] = (A[i][k] + A[k][j]);
							P[i][j] = k;
							i = 0;
							j = 0;
						}
					}
		}
		return A;
	}

	/*
	 * Prints the Floyd Path
	 * 
	 * @param T element, the initial node
	 * @param T element, the destination node.
	 * @trhow Exception if there is no path between nodes.
	 */
	public String printFloydPath(T departure, T arrival) throws Exception {

		int i = getNode(departure);
		int j = getNode(arrival);

		if (i == INDEX_NOT_FOUND)
			throw new Exception("deaperture not found");

		int k = P[i][j];
		if (k > 0)
			return (printFloydPath(departure, nodes.get(k).getElement())
					+ nodes.get(k).getElement() + printFloydPath(nodes.get(k)
					.getElement(), arrival));
		else
			return "";

	}

	/*
	 * Guillermo_Facundo_Colunga
	 * UO236856
	 * 
	 * Dijkstra Algoritm starts here.
	 */
	
	
	/**
	 * Getter, the minimum cost value of going from v to every other node in the
	 * graph.
	 * 
	 * @return a double matrix representing the costs.
	 */
	public double[][] getD() {
		double[][] aux = new double[1][D.length];
		aux[0] = D;
		return aux;
	}

	/**
	 * Getter the matrix that represent the previous node to be visited before.
	 * 
	 * @return int[]
	 */
	public int[] getPD() {
		return PD;
	}

	/*
	 * Initialize the Diajkstra sub-class.
	 * 
	 * @param T element that corresponds with the departure Node.
	 */
	private void initDijkstra(T departureNode) {

		D = new double[size];
		PD = new int[size];

		int k = getNode(departureNode);

		for (int i = 0; i < getSize(); i++) {

			// Constructing D
			if (edges[k][i]) { // ones that we are
				D[i] = weight[k][i];
			} else {
				D[i] = MAX_NUMBER;
			}

			// Constructing PD
			if (weight[k][i] > 0) {
				PD[i] = k;
			} else {
				PD[i] = -1;
			}
		}
		D[getNode(departureNode)] = MAX_NUMBER;
		PD[getNode(departureNode)] = getNode(departureNode);
	}

	/*
	 * Main Dijkstra Algorithm.
	 * 
	 * @param T element that corresponds with the a T element that is the departure node.
	 */
	public void Dijkstra(T departureNode) {
		initDijkstra(departureNode);
		
		for (GraphNode<T> item : nodes)
			  item.setVisited(false);
		
		nodes.get(getNode(departureNode)).setVisited(true);
		int w;

		for (int i = 0; i < size; i++) {
			if (nodes.get(i).isVisited()) {
				for (int e = 0; e < size; e++) {
					if (edges[i][e]) {
						w = getMin(D); // w = getMin2(D,
						// nodes.get(i));
						if (w < 0)
							break;
						nodes.get(w).setVisited(true);
						// For every node in V-s
						for (int m = 0; m < size; m++) {
							if (!nodes.get(m).isVisited()) {
								if ((weight[w][m] != 0) && (D[w] + weight[w][m] < D[m])) {
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

	/*
	 * Getter, the index of the node with minimun cost.
	 * 
	 * @param double Array with the costs of the nodes.
	 * @return the index of the node with the minimun cost.
	 */
	private int getMin(double[] D) { //antes habia dos parametr
		double minCost = MAX_NUMBER;
		int nodeWithMinCost = -1;
		for (int j = 0; j < size; j++) {
			if (!nodes.get(j).isVisited()) { //antes j era S
				if (D[j] < minCost) {
					minCost = D[j];
					nodeWithMinCost = j;
				}
			}
		}
		return nodeWithMinCost;
	}

}
