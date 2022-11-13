package Service;

import Dao.UserDao;
import Dto.User;

public class UserService {
	UserDao userDao;

	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void insert(User user) {
		userDao.insert(user);
	}
}
