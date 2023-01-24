package ProjectPractice;

import java.util.ArrayList;


public class GenerateGradeReport {
	
	School school = School.getInstance();
	public static final String TITLE = " 수강생 학점 \t\t\n";
	public static final String HEADER = "이름 | 학번 | 중점과목 | 점수 \n";
	public static final String LINE = "-----------------------------------\n";
	StringBuffer buffer = new StringBuffer();
	
	public String getReport() {
		ArrayList<Subject> subjectList = school.getSubjectList();
		for(Subject subject:subjectList) {
			makeHeader(subject);
			makeBody(subject);
			makeFooter();
		}
		return buffer.toString();
	}
	
	public void makeHeader(Subject subject) {
		buffer.append(LINE);
		buffer.append("\t" + subject.getSubjectName());
		buffer.append(TITLE);
		buffer.append(HEADER);
		buffer.append(LINE);
	}
	
	public void makeBody(Subject subject) {
		ArrayList<Student> studentList = school.getStudentList();
		for(Student student : studentList) {
			buffer.append(student.getStudentName() + " | ");
			buffer.append(student.getStudentId() + " | ");
			buffer.append(student.getMajorSubject().getSubjectName() + "\t | ");
			getScoreGrade(student, subject.getSubjetId());
			buffer.append("\n");
			buffer.append(LINE);
		}
	}
	
	public void getScoreGrade(Student student, int subjectId) {
		ArrayList<Score> scoreList = student.getScoreList();
		int majorId = student.getMajorSubject().getSubjetId();
		
		GradeEvaluation[] gradeEvaluation = {new BasicEvaluation(), new MajorEvaluation()};
		
		for(Score score : scoreList) {
			if(score.getSubject().getSubjetId()==subjectId) {
				String grade;
				if(score.getSubject().getSubjetId()==majorId)
					grade = gradeEvaluation[Define.SAB_TYPE].getGrade(score.getPoint());
				else
					grade = gradeEvaluation[Define.SAB_TYPE].getGrade(score.getPoint());
				buffer.append(score.getPoint());
				buffer.append(":");
				buffer.append(grade);
				buffer.append(" | ");
			}
		}
		
	}
	
	public void makeFooter() {
		buffer.append("\n");
	}
	
}
