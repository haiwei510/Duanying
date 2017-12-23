package com.duanying.dao.user;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.duanying.model.User;

public interface UserMapper {
	int deleteByPrimaryKey(String userId);

	int insert(User record);

	int insertSelective(User record);
	
	User selectByPrimaryKey(String userId);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);

}
