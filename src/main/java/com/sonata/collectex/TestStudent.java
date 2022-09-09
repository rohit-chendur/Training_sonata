package com.sonata.collectex;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestStudent {

	public static void main(String[] args) {
		
		List<Student> s1 = new LinkedList<Student>();
		s1.add(new Student(123,"Rohit",22));
		s1.add(new Student(456,"Jay",22));
		s1.add(new Student(789,"Sahana",22));
		
		Collections.sort(s1, Collections.reverseOrder() 	);
		for(Student st:s1) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		
	}

}
