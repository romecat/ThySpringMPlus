package com.romecat.supercat.user.service;

import java.util.List;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.romecat.supercat.user.entity.UserEntity;

public interface UserService extends IService<UserEntity>{

	List<UserEntity> getUserList();

	UserEntity findUserById(Long userId);

	void delete(Long userId);

	void edit(UserEntity user);

	IPage getUserPage();

}
