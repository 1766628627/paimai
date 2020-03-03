package com.accp.paimai.pojo;

import java.util.Date;

public class Auction {
    private Integer auctionid;

    private String auctionname;

    private Float auctionstartprice;

    private Float auctionupset;

    private Date auctionstarttime;

    private Date auctionendtime;

    private String auctionpic;

    private String auctiondesc;

    private String auctionpictype;

    @Override
	public String toString() {
		return "Auction [auctionid=" + auctionid + ", auctionname=" + auctionname + ", auctionstartprice="
				+ auctionstartprice + ", auctionupset=" + auctionupset + ", auctionstarttime=" + auctionstarttime
				+ ", auctionendtime=" + auctionendtime + ", auctionpic=" + auctionpic + ", auctiondesc=" + auctiondesc
				+ ", auctionpictype=" + auctionpictype + "]";
	}

	public Integer getAuctionid() {
        return auctionid;
    }

    public void setAuctionid(Integer auctionid) {
        this.auctionid = auctionid;
    }

    public String getAuctionname() {
        return auctionname;
    }

    public void setAuctionname(String auctionname) {
        this.auctionname = auctionname == null ? null : auctionname.trim();
    }

    public Float getAuctionstartprice() {
        return auctionstartprice;
    }

    public void setAuctionstartprice(Float auctionstartprice) {
        this.auctionstartprice = auctionstartprice;
    }

    public Float getAuctionupset() {
        return auctionupset;
    }

    public void setAuctionupset(Float auctionupset) {
        this.auctionupset = auctionupset;
    }

    public Date getAuctionstarttime() {
        return auctionstarttime;
    }

    public void setAuctionstarttime(Date auctionstarttime) {
        this.auctionstarttime = auctionstarttime;
    }

    public Date getAuctionendtime() {
        return auctionendtime;
    }

    public void setAuctionendtime(Date auctionendtime) {
        this.auctionendtime = auctionendtime;
    }

    public String getAuctionpic() {
        return auctionpic;
    }

    public void setAuctionpic(String auctionpic) {
        this.auctionpic = auctionpic == null ? null : auctionpic.trim();
    }

    public String getAuctiondesc() {
        return auctiondesc;
    }

    public void setAuctiondesc(String auctiondesc) {
        this.auctiondesc = auctiondesc == null ? null : auctiondesc.trim();
    }

    public String getAuctionpictype() {
        return auctionpictype;
    }

    public void setAuctionpictype(String auctionpictype) {
        this.auctionpictype = auctionpictype == null ? null : auctionpictype.trim();
    }
}