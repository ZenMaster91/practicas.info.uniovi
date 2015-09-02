package laboratory10.university;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;

public class Application {
	
	private static University university = new University();
	private static Comparator<Student> ageC = new AgeComparator();
	private static Comparator<Student> idC = new IDComparator();
	private static Comparator<Student> snC = new SNComparator();

	public static void main(String[] args) {
		addStuff();
		System.out.println("--- LIST WITH ALL THE STUDENTS ---");
		university.list();

		System.out.println("\n--- LIST WITH ALL THE STUDENTS SORTED BY SURNAME AND NAME ---");
		university.sort();
		university.list();
		
		System.out.println("\n--- LIST WITH ALL THE STUDENTS SORTED BY AGE ---");
		university.sort(ageC);
		university.list();
		
		System.out.println("\n--- LIST WITH ALL THE STUDENTS SORTED BY ID ---");
		university.sort(idC);
		university.list();
		
		System.out.println("\n--- LIST WITH ALL THE STUDENTS SORTED BY SURNAME AND NAME FORCED ---");
		university.sort(snC);
		university.list();
		
		System.out.println("\n--- LIST WITH ALL THE STUDENTS FOR THE GROUP 5 ---");
		System.out.println(university.getLaboratoryStudents("5").toArray());
		System.out.println("\n--- LIST WITH ALL THE STUDENTS FOR THE GROUP uo2 ---");
		System.out.println(university.getLaboratoryStudents("uo2").toArray());
	}
	
	private static void addStuff()
	{
		int age = 0;
		BufferedReader br = null;
		try {
			String sCurrentLine;
			br = new BufferedReader(new FileReader("names.txt"));
			while ((sCurrentLine = br.readLine()) != null) {
				String[] parts = sCurrentLine.split(",");
				age = 15 + (int)(Math.random()*25);
				Student newStudent = new Student(parts[0], parts[1], age, parts[2]);
				university.add(newStudent);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

}
