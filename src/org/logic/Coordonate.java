package org.logic;

public class Coordonate {
	
	public double x,y;

	public Coordonate(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return this.x;
	}
	
	public void setX(double x) {
		this.x=x;
		
	}
	
	public double getY() {
		return this.y;
	}
	
	public void setY(double y) {
		this.y=y;
		
	}
	
	public void crearePunct(double xx, double yy){
		this.x=xx;
		this.y=yy;
	}
}
