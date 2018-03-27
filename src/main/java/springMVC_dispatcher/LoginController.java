package springMVC_dispatcher;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

	@RequestMapping(value="home")
	@ResponseBody
	public String hello(){
		System.out.println("-------------- got the hit-----------------");
		return "Yo! runt";
	}
}
