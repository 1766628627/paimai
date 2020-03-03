package com.accp.paimai.vo;

import java.util.Date;

public class AuctionRecordVo {
	private Integer id;

    private Integer auctionid;

    private String username;

    private Date auctiontime;

    private Float auctionprice;

	@Override
	public String toString() {
		return "AuctionRecordVo [id=" + id + ", auctionid=" + auctionid + ", username=" + username + ", auctiontime="
				+ auctiontime + ", auctionprice=" + auctionprice + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAuctionid() {
		return auctionid;
	}

	public void setAuctionid(Integer auctionid) {
		this.auctionid = auctionid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getAuctiontime() {
		return auctiontime;
	}

	public void setAuctiontime(Date auctiontime) {
		this.auctiontime = auctiontime;
	}

	public Float getAuctionprice() {
		return auctionprice;
	}

	public void setAuctionprice(Float auctionprice) {
		this.auctionprice = auctionprice;
	}
    
    
}
