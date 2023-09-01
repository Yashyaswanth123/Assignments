package Student;

public class StudentMain {
	public static void main(String[] args) {
	Student student = new Student("Yash", "Civil",1);
	
	student.printDetails();
	System.out.println("The grade is "+student.getGrades(81,96,100));
	System.out.println();
	
	

	Student student1 = new Student("Kumar", "Mechanical",2);
	student1.printDetails();
	System.out.println("The grade is "+student1.getGrades(75,60,55));

}
}
