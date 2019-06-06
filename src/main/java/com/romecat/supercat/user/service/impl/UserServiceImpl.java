package com.romecat.supercat.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.romecat.supercat.user.entity.UserEntity;
import com.romecat.supercat.user.mapper.UserMapper;
import com.romecat.supercat.user.service.UserService;

@Service("UserService")
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {

	@Autowired
	UserMapper userMapper;
	
	@Override
	public List<UserEntity> getUserList() {
		return userMapper.selectList(new QueryWrapper<UserEntity>(null));
	}

	@Override
	public UserEntity findUserById(Long userId) {
		return userMapper.selectById(userId);
	}

	@Override
	public void delete(Long userId) {
		userMapper.deleteById(userId);
	}

	@Override
	public void edit(UserEntity user) {
		userMapper.updateById(user);
	}

	@Override
	public IPage getUserPage() {

		Page page = new Page<UserEntity>();
		page.setCurrent(1);
		page.setSize(15);
		
		IPage users = userMapper.selectPage(page, new QueryWrapper<UserEntity>(null));
			
		return users;
	}


}
