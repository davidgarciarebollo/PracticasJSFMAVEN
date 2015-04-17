package datatableconmybatis.view;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import datatableconmybatis.domain.Student;
import datatableconmybatis.service.StudentService;

@ManagedBean
@ViewScoped
public class DataTableStudentsView implements Serializable {

    private static final long serialVersionUID = 5788089416300745533L;
    private Student student;

    private List<Student> students;

    @ManagedProperty("#{studentService}")
    private StudentService studentService;

    @PostConstruct
    public void init() throws IOException {
        student = new Student();
        students = studentService.findAllStudents();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String createStudent() throws IOException {
        studentService.createStudent(student);
        return "dataTableStudents";
    }

}