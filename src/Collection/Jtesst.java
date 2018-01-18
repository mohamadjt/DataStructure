package Collection;

import static org.junit.Assert.*;

import org.junit.Test;

public class Jtesst {

	@Test
	public void testStackOverflow(){
		Stack<Integer> s=new Stack<Integer>(10);
		for(int i=0;i<12;i++){
			s.push(i);
		}
	}
	
	@Test
	public void testtop(){
		Stack<Integer> s=new Stack<Integer>(5);
		assertNull(s.pop());
	}

	@Test
	public void testisempty(){
		Stack<Integer> s=new Stack<Integer>(10);
		assertTrue(s.isEmpty());
	}
}
