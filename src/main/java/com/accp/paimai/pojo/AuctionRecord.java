package com.accp.paimai.pojo;

import java.util.Date;

public class AuctionRecord {
    private Integer id;

    private Integer auctionid;

    private Integer userid;

    private Date auctiontime;

    private Float auctionprice;

    @Override
	public String toString() {
		return "AuctionRecord [id=" + id + ", auctionid=" + auctionid + ", userid=" + userid + ", auctiontime="
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

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
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