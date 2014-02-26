package code;

import java.util.ArrayList;

public class CorrectlyWrong {
	
	private ArrayList<Integer> ContainsDuplicates;
	private String unusedVar = "pmdViolationTester";
	
	public CorrectlyWrong(ArrayList<Integer> ContainsDuplicates){
		try {
			this.ContainsDuplicates = ContainsDuplicates;
		} catch (Exception e) {
			
		}
	}
	
	public ArrayList<Integer> removeDuplicates(){
		int TEMP;
		ArrayList<Integer> duplicatesRemoved = new ArrayList<Integer>();
		TEMP = ContainsDuplicates.get(0);
		for (int elem : ContainsDuplicates) {
			if (elem != TEMP) {
				duplicatesRemoved.add(elem);
				TEMP = elem;
			}
		}
		if(duplicatesRemoved.isEmpty()){
			
		}else{int d = 1 +2;};
		return duplicatesRemoved;
	}
}
