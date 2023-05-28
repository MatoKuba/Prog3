package ChatApplication.ChatApplication.services;
import ChatApplication.ChatApplication.webDto.UserRegistorDto;
import ChatApplication.ChatApplication.User;
public interface UserService {
	
	  User save(UserRegistorDto registrationDto) ;

}
