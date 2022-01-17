package ProjectPractice;

import java.util.ArrayList;

public class School {
	
	private static School instance = new School();
	private static final String SCHOOL_NAME = "Good School";
	private ArrayList<Student> studentList = new ArrayList<>();
	private ArrayList<Subject> subjectList = new ArrayList<>();
	
	public static School getInstance() {
		if(instance==null) 
			instance = new School();
		return instance;
	}
	
	public void addSubject(Subject subject) {
		subjectList.add(subject);
	}
	
	public void addStudent(Student student) {
		studentList.add(student);
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	public ArrayList<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(ArrayList<Subject> subjectList) {
		this.subjectList = subjectList;
	}	
}
