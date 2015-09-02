package laboratory10.university;

import static org.junit.Assert.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import guillermo.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class UniversityTest {
	private University university;
	private Student s1, s2, s3, s4;
	private Comparator<Student> ageC, idC, snC;
	
	@Before
	public void setUp() {
		university = new University();
		s1 = new Student("Guillermo", "Facundo Colunga", 19, "123456a");
		s2 = new Student("Alejandro", "Fernández Fernández", 20, "323456b");
		s3 = new Student("Roberto", "Fernández Díaz", 17, "523456a");
		s4 = new Student("Katia", "Fernández Fernández", 21, "423456b");
		ageC = new AgeComparator();
		idC = new IDComparator();
		snC = new SNComparator();
		
		//Adding some elements...
		university.add(s1);
		university.add(s2);
		university.add(s3);
		university.add(s4);
	}
	
	@Test (expected= IllegalArgumentException.class)
	public void addTest() {
		//s2 will be equal to s1, an student that already exists.
		s2 = new Student("Guillermo", "Facundo Colunga", 19, "123456a");
		university.add(s2); //Must throw an IllegalArgumentException.
	}

	@Test
	public void sorTtest() {
		
		//Creating an expected return address
		List<Student> result = new ArrayList<Student>();
		result.add(s1);
		result.add(s3);
		result.add(s2);
		result.add(s4);
		
		university.sort(); //Sorting the university array.
		assertEquals(result, university.getAllStudents());

		//Printing the list...
		System.out.println("\n--- surname, name\n");
		university.list();
		
		university.sort(ageC); //Sorting the university array.
		Collections.sort(result, ageC); //Sorting the result array.
		assertEquals(result, university.getAllStudents());
		
		//Printing the list...
		System.out.println("\n --- age \n");
		university.list();
		
		
		university.sort(idC); //Sorting the university array.
		Collections.sort(result, idC); //Sorting the result array.
		assertEquals(result, university.getAllStudents());
		
		//Printing the list...
		System.out.println("\n --- id \n");
		university.list();
		
				
		university.sort(snC); //Sorting the university array.
		Collections.sort(result, snC); //Sorting the result array.
		assertEquals(result, university.getAllStudents());
		
		//Printing the list...
		System.out.println("\n--- surname, name forced\n");
		university.list();
	}
	
	@Test
	public void getLaboratoryStudentsTest() {
		
		//Creating an expected return address
		List<Student> resultA = new ArrayList<Student>();
		resultA.add(s1);
		resultA.add(s3);
		System.out.println("\nStudents for group A: "+ university.getLaboratoryStudents("a").toArray());
		assertEquals(resultA, university.getLaboratoryStudents("a").toArray());
		
		List<Student> resultB = new ArrayList<Student>();
		resultB.add(s2);
		resultB.add(s4);
		System.out.println("Students for group B: "+ university.getLaboratoryStudents("b").toArray());
		assertEquals(resultA, university.getLaboratoryStudents("a").toArray());
	}

}
