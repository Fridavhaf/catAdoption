package spring.ukesoppgave;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/add")
    public String add(String field1, String field2){
        try{
            double number1 = Double.parseDouble(field1);
            double number2 = Double.parseDouble(field2);
            return Double.toString(number1+number2);
        }
        catch (Exception e){
            return "error";
        }
    }

    @GetMapping("/subtract")
        public String subtract(String field1, String field2){
        try{
            double number1 = Double.parseDouble(field1);
            double number2 = Double.parseDouble(field2);
            return Double.toString(number1-number2);
        }
        catch (Exception e){
            return "Error";
        }
    }

    @GetMapping("/multiply")
    public String multiply(String field1, String field2){
        try{
            double number1 = Double.parseDouble(field1);
            double number2 = Double.parseDouble(field2);
            return Double.toString(number1*number2);
        }
        catch (Exception e){
            return "Error";
        }
    }


    @GetMapping("/divide")
    public String divide(String field1, String field2){
        try {
            double number1 = Double.parseDouble(field1);
            double number2 = Double.parseDouble(field2);
            return Double.toString(number1/number2);
        }
        catch (Exception e){
            return "Error";
        }
    }
}
