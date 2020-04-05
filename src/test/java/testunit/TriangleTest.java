package testunit;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import bean.PointDistance;
import bean.Triangle;
import bean.TriangleType;

public class TriangleTest {

	private Triangle t1, t2, t3;
	private PointDistance p1, p2, p3, p4, p5;

	@BeforeTest
	public void initTestIsocele() {

		p1 = new PointDistance(2, 2);
		p2 = new PointDistance(5, 3);
		p3 = new PointDistance(3, 5);
		p4 = new PointDistance(0, 8);
		p5 = new PointDistance(-5, 12);

		t1 = new Triangle(p1, p2, p3);
		t2 = new Triangle(p1, p2, p4);
		t3 = new Triangle(p1, p2, p5);
	}

	@Test
	public void TriangleIsoceleTest() {

		// Test de triangle isocele
		assertEquals(t1.getType(), TriangleType.Isocele);
		System.out.println("Triangle t1 est " + t1.getType());

	}

	@Test
	public void TriangleRectangleTest() {

		// Test de triangle rectangle
		assertEquals(t2.getType(), TriangleType.Rectangle);
		System.out.println("Triangle t2 est " + t2.getType());

	}
	
	@Test
	public void TriangleScaleneTest() {

		// Test de triangle rectangle
		assertEquals(t3.getType(), TriangleType.Scalene);
		System.out.println("Triangle t3 est " + t3.getType());

	}

	@AfterTest
	public void fin() {
		System.out.println("fin de test");
	}

}
