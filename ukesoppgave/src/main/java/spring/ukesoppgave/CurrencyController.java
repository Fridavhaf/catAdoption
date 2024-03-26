package spring.ukesoppgave;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CurrencyController {

    private ArrayList<Currency> currencyRegister = new ArrayList<>();
    @PostMapping("/load")
    public void loadCurrencies() {
        currencyRegister.add(new Currency("USD", 10.56));
        currencyRegister.add(new Currency("EUR", 11.4));
        currencyRegister.add(new Currency("GBP", 13.37));
        currencyRegister.add(new Currency("SEK", 1.02));
        currencyRegister.add(new Currency("BEF", 0.28));
    }

    @PostMapping("/getCurrencies")
    public ArrayList<Currency> getCurrencies(){
        return currencyRegister;
    }

    /*
    calculateValue() method takes a CurrencyValue object as input,
    finds the corresponding currency in the currency register,
    and calculates the converted value in NOK (Norwegian Krone)
    based on the exchange rate.
     */
    @PostMapping("/calculateValue")
    public double calculateValue(CurrencyValue currencyValue){
        for(Currency currency : currencyRegister){
            if(currency.getCurrency().equalsIgnoreCase(currencyValue.getCurrency())){
                return currency.getRate() * currencyValue.getAmount();
            }
        }
        return 0;
    }

}


