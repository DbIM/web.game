package web.game.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import web.game.Model.FirstScreenModel;

@RestController
public class HelloGame {

    @GetMapping(value = "/hello")
    public ModelAndView welcome() {
        FirstScreenModel model = new FirstScreenModel();
        return model.getModel();
    }
}
