package ar.edu.unq.po2.tp3;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}

	public Point() {
		this.x=0;
		this.y=0;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void move(int x, int y) {
		this.x +=x ;
		this.y +=y ;
	}

	public Point plus(Point p) {
		Point result = new Point(this.x+p.getX(), this.y+p.getY());
		return result;
	}
	
	
	
	
}
