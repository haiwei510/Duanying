package com.duanying.service;

import java.util.List;

import com.duanying.model.User;
import com.duanying.model.Users;

public interface UserServiceI {
	/**
	 * ����û�
	 * 
	 * @param user
	 */
	void addUser(User user);

	/**
	 * �����û�id��ȡ�û�
	 * 
	 * @param userId
	 * @return
	 */
	User getUserById(String userId);
}
