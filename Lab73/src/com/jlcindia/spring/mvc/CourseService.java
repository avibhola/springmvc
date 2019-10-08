package com.jlcindia.spring.mvc;
import java.util.ArrayList;

public class CourseService {
	public ArrayList<String> getCourses(){
	ArrayList<String> al=new ArrayList<String>();
	al.add("java");
	al.add("jdbc");
	al.add("servlets");
	al.add("JSP");
	al.add("Struts");
	al.add("jsf");
	return al;
}
}
