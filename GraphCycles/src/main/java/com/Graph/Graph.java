package com.Graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {

	private List<Vertex> vertices;
	private List<Edge> edges;
	
	
	/**
	 * Constructor for <code>Graph</code>.
	 * 
	 */
	public Graph(){
		vertices=new ArrayList<Vertex>();
		edges=new ArrayList<Edge>();
	}
	
	/**
	 * Constructor for <code>Graph</code>.
	 * 
	 * @param vertices
	 *            <code>List</code> of <code>Vertex</code>s in the
	 *            <code>Graph</code>.
	 * @param edges
	 *            <code>List</code> of <code>Edge</code>s in the
	 *            <code>Graph</code>.
	 */
	public Graph(List<Vertex> vertices, List<Edge> edges) {
		this.vertices = vertices;
		this.edges = edges;
	}

	/**
	 * Return the <code>List</code> of <code>Vertex</code>s in the
	 * <code>Graph</code>.
	 * 
	 * @return <code>List</code> of <code>Vertex</code>s in the
	 *         <code>Graph</code> .
	 */
	public List<Vertex> getVertices() {
		return vertices;
	}

	/*
	 * Return the <code>List</code> of <code>Edge</code>s in the
	 * <code> Graph</code>
	 * 
	 * @return <code>List</code> of <code> Edge</code>s in the
	 * <code>Graph</code>
	 */
	public List<Edge> getEdges() {
		return edges;
	}
	/*
	 * Removes the <code>Edge</code> from the graph
	 * 
	 * @param edge
	 * 
	 */
	public void removeEdges(Edge edge){
		edges.remove(edge);
	}
	
	
}
