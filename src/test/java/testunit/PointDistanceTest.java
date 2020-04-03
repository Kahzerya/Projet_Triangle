package testunit;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import bean.PointDistance;

public class PointDistanceTest {

	private PointDistance p1;
	private PointDistance p2;
	private PointDistance p3;
	private PointDistance p4;
	private PointDistance p5;

	@BeforeTest
	public void init() {
		p1 = new PointDistance(0, 0);
		p2 = new PointDistance(0, 2);
		p3 = new PointDistance(12, 4);
		p4 = new PointDistance(-5, 8);
		p5 = new PointDistance(-2, 2);

	}

	@Test
	public void DistanceTest() {

		// Test des distances
		assertEquals(p1.distance(p2), 2.0);
		System.out.println("la distance p1-p2 est " + p1.distance(p2));
		
		assertEquals(p1.distance(p3), 12.649110640673518);
		System.out.println("la distance p1-p3 est " + p1.distance(p3));
		
		assertEquals(p4.distance(p5), 6.708203932499369);
		System.out.println("la distance p4-p5 est " + p4.distance(p5));

	}

	@AfterTest
	public void fin() {
		System.out.println("fin de test");
	}

}
