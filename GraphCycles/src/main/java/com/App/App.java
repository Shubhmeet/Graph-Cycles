package com.App;

import java.awt.Point;

import com.Graph.Edge;
import com.Graph.Vertex;
public class App {

	public static void main(String args[]){
		
		Vertex source =new Vertex("1",new Point(1,1));
		Vertex destination =new Vertex("2",new Point(2,1));
		
		Edge edge=new Edge(source, source);
		Edge edge1=new Edge(destination, destination);
		Edge edge2=new Edge(source,destination);
		Edge edge3=new Edge(source,destination);
		
	}
}
