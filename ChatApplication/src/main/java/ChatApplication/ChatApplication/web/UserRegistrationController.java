package ChatApplication.ChatApplication.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ChatApplication.ChatApplication.services.UserService;
import ChatApplication.ChatApplication.webDto.UserRegistorDto;

@Controller
@RequestMapping("/Registor")
public class UserRegistrationController {
private UserService userService;

public UserRegistrationController(UserService userService) {
	super();
	this.userService = userService;
}
@ModelAttribute("user")
public UserRegistorDto Userregister() {
	return new UserRegistorDto();
}
@GetMapping
public String shoeRegistration() {
	return "Regidtred";
}
@PostMapping
public String registerUserAccount(@ModelAttribute("user") UserRegistorDto registration) {
	
	userService.save(registration);
	return "Success";
}
}
