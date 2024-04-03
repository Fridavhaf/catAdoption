package spring.playingwithendpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CatController {
    private List<Cat> catList = new ArrayList<>();

    @PostMapping("/saveCat")
    public void saveCat(Cat cat) {
        catList.add(cat);
    }


    @GetMapping("/showCats")
    public List<Cat> returnCats() {
        return catList;
    }
}

