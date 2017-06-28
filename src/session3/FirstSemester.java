package session3;

public class FirstSemester extends Student implements Result {
	
	FirstSemester(String name, int roll_no, int reg) {
		super(name, roll_no, reg);
	}

	private String sub1, sub2;
	private float mark1, mark2, grade1, grade2,credit1,credit2;
		
	

	@Override
	public float calculateGpa() {
        return (grade1* credit1+ grade2*credit2) / (credit1+credit2);
	}

	@Override
	public void getSubject() {
        sub1="Physics";
        sub2="Chemistry";
        credit1=(float)2.0;
        credit2=(float)3.0;
		
	}

	@Override
	public void showResult() {
		 System.out.println("\nName: " + name + "\nRoll = " + roll_no + "\nRegistration no: " + reg + "\n" + sub1 + " grade: " + grade1+ "\n" + sub2 + " grade: " + grade2 + "\nGPA: " + calculateGpa());
		
	}

	@Override
	public void setMarks(float mark1, float mark2) {
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.grade1 = gradeCalculation(mark1);
		this.grade2 = gradeCalculation(mark2);
		
	}

}
