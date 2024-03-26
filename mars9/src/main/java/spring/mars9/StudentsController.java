package spring.mars9;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentsController {
    /*It is common to use List when instantiating an array on a server.
    Then alleStudenter only cares about it being a List, not specifically an ArrayList.
    This provides flexibility, as you can change the implementation later without affecting
    the rest of the code.
    final: once it's initialized, it cannot be reassigned to refer to a different object.*/
    private final List<Student> alleStudenter = new ArrayList<>();
    @PostMapping("/lagre")
    public void lagreKunde(Student innStudent){
        alleStudenter.add(innStudent);
    }
    @GetMapping("/hentAlle")
    public List<Student> hentAlle(){
        return alleStudenter;
    }
}
