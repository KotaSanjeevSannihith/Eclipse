package homework;

public class steel {

	public static void main(String[] args) {
		double hardness=46,carbon=0.5,tensile=5579;
		if(hardness>50 && carbon<0.7 && tensile>5600) {
			System.out.println("Grade 10 steel");
		}
		if((hardness>50 && carbon<0.7 && tensile<5600)) {
			System.out.println("Grade 9 steel");
		}
		if(hardness<50 && carbon<0.7 && tensile>5600) {
			System.out.println("Grade 8 steel");
		}
		if(hardness>50 && carbon>0.7 && tensile>5600) {
			System.out.println("Grade 7 steel");
		}
		if(hardness>50 && carbon>0.7 && tensile<5600) {
			System.out.println("Grade 6 steel");
		}
		if(hardness<50 && carbon<0.7 && tensile<5600) {
			System.out.println("Grade 6 steel");
		}
		if(hardness>50 && carbon>0.7 && tensile<5600) {
			System.out.println("Grade 6 steel");
		}
		if(hardness<50 && carbon>0.7 && tensile<5600) {
			System.out.println("grade 5 steel");
		}
	}
}
