package lab11;


/**
 * <p>Title: Student</p>
 * <p>Description: Class that models university students.</p>
 * <p>Copyright: Copyright (c) 2012</p>
 * <p>Computer Science Engineering School</p>
 * <p>Programming Methodology</p>
 * 
 * @author Lectures of Programming Methodology
 * @version 1.0
 */
public class Student {
	
	private String name;
	private String surname;
	private int age;
	private String universityID;
	
	public Student(String name, String surname, int age, String universityID) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.universityID = universityID;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getAge() {
		return age;
	}

	public String getUniversityID() {
		return universityID;
	}
	
}
