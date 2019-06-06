package com.romecat.supercat.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.romecat.supercat.user.entity.UserEntity;
import com.romecat.supercat.user.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String index() {
		return "redirect:/userpage.html";
	}
	
	@RequestMapping("/userpage.html")
	public String userpage(Model model) 
	{
		
		IPage page = userService.getUserPage();
		model.addAttribute("users",page);
		return "user/users1";
	}
	 
	@RequestMapping("/users.html")
	public String list(Model model) {
		List<UserEntity> users = userService.getUserList();
		model.addAttribute("users",users);
		return "user/users";
	}
	
	@RequestMapping("/userAdd.html")
    public String userAdd() {
        return "user/userAdd";
    }

    @RequestMapping("/add")
    public String add(UserEntity user) {
        userService.save(user);
        return "redirect:/userpage.html";
    }

    @RequestMapping("/userEdit.html")
    public String toEdit(Model model,Long userId) {
    	UserEntity user=userService.findUserById(userId);
        model.addAttribute("user", user);
        return "user/userEdit";
    }

    @RequestMapping("/edit")
    public String edit(UserEntity user) {
        userService.edit(user);
        return "redirect:/userpage.html";
    }

    @RequestMapping("/userDelete")
    public String delete(Long userId) {
        userService.delete(userId);
        return "redirect:/userpage.html";
    }
    
    
    @RequestMapping("/index.html")
    public String indexj() {
    	return "user/index.html";
    }

	
}
