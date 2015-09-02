package laboratory10.university;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import guillermo.util.ArrayList;
import guillermo.util.ArrayQueue;
import guillermo.util.Queue;



public class University {
	private List<Student> students = new ArrayList<Student>();
	
	protected void add(Student student) {
		if(contains(student))
			throw new IllegalArgumentException("The student "+ student.toString() + " is already in the system.");
		students.add(student);
	}
	
	private boolean contains(Student student) {
		for(Student current : students) {
			if(student.getUniversityID() == (current.getUniversityID()))
				return true;
		} return false;
	}

	protected List<Student> getAllStudents() {
		return this.students;
	}
	
	protected void list() {
		for(Student current : students)
			System.out.println(current);
	}
	
	/**
	 * Returns a queue with the students assigned to a laboratory group.
	 * Students are assigned to a laboratory group according to their ID,
	 * depending on whether it contains an specified string. For example,
	 * for assigning all the students whose ID contains �3�, it must be invoked as follows:
	 * getLaboratoryStudents(3).
	 * 
	 * @param substring
	 * @return
	 */
	protected Queue<Student> getLaboratoryStudents(String substring) {
		Queue<Student> groupStudents = new ArrayQueue<Student>();
		for(Student current : students) {
			if(current.getUniversityID().toLowerCase().contains(substring.toLowerCase()))
				groupStudents.enqueue(current);
		} return groupStudents;
	}
	
	/**
	 * Sort the list of students by surname and name.
	 */
	public void sort() {
		Collections.sort(students);
	}
	
	/**
	 * Sort the list of students according with the comparator given as a parameter.
	 * 
	 * @param c, Comparator of Student type. To compare two students.
	 */
	public <T> void sort(Comparator<Student> c) {
		Collections.sort(students, c);
	}
}
