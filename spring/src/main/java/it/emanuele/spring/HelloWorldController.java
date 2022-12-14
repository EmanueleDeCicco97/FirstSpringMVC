 
package it.emanuele.spring;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class HelloWorldController {
	private String message = "Hello World, sono Emanuele";
 
	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		
		model.put("message", this.message);
		
		return "helloWorld";
	}
}