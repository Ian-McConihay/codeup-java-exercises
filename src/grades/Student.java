package grades;
import util.Input;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Student {
	private String studentName;
	private ArrayList<Integer> grades;


	public Student(String studentName, int grades) {
		this.studentName = studentName;
		this.grades = new ArrayList<>(grades);

	}

	// returns the student's name
	public String getName() {
		return studentName;
	}

	//	 adds the given grade to the grades property
	public void addGrade(int grade) {
		grades.add(grade);
	}

	//	 returns the average of the students grades
	public double getGradeAverage(double grades[]) {
		for(double grade : grades)
		return grade / 100;
	}

	public static void main(String[] args) {
		HashMap<String, Student> students = new HashMap<>();
		Student bob = new Student("Bob", new ArrayList<>());
		bob.addGrade(85);
		bob.addGrade(75);
		System.out.println("Bobs grades: " + bob.grades);
//		System.out.println(bob.getGradeAverage(bob.grades));

	}


}
