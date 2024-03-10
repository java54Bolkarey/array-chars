package telran.arrays.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.arrays.ArrayChar;

class ArrayCharTest {

	@Test
	void compareToTest() {
		char[] ar1 = {'1', '2', '3'};
		char[] ar2 = {'9'};
		char[] ar3 = {'1', '2', '3'};
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		ArrayChar arrayChar3 = new ArrayChar(ar3);
		assertEquals(8, arrayChar2.compareTo(arrayChar1));
		assertEquals(-8, arrayChar1.compareTo(arrayChar2));
		assertEquals(1, new ArrayChar(new char[] {'a','a'})
				.compareTo(new ArrayChar(new char[] {'a'})));
		assertEquals(-1, new ArrayChar(new char[] {'a'})
				.compareTo(new ArrayChar(new char[] {'a', 'a'})));
		assertEquals(0, arrayChar1.compareTo(arrayChar3));
	}

	@Test
	void indexOfTest() {
		char[] ar1 = {'1','2', '3', '2'};
		ArrayChar arrayChar1 = new ArrayChar(ar1);

	    assertEquals(1, arrayChar1.indexOf('2'));
	    assertEquals(0, arrayChar1.indexOf('1'));
	    assertEquals(2, arrayChar1.indexOf('3'));
	    assertEquals(-1, arrayChar1.indexOf('9'));
	
	}
	@Test
	void lastIndexOfTest() {
		char[] ar1 = {'1','2', '3', '2'};
		 ArrayChar arrayChar1 = new ArrayChar(ar1);	   
		    
		 assertEquals(3, arrayChar1.lastIndexOf('2'));
		 assertEquals(0, arrayChar1.lastIndexOf('1'));
		 assertEquals(2, arrayChar1.lastIndexOf('3'));
         assertEquals(-1, arrayChar1.lastIndexOf('4'));
		}
	

	@Test
	void countTest() {
	char[] ar1 = {'a', 'b', 'c', 'a', 'd', 'a'};
	ArrayChar arrayChar1 = new ArrayChar(ar1);
	
	assertEquals(3, arrayChar1.count('a'));
	assertEquals(1, arrayChar1.count('b'));
	assertEquals(0, arrayChar1.count('e'));
	}


	@Test
	void compareToIgnoreCaseTest() {
	    char[] ar1 = {'H', 'e', 'l', 'l', 'o'};
	    char[] ar2 = {'h', 'E', 'l', 'L', 'o'};
	    char[] ar3 = {'W', 'o', 'r', 'l', 'd'};
	    ArrayChar arrayChar1 = new ArrayChar(ar1);
	    ArrayChar arrayChar2 = new ArrayChar(ar2);
	    ArrayChar arrayChar3 = new ArrayChar(ar3);
	  
	    assertEquals(0, arrayChar1.compareToIgnoreCase(arrayChar2));
	    assertTrue(arrayChar1.compareToIgnoreCase(arrayChar3) < 0);
	    assertTrue(arrayChar2.compareToIgnoreCase(arrayChar3) > 0);
	}


	@Test
	void containsTest() {
	char[] ar1 = {'a', 'b', 'c', 'd', 'e'};
	ArrayChar arrayChar1 = new ArrayChar(ar1);
	
	assertTrue(arrayChar1.contains('c'));
	assertFalse(arrayChar1.contains('f'));
	}

	
	@Test
	void equalsTest() {
	    char[] ar1 = {'a', 'b', 'c', 'd', 'e'};
	    char[] ar2 = {'a', 'b', 'c', 'd', 'e'};
	    char[] ar3 = {'1', '5', '8'};
	    
	    ArrayChar arrayChar1 = new ArrayChar(ar1);
	    ArrayChar arrayChar2 = new ArrayChar(ar2);
	    ArrayChar arrayChar3 = new ArrayChar(ar3);
	   
	    assertTrue(arrayChar1.equals(arrayChar2));  
	    assertFalse(arrayChar1.equals(arrayChar3));
	}



	@Test
	void equalsIgnoreCaseTest() {
	char[] ar1 = {'H', 'e', 'l', 'l', 'o'};
	char[] ar2 = {'h', 'E', 'l', 'L', 'o'};
	char[] ar3 = {'H', 'e', 'l', 'l', 'o', '!'};
	
	ArrayChar arrayChar1 = new ArrayChar(ar1);
	ArrayChar arrayChar2 = new ArrayChar(ar2);
	ArrayChar arrayChar3 = new ArrayChar(ar3);

	assertTrue(arrayChar1.equalsIgnoreCase(arrayChar2));
	assertFalse(arrayChar1.equalsIgnoreCase(arrayChar3));
	}
}

