package  controller;

/**
 * Created by leosu on 2017/8/17.
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class HelloController {
    @RequestMapping("/hello.action")
    public String hello(ModelMap mv) {
        System.out.printf("leo test xxxxxxx");
        mv.addAttribute("msg", "hello mvc");
        return "hello";
    }
}