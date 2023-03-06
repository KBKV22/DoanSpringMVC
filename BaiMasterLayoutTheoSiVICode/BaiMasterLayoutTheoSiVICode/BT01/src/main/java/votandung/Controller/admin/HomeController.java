package votandung.Controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "adminHomeController")
public class HomeController {
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public ModelAndView homePage() {		
		ModelAndView mav = new ModelAndView("web/home");
		return mav;
	}
}
