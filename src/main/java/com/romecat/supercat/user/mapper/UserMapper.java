package com.romecat.supercat.user.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.romecat.supercat.user.entity.UserEntity;

@Mapper
public interface UserMapper extends BaseMapper<UserEntity>{

}
