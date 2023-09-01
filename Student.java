package Student;

public class Student {
	String name;
	String department;
	int id;
	public Student(String name, String department,int id) {
		super();
		this.name = name;
		this.department = department;
	}
	void printDetails()
	{
		System.out.println(name);
		System.out.println(department);
	}
	String getGrades(int...marks) {
		int sum=0;

		for(int mark:marks)
		{
			sum+=mark;
		}

		int avg=sum/marks.length;

		if(avg>=91 && avg<=100)
		{
			return "Best";
		}
		else if(avg>=81 && avg <91)
		{
			return "Good";
		}
		else if(avg>=71 && avg <81)
		{
			return "Better";
		}
		else if(avg>=61 && avg <71)
		{
			return "Average";
		}
		else if(avg>=51 && avg <59)
		{
			return "BelowAverage";
		}
		return "fail";
	}


}
