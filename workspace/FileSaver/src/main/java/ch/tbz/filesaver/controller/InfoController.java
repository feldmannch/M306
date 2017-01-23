package ch.tbz.filesaver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ch.tbz.filesaver.models.LoginModel;

@Controller
public class InfoController {

	@RequestMapping(value = "/info.html", method = RequestMethod.GET)
	public String start() {
		return "info";
	}

}
