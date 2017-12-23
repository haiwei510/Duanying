package com.duanying.service.user.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.duanying.dao.user.UserMapper;
import com.duanying.model.User;
import com.duanying.model.Users;
import com.duanying.service.UserServiceI;

/**  
 *   
 * 使用@Service注解将UserServiceImpl类标注为一个service  
 * service的id是userService  
 */
@Service
public class UserServiceImpl implements UserServiceI{
	
	@Resource  
	private UserMapper usermapper;
	
	@Override
	public void addUser(User user) {
		
	}

	@Override
	public User getUserById(String userId) {
		
		return usermapper.selectByPrimaryKey(userId);
	}



}
