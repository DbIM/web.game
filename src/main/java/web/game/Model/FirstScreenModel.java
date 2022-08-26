package web.game.Model;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

@Component
public class FirstScreenModel {
    ModelAndView modelAndView = new ModelAndView();
    public ModelAndView getModel() {
        //modelAndView.setViewName("html/FirstScreen.html");
        modelAndView.setViewName("html/test.html");
        return modelAndView;
    }
}
