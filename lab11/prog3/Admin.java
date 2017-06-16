package lab11.prog3;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
	  HashMap<Key, Student> hash = new HashMap<Key, Student>();
		for (Student student: students) {
		  String fName = student.getFirstName();
		  String lName = student.getLastName();
		  Key key = new Key(fName, lName);
		  hash.put(key, student);
		}
		return hash;
	}
}
