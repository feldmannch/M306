package ch.tbz.filesaver.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import ch.tbz.filesaver.commons.FSConstants;
import ch.tbz.filesaver.models.LoginModel;
import ch.tbz.filesaver.models.SessionModel;
import ch.tbz.filesaver.urlCrypter.URLCrypter;

@Controller
@SessionAttributes(FSConstants.SESSION_MODEL)
public class LoginController {

	@RequestMapping(value = "/login.html", method = RequestMethod.GET)
	public void openPage(final LoginModel model, HttpSession httpSession) {
		model.setUsername("Hello World");
		httpSession.setAttribute(FSConstants.SESSION_MODEL, null);
	}

	@RequestMapping(value = "/login.html", method = RequestMethod.POST)
	public String login(HttpSession httpSession, @RequestParam(required = false) String username,
			@RequestParam(required = false) String password) {
		SessionModel sessionModel = new SessionModel();

		
		if (username.equals("admin") && password.equals("admin")) {
			sessionModel.setUsername(username);
			sessionModel.setPassword(password);
			sessionModel.setUserType(0);
			httpSession.setAttribute(FSConstants.SESSION_MODEL, sessionModel);
			return "redirect:home.html";
		} else {
			return "login";
		}
	}
	
}
