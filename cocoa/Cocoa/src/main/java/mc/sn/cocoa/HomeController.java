package mc.sn.cocoa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = { RequestMethod.GET, RequestMethod.POST })
	public String home() {

		return "home";
	}
	
	// 테스트용 주석
}