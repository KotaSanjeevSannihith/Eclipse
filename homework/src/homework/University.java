package homework;

public class University {

	public static void main(String[] args) {
		int marksA=66,marksB=44;
		String result="None";
		if(marksA>=55 && marksB>=45) {
			result="Qualified";
		}
		else if(marksA>=45 && marksA>=45 && marksB>=55){
			result="Qualified";
		}
		else if(marksA>=65 && marksB<=45) {
			result="Appear again";
		}
		else {
			result="Disqualified";
		}
		System.out.println("Status of student application : "+result);
		// TODO Auto-generated method stub

	}

}
