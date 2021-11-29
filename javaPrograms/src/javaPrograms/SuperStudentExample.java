package javaPrograms;

public class SuperStudentExample {

	//int rollno;
	//String name;
	
	//SuperStudentExample(int r, String n)
	//{
		//rollno=r;
		//name=n;
		
//	}
}

class Student extends SuperStudentExample
{
	float percentage;
	int rollno;
	String name;
	Student(int rollno, float percentage, String name)
	{
	//	super(rollno, name);
		this.rollno=rollno;
		this.name=name;
		this.percentage=percentage;
		
	}

	public void display()
	{
		System.out.println(rollno + " " + percentage + " "+ name);
	}

public static void main(String args[])
{
	Student stud = new Student(1, 87.5f, "ashok");
	stud.display();
}
}