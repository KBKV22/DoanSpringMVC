package votandung.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/quan-tri/admin1")
	public String IndexUser() {		
		return "admin/helloAdmin";
	}
	@RequestMapping("/trang-chu/user1")
	public String IndexAdmin() {		
		return "user/helloUser";
	}
	
	@RequestMapping("/hello123")
	public String IndexAdmin2() {		
		return "user/hello123";
	}
}
