package staticClass;

public class Point {
	public int x,y;
	
	public Point() {
		x = 0; y =0;
	}
	public Point(int x, int y) {
		this.x = x; this.y =y;
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}
