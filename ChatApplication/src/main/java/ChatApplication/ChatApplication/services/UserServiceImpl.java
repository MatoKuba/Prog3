package ChatApplication.ChatApplication.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import ChatApplication.ChatApplication.repository.UserRepo;
import ChatApplication.ChatApplication.User;
import ChatApplication.ChatApplication.webDto.UserRegistorDto;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepo userRepository;
	public UserServiceImpl(UserRepo userRepository) {
		super();
		this.userRepository = userRepository;
	}
	@Override
	public User save(UserRegistorDto registrationDto) {
		User user=new User(registrationDto.getFirstName(),
				registrationDto.getLastName(),
				registrationDto.getEmail(),
				registrationDto.getPassword()
				
				);
		return userRepository.save(user);
	}


}
