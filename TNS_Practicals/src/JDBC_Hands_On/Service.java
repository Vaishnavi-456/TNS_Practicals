package JDBC_Hands_On;

import java.sql.SQLException;
import java.util.List;

public interface Service {
	
	public void addStudent(Student s) throws SQLException;
	Student getStudentByRno(int rno) throws SQLException;
	List<Student> getAllStudents()throws SQLException;
	public void deleteStudentByRno(int rno) throws SQLException;
	public void updateStudentByRno(Student s, int rno) throws SQLException;

}
