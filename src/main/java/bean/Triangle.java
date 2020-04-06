package bean;

public class Triangle {

	private double l1, l2, l3;

	public Triangle(PointDistance p1, PointDistance p2, PointDistance p3) {
		l1 = p1.distance(p2);
		l2 = p1.distance(p3);
		l3 = p2.distance(p3);
	}

	public TriangleType getType() {
		if (l1 <= 0 || l2 <= 0 || l3 <= 0 || l1 >= (l2 + l3) || l2 >= (l1 + l3) || l3 >= (l2 + l1))
			return TriangleType.Invalid;

		else if (l1 == l2 && l2 == l3)
			return TriangleType.Equilateral;
		else if (l1 == l2 || l2 == l3 || l3 == l1)
			return TriangleType.Isocele;
		else if ((l1 * l1) == (l2 * l2 + l3 * l3) || (l2 * l2) == (l1 * l1 + l3 * l3)
				|| (l3 * l3) == (l1 * l1 + l2 * l2))
			return TriangleType.Rectangle;
		else
			return TriangleType.Scalene;

	}

}
