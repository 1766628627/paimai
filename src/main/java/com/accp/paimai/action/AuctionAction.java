package com.accp.paimai.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.paimai.biz.AuctionBiz;
import com.accp.paimai.pojo.Auction;
import com.accp.paimai.vo.AuctionVo;
import com.accp.paimai.vo.AuctionsVo;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/aucs")
public class AuctionAction {
	@Autowired
	private AuctionBiz biz;
	
	@GetMapping("auc/{pageNum}")
	public PageInfo<Auction> queryAll(@PathVariable Integer pageNum){
		return biz.queryAll(pageNum);
	}
	@GetMapping("au/{id}")
	public AuctionVo query(@PathVariable Integer id){
		return biz.query(id);
	}
	
	@GetMapping
	public List<AuctionsVo> queryend(){
		return biz.queryend();
	}


}
