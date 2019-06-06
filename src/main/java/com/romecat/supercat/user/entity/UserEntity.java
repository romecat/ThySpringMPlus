package com.romecat.supercat.user.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("rc_user")
public class UserEntity {
	
	@TableId
	private Long userId;         //用户id
	
	private String userName;		//账户名
	
	private String password;		//密码
	
	private String phone;			//电话
	
	private String phonesec;		//备用电话
	
	private String realName;		//真实姓名
	
	private String idcard;			//身份证号
	
	private String sex;				//性别
	
	private String email;			//邮箱
	
	private Integer typeId;			//权限id,100系统管理员,99boss,98部门经理,97员工,1客户,0未归属
	
	private Integer vip;			//是否是vip
	
	private String vipStartTime;	//vip开始时间
	
	private String vipEndTime;		//vip结束时间
	
	private Integer auditState;		//账号实名审核状态,0未通过,1通过,2待审核
	
	private Integer status;			//账号禁用状态,0异常禁用,1正常启用
	
	private String image;			//用户头像
	
	private String addTime;			//用户创建时间
	
	private String addUser;			//创建人真实姓名
	

}
