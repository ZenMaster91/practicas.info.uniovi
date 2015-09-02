package laboratory10.university;

public class Student implements Comparable<Student>, Cloneable
{
	private String name, surname, universityID;
	private int age;
			
	/**
	 * Main constructor...
	 * 
	 * @param name of the student ( String )
	 * @param surname of the student ( String )
	 * @param age of the student ( integer )
	 * @param universityID of the student ( String )
	 */
	public Student(String name, String surname, int age, String universityID) 
	{
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.universityID = universityID;
	}
	
	/**
	 * Getter, return the name of the student.
	 * 
	 * @return the name of the student.
	 */
	public String getName() 
	{
		return name;
	}
	
	/**
	 * Getter, return the surname of the student.
	 * 
	 * @return the surname of the student.
	 */
	public String getSurname() 
	{
		return surname;
	}
	
	/**
	 * Getter, return the age of the student.
	 * 
	 * @return the age of the student.
	 */
	public int getAge() 
	{
		return age;
	}
	
	/**
	 * Getter, return the universityID of the student.
	 * 
	 * @return the universityID of the student.
	 */
	public String getUniversityID() 
	{
		return universityID;
	}
	
	/**
	 * toString method.
	 * 
	 * @return name surname (universityID)
	 */
	@Override
	public String toString() 
	{
		return name + " " + surname + " (" + universityID + ")";
	}

	@Override
	public int compareTo(Student arg0) {
		return ((getSurname()+" "+getName()).compareTo(arg0.getSurname()+" "+arg0.getName()));
	}
}
