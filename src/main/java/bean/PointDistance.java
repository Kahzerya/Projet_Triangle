package bean;

public class PointDistance {

	private int X, Y;
	
	public PointDistance (int abs, int ord) {
		X=abs;
		Y=ord;
	}

	public int getX() {
		return X;
	}

	public int getY() {
		return Y;
	}

	public double distance(PointDistance p2) {
		double dx = (getX() - p2.getX());
		double dy = (getY() - p2.getY());
		return Math.sqrt(dx * dx + dy * dy);
	}

}
