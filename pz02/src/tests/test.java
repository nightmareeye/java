package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.TestCase;
import pz02.Circle;
import pz02.Dot;

public class test extends TestCase {
	@Test
	public void testCircleInit() {
		Circle a = new Circle(new Dot(2, 1), 1);
		Circle b = new Circle(new Dot(2, 1), 1);
		assertTrue(Circle.equals(a, b));
	}

	@Test
	public void testCircleInitDef() {
		Circle a = new Circle();
		Circle b = new Circle(new Dot(0,0),0);
		assertTrue(Circle.equals(a,b));
	}
	@Test
	public void testCircleSquare() {
		Circle a = new Circle(new Dot(2,1),1);
		assertEquals(a.square(),3.14);
	}

	@Test
	public void testCircleStr() {
		Circle a = new Circle(new Dot(2, 1), 1);
		assertEquals(a.toString(), "Circle at (2.0,1.0) with radius 1.0");
	}

	@Test
	public void testCircleDraw() {
		Circle a = new Circle(new Dot(2, 1), 1);
		assertEquals(a.draw(), "Circle");
	}

	@Test
	public void testDotInit() {
		Dot a = new Dot(2, 1);
		Dot b = new Dot(2, 1);
		assertTrue(Dot.equals(a, b));
	}

	@Test
	public void testDotInitDef() {
		Dot a = new Dot(0,0);
		Dot b = new Dot();
		assertTrue(Dot.equals(a, b));
	}
	
	@Test
	public void testDotStr() {
		Dot a = new Dot(2, 1);
		assertEquals(a.toString(), "(2.0,1.0)");
	}

	@Test
	public void testDotDraw() {
		Dot a = new Dot(2, 1);
		assertEquals(a.draw(), "Point");
	}
}
