package maruthi.springframework.spring5jokesappv2.controllers;

import maruthi.springframework.spring5jokesappv2.services.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {


    public JokeController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    private final JokesService jokesService;


    @RequestMapping({"/", ""})
    public String showJoke(Model model){

        model.addAttribute("joke", jokesService.getJoke());
        return "index";
    }
}
