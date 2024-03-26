import com.example.demo1_01march.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BasicController {

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello world";
    }

    @GetMapping("/student")
    public Student showStudent(){
        Student stud1 = new Student("John",23,"OsloMet");
        return stud1;
    }
    @GetMapping("/students")
    public List<Student> showStudents(){
        Student stud1 = new Student("John",23,"OsloMet");
        Student stud2 = new Student("Frida", 24, "Oslomet");
        Student stud3 = new Student("Audun", 24, "Oslomet");
        List<Student> studList = new ArrayList<>();
        studList.add(stud1);
        studList.add(stud2);
        studList.add(stud3);

        return studList;
    }
}
