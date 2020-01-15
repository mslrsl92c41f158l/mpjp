package ex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class First {

	@Test
	void moltiplicationTableThree() {
		int [][] result = S59.multiplicationTable(3);
		
		int [] [] expected = {
				{1, 2, 3}, 
				{2, 4, 6}, 
				{3, 6, 9}
		};
		assertEquals(expected.length, result.length );
		for ( int i=0; i<expected.length; i++ ) {
			
			assertEquals(expected[i].length, result[i].length);
		}
	
			for ( int i=0; i<expected.length; i++ ) {
				for ( int j=0; i<expected[i].length; j++ ) {
					assertEquals(expected[i][j], result[i][j]);	
			}
			
			
			
		}
		fail("Not yet implemented");
	}
}
