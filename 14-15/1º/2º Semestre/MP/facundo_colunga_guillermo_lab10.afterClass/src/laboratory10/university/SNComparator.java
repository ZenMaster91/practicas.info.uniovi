package laboratory10.university;

import java.util.Comparator;

/**
 * Compares objects of type Student by surnames and name.
 * 
 * @author Guillermo
 */
public class SNComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return ((s1.getSurname()+" "+s1.getName()).compareTo(s2.getSurname()+" "+s2.getName()));
	}

}
