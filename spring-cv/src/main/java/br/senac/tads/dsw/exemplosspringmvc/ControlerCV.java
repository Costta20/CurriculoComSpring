package br.senac.tads.dsw.exemplosspringmvc;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/cv")
public class ControlerCV {
    
    @GetMapping("/rafael-goulart")
    public ModelAndView showCV() {
        ModelAndView mv = new ModelAndView("curriculum.html");
        Who rafael = newWho();
        mv.addObject("who", rafael);
        return mv;
    }
    
    public Who newWho() {
        String skills[] = {"Java", "HTML, CSS, JavaScript", "Bootstrap", "Python", "SQL", "Selenium", "VBA"},
               experiences[] = {"Autônomo", "Servix"},
               experiencesDescription[] = {"Técnico de Informática - Jan/2020 à Jan/2021", "Estagiário - Ago/2022 até o momento"},
               schools[] = {"ETEC - Irmã Agostina", "Centro Universitário SENAC"},
               schoolsDescription[] = {"Ensino Técnico - Desenvolvimento de Sistemas - 2019 à 2021", "Ensino Superior - Análise e Desenvolvimento de Sistemas - Fev/2022 até o momento"},
               idiomes[] = {"Português", "Inglês"},
               idiomesDescription[] = {"Nativo", "Fluente"};
        
        Who who = new Who(
                1,
                "Rafael",
                "Goulart",
                20,
                "11/01/2003",
                "(11) 97740-6137",
                "https://www.linkedin.com/in/rafael-ferreira-goulart-6a682a200/",
                "https://github.com/RafaelEtec",
                skills,
                experiences,
                experiencesDescription,
                schools,
                schoolsDescription,
                idiomes,
                idiomesDescription);
        
        return who;
    }
}