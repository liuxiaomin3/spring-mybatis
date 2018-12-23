package service;

import java.io.IOException;
import java.util.List;

import pojo.User;

public interface UserService {
	public List<User> getUserListByNameAndRoleId(User user);
	
	// ����û� -->
	public int addUser(User user) throws IOException;
}
