package pl.lukaszwilk.FirstApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.lukaszwilk.FirstApplication.models.forms.CarForm;

import javax.validation.Valid;
import java.util.Locale;

@Controller
public class CarController {

    @Autowired
    MessageSource messageSource;



    @RequestMapping(value = "/car",method = RequestMethod.POST)
    public String cars(@ModelAttribute("carForm") @Valid CarForm form, BindingResult result, Model model){
        if (result.hasErrors()){
            model.addAttribute("info",    "Wypełnij poprawnie formularz" );
            return "car";
        }

        model.addAttribute("info",    form.getProduktionYear() );
        model.addAttribute("infoColor",form.getProduktionYear()>=2000 ? "green" : "red");
        return "car" ;
    }

    @RequestMapping(value = "/car",method = RequestMethod.GET)
    public String cars(Locale locale ,Model model){
       String s= messageSource.getMessage("hello.message",new Object[]{"oskar"},locale);
        System.out.println(s);
        model.addAttribute("carForm",new CarForm());
        return "car";
    }
}
