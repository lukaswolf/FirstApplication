package pl.lukaszwilk.FirstApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.lukaszwilk.FirstApplication.models.forms.RegisterForm;

@Controller
public class RegisterController {
//    @RequestMapping(value = "/register",method = RequestMethod.POST)
//
//    public String registerPost(@RequestParam("login") String login,
//                               @RequestParam("password") String password,
//                               @RequestParam("passwordRepeat") String repeatPassword, Model model){
//        String text = password.equals(repeatPassword) ? "Zarejstrowano": "Nie zarestrowano";
//        model.addAttribute("info",text);
//        return "register";
//
//    }
//
//    @RequestMapping(value = "/register",method = RequestMethod.GET)
//
//    public String registerPost(){
//       return "register";
//
//    }

        @RequestMapping(value = "/register",method = RequestMethod.POST)

    public String registerPost(@ModelAttribute("registerForm") RegisterForm form ,Model model){

            model.addAttribute("info","rejestracja przebiegla pomyslnie");

        return "register";

    }

    @RequestMapping(value = "/register",method = RequestMethod.GET)

    public String registerPost(Model model){
        model.addAttribute("registerForm",new RegisterForm());
       return "register";

    }

}
