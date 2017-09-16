package com.Graph;

import java.awt.Point;

public class Vertex {

	 private String label;
	 private Point data;
	 
	public Vertex(String label,Point data) {
		this.label = label;
		this.data = data;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Point getdata() {
		return data;
	}

	public void setdata(Point data) {
		this.data = data;
	}
	 
	
	@Override
	public String toString(){
		return "(" + data.getX() + ","+ data.getY()+ ")";
	}
	 
	@Override
	public boolean equals(Object obj){
		if(this==obj)
			return true;
		
		if(obj==null)
			return false;
		
		if(this.getClass()!=obj.getClass())
			return false;
		
		Vertex other= (Vertex) obj;
		
		if(this.data==null){
			if(other.getdata()!=null)
				return false;
		}
		else if(!data.equals(other.getdata())){
			return false;
		}
		return true;
	}

}

