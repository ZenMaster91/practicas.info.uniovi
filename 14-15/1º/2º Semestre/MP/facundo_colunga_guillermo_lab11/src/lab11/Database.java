package lab11;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>Title: Database</p>
 * <p>Description: Class that simulates a database.</p>
 * <p>Copyright: Copyright (c) 2012</p>
 * <p>Computer Science Engineering School</p>
 * <p>Programming Methodology</p>
 * 
 * @author Lectures of Programming Methodology
 * @version 1.0
 */
public class Database {

	private Map<String, Student> data = new HashMap<String, Student>();
	private File file;

	public void open(String fileName) {
		if(fileName == null || !fileName.contains("."))
			throw new IllegalArgumentException(fileName+" this is not a valid file name.");
		file = new File(fileName);
		if(file.isOpen())
			throw new IllegalStateException(fileName+" is already openned.");
		file.open();
		
		Student student = null;
		do {
			student = (Student) file.read();
			if (student != null) {
				data.put(student.getUniversityID(), student);
			}
		} while (student != null);
	}

	public void write(Student student) {
		if(!file.isOpen())
			throw new IllegalStateException("The file is not openned.");
		else if(student == null)
			throw new IllegalArgumentException("The student to be saved is null.");
		data.put(student.getUniversityID(), student);
	}

	public Student search(String universityID) {
		if(!file.isOpen())
			throw new IllegalStateException("The file is not openned.");
		else if(universityID == null || universityID.isEmpty())
			throw new IllegalArgumentException("The universityID to be searched is null or empty.");
		return data.get(universityID);
	}

	public void close() {
		if(!file.isOpen())
			throw new IllegalStateException("The file is not openned.");
		Collection<Student> students = data.values();
		for (Student student : students) {
			file.write(student);
		}
		file.close();		
		data.clear();
	}

}
