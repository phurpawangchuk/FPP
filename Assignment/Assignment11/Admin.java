package Assignment11;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implements
        HashMap<Key, Student> studentHashMap = new HashMap<>();

        for(Student std: students){
            Key key = new Key(std.getFirstName(), std.getLastName());
            studentHashMap.put(key, std);
        }

		return studentHashMap;
	}
	public static double computeAverageGPA(HashMap<Key,Student> maps){
       //implements
        double avgSum = 0.0;
        for(Map.Entry<Key, Student> entry: maps.entrySet()){
            avgSum += entry.getValue().getGpa();
        }
        int totalStd = maps.size();

		return avgSum/totalStd;
    }
}
