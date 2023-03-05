package votandung.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AAAA {
	
	@RequestMapping("/trang1")
	public String IndexUser() {		
		return "hello1";
	}
	@RequestMapping("/trang2")
	public String IndexAdmin() {		
		return "hello2";
	}
}