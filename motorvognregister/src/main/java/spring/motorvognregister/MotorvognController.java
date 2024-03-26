package spring.motorvognregister;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MotorvognController {
    private final List<Motorvogn> alleMotorvogner = new ArrayList<>();
    @PostMapping("/save")
    public void saveCars(Motorvogn innMotorvogn){alleMotorvogner.add(innMotorvogn);}

    @GetMapping("/getAll")
    public List<Motorvogn> getAll(){
        return alleMotorvogner;
    }

    @GetMapping("/deleteAll")
    public void slettAlle(){
        alleMotorvogner.clear();
    }
}

