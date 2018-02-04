package pl.lukaszwilk.FirstApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class MainControllers {





    @RequestMapping(value = "/", method = RequestMethod.GET)
   // @ResponseBody
    public String values(Model model){
        Random random = new Random();
        String[] text = {"Kanapka","Pączek","Pasztet","Swinia"};
        model.addAttribute("helloMsg",text[new Random().nextInt(text.length)]);

        return "index";
    }
//do przekazywania danych z strony Wazne PathVariable
    @RequestMapping(value = "/message/{text}", method = RequestMethod.GET)
    @ResponseBody
    public String lukasz(@PathVariable("text") String text){

        return "<center>" + text + "</center>";
    }
    @RequestMapping(value = "/age/{text}", method = RequestMethod.GET)
    @ResponseBody
    public String age(@PathVariable("text") int text){
        return text>18  ?"Jesteś pełnoletni" :" Wypad";

    }

    public static class RegisterController {
    }
}
