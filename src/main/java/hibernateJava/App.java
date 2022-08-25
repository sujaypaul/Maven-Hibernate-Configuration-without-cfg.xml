package hibernateJava;


import java.util.List;

import hibernateJava.dao.StudentDao;
import hibernateJava.entity.Student;


public class App {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
        Student student = new Student("Sujay", "Paul", "sujay.paul.312@proton.me");
        studentDao.saveStudent(student);

        List<Student> students = studentDao.getStudents();
        students.forEach(s -> System.out.println(s.getFirstName()));
    }
}