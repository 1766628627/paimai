package com.accp.paimai.action;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.paimai.biz.AuctionUserBiz;
import com.accp.paimai.pojo.AuctionUser;

@RestController
@RequestMapping("/api/users")
public class AuctionUserAction {
	@Autowired
	private AuctionUserBiz biz;
	
	@GetMapping("user/{name}/{pwd}")
	public AuctionUser login(@PathVariable String name,@PathVariable String pwd) {
		
		return biz.login(name, pwd);
	}
}
