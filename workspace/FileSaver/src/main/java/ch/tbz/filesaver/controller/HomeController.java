package ch.tbz.filesaver.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import ch.tbz.filesaver.commons.FSConstants;
import ch.tbz.filesaver.models.SessionModel;
import ch.tbz.filesaver.urlCrypter.URLCrypter;

@Controller
@SessionAttributes(FSConstants.SESSION_MODEL)
public class HomeController {

	@RequestMapping(value = "/home.html", method = RequestMethod.GET)
	public void openPage(final ModelMap model, HttpSession httpSession,
			@RequestParam(required = false) String url) {
		
		SessionModel sessionModel = new SessionModel();
		sessionModel = (SessionModel) httpSession.getAttribute(FSConstants.SESSION_MODEL);
		model.put("username", sessionModel.getUsername());
		model.put("password", sessionModel.getPassword());
		model.put("usertype", sessionModel.getUserType());
	}
}
