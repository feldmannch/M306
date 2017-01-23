package ch.tbz.filesaver.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import ch.tbz.filesaver.commons.FSConstants;
import ch.tbz.filesaver.models.SessionModel;
import ch.tbz.filesaver.models.User;

@Controller
@SessionAttributes(FSConstants.SESSION_MODEL)
public class UserManagementController {

	@RequestMapping(value = "/usermanagement.html", method = RequestMethod.GET)
	public void openPage(final ModelMap model, HttpSession httpSession) {
		SessionModel sessionModel = new SessionModel();
		sessionModel = (SessionModel) httpSession.getAttribute(FSConstants.SESSION_MODEL);
		model.put("username", sessionModel.getUsername());
		model.put("password", sessionModel.getPassword());
		model.put("usertype", sessionModel.getUserType());
		ArrayList<User> users = new ArrayList();
		User testUser1 = new User(1, "Feldmann", "Andri", "andrif", 1);
		User testUser2 = new User(2, "Wey", "Jamina", "jaminaw", 0);
		users.add(testUser1);
		users.add(testUser2);
		model.put("userArray", users);
	}

	@RequestMapping(value = "/newUser.html", method = RequestMethod.POST)
	public String createNewUser(final ModelMap model, HttpSession httpSession,
			@RequestParam(required = true) String firstname, @RequestParam(required = true) String surname,
			@RequestParam(required = true) String username, @RequestParam(required = true) String usertype,
			@RequestParam(required = true) String password) {
		SessionModel sessionModel = new SessionModel();
		sessionModel = (SessionModel) httpSession.getAttribute(FSConstants.SESSION_MODEL);
		model.put("username", sessionModel.getUsername());
		model.put("password", sessionModel.getPassword());
		model.put("usertype", sessionModel.getUserType());
		ArrayList<User> users = new ArrayList();
		User testUser1 = new User(1, "Feldmann", "Andri", "andrif", 1);
		User testUser2 = new User(2, "Wey", "Jamina", "jaminaw", 0);
		User testUser3 = new User(3, surname, firstname, username, usertype.charAt(0));
		users.add(testUser1);
		users.add(testUser2);
		users.add(testUser3);
		model.put("userArray", users);
		return "usermanagement";
	}
	
	@RequestMapping(value = "/deleteUser.html", method = RequestMethod.POST)
	public String deleteUser(final ModelMap model, HttpSession httpSession,
			@RequestParam(required = true) int userID){
		System.out.println(userID);
		return "usermanagement";
	}
}
