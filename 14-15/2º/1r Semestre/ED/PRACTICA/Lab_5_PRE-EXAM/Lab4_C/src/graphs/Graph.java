package graphs;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Graph<T> {
	private ArrayList<GraphNode<T>> nodes;
	private boolean[][] edges;
	private double[][] weight;
	private int size;

	public final static int INDEX_NOT_FOUND = -1;
	public final static int MAX_NUMBER = 99;
	

	// CONSTRUCTOR------------------------------------------------------------
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

	// GETTERS AND SETTERS----------------------------------------------------
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

	// METHODS ---------------------------------------------------------------
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
			if (nodes.get(i).getElement().equals(element))
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

	// METHOD 3
	public String traverseGraphDF(T element) {
		for (GraphNode<T> node : nodes) {
			node.setVisited(false);
		}
		int v = getNode(element);
		return (DFPrint(v));
	}

	private String DFPrint(int v) {
		nodes.get(v).setVisited(true);
		String aux = (nodes.get(v).getElement().toString());
		for (int i = 0; i < size; i++) {
			if (edges[v][i] && !nodes.get(i).isVisited())
				aux += "-"+DFPrint(i);
		}

		return aux;
	}
	
	// METHODS remove here.
	
	public void removeNode(T element) throws Exception{
		for (int i = 0; i < size; i++) {
			if (nodes.get(i).getElement().equals(element)){
				nodes.remove(i);
				size=size-1;
			}
				
		}

		//return INDEX_NOT_FOUND;
	}
	
	public void removeEdge (T origin,T dest) throws Exception{
        /* Confirm both endpoints exist. */
        if (!nodes.contains(origin) || !nodes.contains(dest))
            throw new NoSuchElementException("The edge must exist.");

        /* Remove the edges from both adjacency lists. */
        weight[getNode(origin)][getNode(dest)] = INDEX_NOT_FOUND;
        edges[getNode(origin)][getNode(dest)] = false;
	}
	
	public void print(){
		System.out.println(nodes);
	}
	
	
	/********************************************************************************************/
	//Floyd Algorithm

	public static final int NOT_A_VERTEX = -1;
	public static final int INFINITE = 99;
	public static final int N = 3;
	   
	private double A[][];//Cost matrix.
    private int P[][];//Pathway matrix.
    
    
	protected double[][] getA()
    {
        return A;
	}
	
	protected int[][] getP(){
		return P;
	}
	
	protected double[][] initsFloyd(){
		for(int i=0; i<getSize(); j++)
		{
			if(edges[i][j])
				A[i][j] = weight[i][j];
			else
				A[i][j] = INFINITE;
			P[i][j] = -1;
			
			if(i==j)
				A[i][j]=0;
		}
		
		return null;
	}
	
	protected double[][] floyd(int An){
		if(An <= getSize())
		{
			initsFloyd();
			
			for(int k=0; k<An; k++)
				for(int i=0; i<getSize(); i++)
					for(int j=0; j<getSize(); j++)
		}
	}
/*	
	public String printFloydPath(T departure , T arrival){
		int i = getNode(departure);
		int j = getNode(arrival);
		
		if(i== INDEX_NOT_FOUND)
			throw new Exception("");
		if(j== INDEX_NOT_FOUND)
			throw new Exception("");
		int k = P[i][j];
		if(k>0)
			return (printFloyd)
	}
	
	*/
	
	
	/********************************************************************************************/
	//Dijkstra Algorithm
	private double[] D;
	private int[] PD;
	
	/*
	 * Getter value of D.
	 * 
	 * @return aux, the value of the D as a 2row double matrix.
	 */
	public double[][] getD()
	{
		double[][] aux = new double[1][D.length];
		aux[0] = D;
		return aux;
	}

	/*
	 * Getter value of PD
	 * 
	 * @return PD int matrix
	 */
	public int[] getPD()
	{
		return PD;
	}
	
	/*
	 * Initializes Dijkstra.
	 */
	public void initsDijkstra(T departureNode)
	{
		int k = getNode(departureNode);
		
		for(int i=0; i<getSize(); i++)
		{
			if(edges[k][i])
				D[i] = weight[k][i];
			else
				D[i] = MAX_NUMBER;
			if (weight[k][i] < MAX_NUMBER)
				PD[i] = k;
			else
				PD[i] = -1;
		}
	}
	
	/*
	 * Dijkstra Algorithm.
	 */
	public void Dijkstra(T departureNode)
	{
		initsDijkstra(departureNode);
		
		// empties the S set
		for (GraphNode<T> items : nodes)
			items.setVisited(false);
		// put the departure node in the S set
		nodes.get(getNode(departureNode)).setVisited(true);
				
		// Dijkstra interations
		for(int i=1; i<getSize();i++)
		{
			//First select w!
			for (i=0; i<getSize();i++){
				if(nodes.get(i).getVisited())
				{
					
				for(j=0; j<getSize(); j++)
				}
		
			}
		}
	}
}
