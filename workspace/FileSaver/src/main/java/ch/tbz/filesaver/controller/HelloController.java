package ch.tbz.filesaver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	@RequestMapping(value="/hello.html", method = RequestMethod.GET)
	public void sayHello(final ModelMap model) {
		
		model.put("message", "Hello World!");
	}
}
