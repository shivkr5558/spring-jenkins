package spring.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class HomeController {

	@GetMapping("/home")
	public String getMessage() {
		return "Jenkins project";
	}
}
