package datatableconmybatis.mappers;

import java.util.List;

import datatableconmybatis.domain.Student;

public interface StudentMapper {
	List<Student> findAllStudents();
	Student findStudentById(Integer id);
	void insertStudent(Student student);
}
