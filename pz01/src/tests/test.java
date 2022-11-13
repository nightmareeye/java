package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.TestCase;

import pz1.pz01;

public class test extends TestCase {

	@Test
	public void testPyramida() {
		String check = "";
		check += "Pyramidka:" +"\n";
		for(int i=0; i<5; i++) {
			for(int k=0; k<9-2*i;k++) {
				check+=" ";
			}
			for(int j = 0; j<1+i*2;j++) {
				check+=j+1 +" ";
			}
			check+="\n";
		}
		assertEquals(pz01.pyram(),check);
	}
	
	@Test
	public void testChange() {
		assertEquals(pz01.change()[0],25);
		assertEquals(pz01.change()[24],1);
	}
	
	@Test
	public void testMid() {
		int k = 30;
		assertEquals(pz01.mid(k),15);
	}
	
	@Test
	public void testTable() {
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<5; j++) {
				assertTrue(pz01.table()[i][j]<10);
			}
		}
	}
	
	@Test
	public void testScalar() {
		double check = 1.000000000001E42;
		assertEquals(pz01.scalar(),check);
	}
	
	@Test
	public void testDel() {
		int k = 16;
		assertTrue(pz01.del(k));
	}
	
	@Test
	public void testSystem() {
		double a=2,b=4,c=6,d=1,e=3,f=7;
		double[] result= {5.0,-4.0};
		assertEquals(pz01.sys(a, b, c, d, e, f)[0],result[0]);
		assertEquals(pz01.sys(a, b, c, d, e, f)[1],result[1]);
	}

}
