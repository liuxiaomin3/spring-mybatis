package dao;

import java.util.List;

import pojo.User;

public interface UserMapper {
	//�����û�����ģ����ѯ���ͽ�ɫid��ѯ�û��б�
	public List<User> getUserListByNameAndRoleId(User user);
	
	// ����û� -->
	public int addUser(User user);
}
