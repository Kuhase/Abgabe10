package at.fhj.itm;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Point2dTest {
	
	/**
	 * Set some Point2d for testing their functionality
	 */
	private Point2d p1;
	private Point2d p2;
	
	/**
	 * Test the Setter of the x-coordinate
	 * - set the coordinate
	 * - get the value from the object
	 * - try to compare your value with the return value of x
	 */
	
	@Before
	public void setup(){
	p1 = new Point2d();
	p2 = new Point2d();
	
	}

	@Test
	public void testSetX(){
	double Xp1;
	double Xp2;
	
	p1.setX(5.0);
	p2.setX(1.3);
	
	Xp1 = p1.getX();
	Xp2 = p2.getX();
	
	assertEquals(5.0, Xp1, 0.0000001);
	assertEquals(1.3, Xp2, 0.0000001);
	
	}

	/**
	 * Test the Setter of the y-coordinate
	 * - set the coordinate
	 * - get the value from the object
	 * - try to compare your value with the return value of y
	 */
	@Test
	public void testSetY(){
		double Yp1;
		double Yp2;
		
		p1.setY(5.0);
		p2.setY(1.3);
		
		Yp1 = p1.getY();
		Yp2 = p2.getY();
		
		assertEquals(5.0, Yp1, 0.0000001);
		assertEquals(1.3, Yp2, 0.0000001);
	}
	

	/**
	 * Test the distanceFrom() Method
	 * - call the method distanceFrom and calculate the distance
	 * - calculate the distance by your own implementation
	 * - try to compare your result with the return value of distanceFrom()
	 */
	@Test
	public void testDistanceFrom(){
		p1.setX(2.0);
		p2.setX(1.0);
		p1.setY(14.0);
		p2.setY(12.0);
		
		double erg = p1.distanceFrom(p2);
		
		assertEquals(2.236067977499, erg, 0.01);

		
	}

	/**
	 * Test the distanceFromOrigin() Method
	 * - call the method distanceFromOrigin and calculate the distance
	 * - calculate the distance by your own implementation
	 * - try to compare your result with the return value of distanceFromOrigin()
	 */
	@Test
	public void testDistanceFromOrigin(){
		
	
		p1.setX(1.0);
		p1.setY(12.0);
		
		double erg = p1.distanceFromOrigin();
		
		assertEquals(12.041594578, erg, 0.01);
		
	}
}
