package com.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mybatis.domain.User;
import com.mybatis.service.UserService;

@Controller       
@RequestMapping("/")
public class LoginController {

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET)
	public String loginPage() {
		return "login";
	}

	@RequestMapping("/signPage")
	public String registerPage() {
		return "sign";
	}

	@RequestMapping(value = "/sign", method = RequestMethod.POST)
	public String register(@RequestParam("name") String name,
			@RequestParam("password1") String password1,
			@RequestParam("password2") String password2, ModelMap model) {
		if (password1.equals(password2)) {
			userService.register(name, password1);
			model.addAttribute("message", "ª∂”≠£∫ " + name);
			return "hello";
		}else{
			model.addAttribute("message", "¡Ω¥Œ√‹¬Î≤ªÕ¨");
			return "hello";
		}

	}

	@RequestMapping("/login")
	public String login(User user, ModelMap model) {
		User user1 = userService.login(user.getName(), user.getPassword());
		if (user1 != null){
			model.addAttribute("message", "ª∂”≠£∫ " + user.getName());
		}
		else {
			model.addAttribute("message", "’À∫≈ªÚ√‹¬Î¥ÌŒÛ");
		}
		return "hello";
	}
}
