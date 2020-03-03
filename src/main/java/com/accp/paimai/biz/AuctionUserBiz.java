package com.accp.paimai.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.paimai.dao.AuctionUserMapper;
import com.accp.paimai.pojo.AuctionUser;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class AuctionUserBiz {
	@Autowired
	private AuctionUserMapper dao;
	
	public AuctionUser login(String name ,String pwd) {
		QueryWrapper<AuctionUser> qw=Wrappers.query();
		qw.eq("userName", name).eq("userPassword", pwd);
		return dao.selectOne(qw);
	}
}
