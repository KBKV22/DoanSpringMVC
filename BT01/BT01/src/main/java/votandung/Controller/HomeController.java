package votandung.Controller;






import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/hello123")
	public String Index() {		
		return "hello";
	}
	
	@RequestMapping("/trang-chu")
	public String User() {
		return "layouts/user";
	}
}
