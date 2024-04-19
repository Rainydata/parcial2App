package eam.app.sprint.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import eam.app.sprint.model.User;
import eam.app.sprint.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Controller
public class WebController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping(value = { "/", "/login" })
	public String getLogin() {
		return "login";
	}

	@GetMapping("/admin")
	public String getAdminPanel() {
		return "admin";
	}

	@GetMapping("/user")
	public String getUser() {
		return "user";
	}

	@GetMapping("/register")
	public String getRegister() {
		return "register-user";
	}

	@PostMapping("register")
	public String registerUser(User user, BCryptPasswordEncoder passwordEncoder) {
		user.setUserPassword(passwordEncoder.encode(user.getUserPassword()));
		user.setUserRol("ROLE_USER");
		userRepository.save(user);
		return "redirect:/login";
	}

}
