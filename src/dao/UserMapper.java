package dao;

import java.util.List;

import pojo.User;

public interface UserMapper {
	//根据用户名（模糊查询）和角色id查询用户列表
	public List<User> getUserListByNameAndRoleId(User user);
	
	// 添加用户 -->
	public int addUser(User user);
}
