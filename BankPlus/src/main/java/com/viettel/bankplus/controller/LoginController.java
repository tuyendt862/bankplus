package com.viettel.bankplus.controller;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.viettel.bankplus.dto.LoginDTO;
import com.viettel.bankplus.entity.User;
import com.viettel.bankplus.service.BaseService;

@Controller
public class LoginController {

	private static final Logger LOGGER = Logger.getLogger(LoginController.class);

	@Autowired
	private BaseService baseService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		LoginDTO loginDto = new LoginDTO();
		model.addAttribute("loginDto", loginDto);
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(Model model, @Valid @ModelAttribute("loginDto") LoginDTO loginDto, BindingResult result) {
		try {
			User u = baseService.getUser(1);
			// result.rejectValue("userName", "not empty","not empty");
			if (result.hasErrors()) {
				return "login";
			}
			return "redirect:/home";
		} catch (Exception ex) {
			LOGGER.error(ex);
		}
		return "login";
	}
}
