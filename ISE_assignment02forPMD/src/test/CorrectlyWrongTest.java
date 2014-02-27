package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import code.CorrectlyWrongPMD;

public class CorrectlyWrongTest {

	private CorrectlyWrongPMD classTested;
	ArrayList<Integer> testArray;;
	
	
	
	@Before
	public void set(){
		testArray = new ArrayList<>();
		testArray.add(2);
		testArray.add(3);
		testArray.add(6);
		testArray.add(4);
		testArray.add(2);
		
		classTested = new CorrectlyWrongPMD(testArray);
	}
	
	@Test
	public void test() {
		ArrayList<Integer> result = new ArrayList<>();
		result.add(3);
		result.add(6);
		result.add(4);
		result.add(2);
		
		assertEquals("it has removed the duplicates", classTested.removeDuplicates(), result);
	}

}
