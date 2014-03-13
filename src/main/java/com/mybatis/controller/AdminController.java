package com.mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mybatis.domain.User;
import com.mybatis.service.UserService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/getUser.do")
	public ModelAndView getUser(){
		List<User> users = userService.getAllUser();
		ModelAndView model = new ModelAndView("admin");
		model.addObject("lists", users);
		return model;
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("id") int id){
		userService.deleteUser(id);
		return "redirect:/admin/getUser";
	}
	
	@RequestMapping("/update")
	public String updatePassword(User user){
		userService.update(user);
		return "redirect:/admin/getUser";
	}
}
