package Service;

import Dao.User;
import Dto.UserDto;

public class UserService {
	UserDto userDto;

	public UserService(UserDto userDto) {
		this.userDto = userDto;
	}
	
	public void insert(User user) {
		userDto.insert(user);
	}
}
