package com.accp.paimai.vo;

import java.util.List;

import com.accp.paimai.pojo.Auction;
import com.accp.paimai.pojo.AuctionRecord;

public class AuctionVo {
	private Auction auction;
	private List<AuctionRecordVo> list;
	
	@Override
	public String toString() {
		return "AuctionVo [auction=" + auction + ", list=" + list + "]";
	}
	public Auction getAuction() {
		return auction;
	}
	public void setAuction(Auction auction) {
		this.auction = auction;
	}
	public List<AuctionRecordVo> getList() {
		return list;
	}
	public void setList(List<AuctionRecordVo> list) {
		this.list = list;
	}
	
	
}
