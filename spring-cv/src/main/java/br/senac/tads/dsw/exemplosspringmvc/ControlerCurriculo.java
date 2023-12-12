package br.senac.tads.dsw.exemplosspringmvc;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author costta20
 */

@Controller
@RequestMapping("/curriculo")
public class ControlerCurriculo {
    
    @GetMapping("/samueljosedacosta")
    public ModelAndView mostraCurriculo() {
        ModelAndView mv = new ModelAndView("curriculum.html");
        Curriculo samuel = criaCurriculo();
        mv.addObject("curriculo", samuel);
        return mv;
    }
    
    public Curriculo criaCurriculo() {
        String[] conhecimentos = {"Java", "HTML", "CSS", "JS"}, experiencias = {"Logística - 2013 - 2015", "Atendente Loja - 2017 - o momento"}, escolaridade = {"Ensino médio - completo", "Superior - TADS - em andamento"}, idiomas = {"Português - Nativo", "Inglês - Básico"};
        
        Curriculo curriculo = new Curriculo(1, 25, "Samuel", "José da Costa", "11/01/2003", "(11) 99961-8857", "Samuel José da Costa", "https://github.com/Costta20", conhecimentos, experiencias, escolaridade, idiomas);
        
        return curriculo;
    }
}