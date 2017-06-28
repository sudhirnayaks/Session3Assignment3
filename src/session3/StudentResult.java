package session3;

public class StudentResult {

	public static void main(String[] args) {
		FirstSemester std1 = new FirstSemester("Sudhir", 111, 201);
        std1.setMarks(60,70);
        System.out.println("\nEnter First Semester Student's Info:");
        std1.getSubject();
        std1.showResult();
        
        FirstSemester std2 = new FirstSemester("Nayak", 222, 202);
        std2.setMarks(70,80);
        System.out.println("\n\nEnter First Semester Student's Info:");
        std2.getSubject();
        std2.showResult();

        SecondSemester std3 = new SecondSemester("Ram", 333, 203);
        std2.setMarks(70,80);
        System.out.println("\n\nEnter Second Semester Student's Info:");
        std2.getSubject();
        std2.showResult();
	}

}
