package com.accp.paimai;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.accp.paimai.biz.AuctionBiz;
import com.accp.paimai.biz.AuctionUserBiz;
import com.accp.paimai.pojo.Auction;

@SpringBootTest
class PaimaiApplicationTests {
	@Autowired
	private AuctionBiz biz;
	@Autowired
	private AuctionUserBiz biz1;
	@Test
	void contextLoads() {
		System.out.println(biz1.login("张三", "12345"));
	}

}
