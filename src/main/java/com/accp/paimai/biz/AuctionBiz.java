package com.accp.paimai.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.paimai.dao.AuctionMapper;
import com.accp.paimai.pojo.Auction;
import com.accp.paimai.vo.AuctionVo;
import com.accp.paimai.vo.AuctionsVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class AuctionBiz {
	@Autowired
	private AuctionMapper dao;
	public PageInfo<Auction> queryAll(Integer pageNum) {
		PageHelper.startPage(pageNum, 5);// 开始分页
		PageInfo<Auction> pageInfo=new PageInfo<Auction>(dao.queryAll());
		return pageInfo;
	}
	
	public AuctionVo query(Integer id) {
		return dao.query(id);
	}
	public List<AuctionsVo> queryend() {
		return dao.queryend();
	}
}
