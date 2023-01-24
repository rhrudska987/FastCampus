package ProjectPractice;

import java.util.ArrayList;

public class Subject {
	
	private String subjectName;
	private int subjetId;
	private int gradeType;
	
	private ArrayList<Student> studentList = new ArrayList<>();
	
	public Subject(String subjectName, int subjectId) {
		this.subjectName = subjectName;
		this.subjetId = subjectId;
		this.gradeType = Define.AB_TYPE;
	}
	
	public void register(Student student) {
		studentList.add(student);
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSubjetId() {
		return subjetId;
	}

	public void setSubjetId(int subjetId) {
		this.subjetId = subjetId;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	
}
