package service.impl;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import pojo.User;
import service.UserService;
import dao.UserMapper;

//@Service("userService")
//@Scope("prototype")
public class UserServiceImpl implements UserService{
	//@Resource
	private UserMapper userMapper;
	
	public UserMapper getUserMapper() {
		return userMapper;
	}


	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}


	@Override
	public List<User> getUserListByNameAndRoleId(User user) {
		return userMapper.getUserListByNameAndRoleId(user);
	}
	
	
	@Override
	public int addUser(User user) throws IOException {
		int result = userMapper.addUser(user);
		//int c=10/0;
		//check“Ï≥£
		File file = new File("e:\\up\\a.txt");
		file.createNewFile();
		return result;
	}	
	
	

}
