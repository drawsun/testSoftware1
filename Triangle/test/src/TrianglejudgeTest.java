package src;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class TrianglejudgeTest extends TestCase{

	@Test
	public void testGetTriangle(){
		/*int a=1,b=1,c=1;
		
		int expResult = 0;
		int result = instance.getTriangle(a, b, c);
		assertEquals(expResult,result);*/
		int exp[] = {0,0,1,1,2,2,3,3};
		int a[] = {3,3,3,3,3,3,3,3};
		int b[] = {3,3,3,3,4,4,4,4};
		int c[] = {3,3,2,2,5,5,0,0};
		int result[]={0,0,0,0,0,0,0,0};
		for(int i=0;i<8;i++){
			Trianglejudge instance = new Trianglejudge();
			result[i] = instance.getTriangle(a[i], b[i], c[i]);
			assertEquals(exp[i],result[i]);
		}
	}
}
