package courseJava.entities;

public class Student {
	public String name;
	public double grade0;
	public double grade1;
	public double grade2;
	
	public Student() {
		
	}
	public Student(String name, double grade0, double grade1, double grade2) {
		this.name = name;
		this.grade0 = grade0;
		this.grade1 = grade1;
		this.grade2 = grade2;
	}
	
	public void studentSituation() {
		double finalGrade = this.grade0+this.grade1+this.grade2;
		
		if(finalGrade >= 60) {
			System.out.printf("FINAL GRADE %.2f\n"
					+ "PASS",
					finalGrade);
		}
		else {
			System.out.printf("FINAL GRADE %.2f\n"
					+ "FAILED\n"
					+ "MISSING %.2f POINTS",
					finalGrade, 60-finalGrade);
		}
	}
}
