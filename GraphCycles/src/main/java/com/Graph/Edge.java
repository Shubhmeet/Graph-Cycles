package com.Graph;

public class Edge {

	private Vertex source;
	private Vertex destination;
	
	public Edge(Vertex source, Vertex destination) {
		this.source = source;
		this.destination = destination;
	}
	public Vertex getSource() {
		return source;
	}
	public void setSource(Vertex source) {
		this.source = source;
	}
	public Vertex getDestination() {
		return destination;
	}
	public void setDestination(Vertex destination) {
		this.destination = destination;
	}
	
	@Override
	public String toString() {
		return getSource()+" - " + getDestination();
	}
	
	@Override
	public boolean equals(Object obj){
		if(this==obj)
			return true;
		
		if(obj==null)
			return false;
		
		if(getClass()!=obj.getClass())
			return false;
		
		Edge other= (Edge) obj;
		if(this.destination==null){
			if(other.getDestination()!=null)
				return false;
		}
		else if(!destination.equals(other.getDestination()))
			return false;
		
		if(this.source==null){
			if(other.getSource()!=null)
				return false;
		}
		else if(!source.equals(other.getSource()))
			return false;
		
		return true;
	}
	
}
