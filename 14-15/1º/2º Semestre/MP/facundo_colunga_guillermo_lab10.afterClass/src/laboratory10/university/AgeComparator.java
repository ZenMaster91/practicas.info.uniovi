package laboratory10.university;

import java.util.Comparator;

/**
 * Compares objects of type Student by age.
 * 
 * @author Guillermo
 */
public class AgeComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getAge() < s2.getAge())
			return -1;
		else if (s1.getAge() > s2.getAge())
			return 1;
		else return 0;
	}

}
