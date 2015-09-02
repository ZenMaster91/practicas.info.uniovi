package laboratory10.university;

import java.util.Comparator;

/**
 * Compares objects of type Student by university id.
 * As it is comparing the id as an string iit will be ordered as follows: uo1, uo10, uo11, uo2, uo21 ...
 * 
 * @author Guillermo
 */
public class IDComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return (s1.getUniversityID()).compareTo(s2.getUniversityID());
	}

}
