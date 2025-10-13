package Comparaters;

import java.util.Comparator;
import com.demo.beans.*;


public class MyIdComparater implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getId()-o2.getId();
	}

}
