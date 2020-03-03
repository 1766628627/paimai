package com.accp.paimai.vo;

import java.util.Date;

public class AuctionsVo {
	  private Integer auctionid;

	    private String auctionname;

	    private Float auctionstartprice;

	    private Float auctionupset;

	    private Date auctionstarttime;

	    private Date auctionendtime;

	    private String auctionpic;

	    private String auctiondesc;

	    private String auctionpictype;
	    
	    private float price;
	    
	    private String name;

		@Override
		public String toString() {
			return "AuctionsVo [auctionid=" + auctionid + ", auctionname=" + auctionname + ", auctionstartprice="
					+ auctionstartprice + ", auctionupset=" + auctionupset + ", auctionstarttime=" + auctionstarttime
					+ ", auctionendtime=" + auctionendtime + ", auctionpic=" + auctionpic + ", auctiondesc="
					+ auctiondesc + ", auctionpictype=" + auctionpictype + ", price=" + price + ", name=" + name + "]";
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
			this.auctionname = auctionname;
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
			this.auctionpic = auctionpic;
		}

		public String getAuctiondesc() {
			return auctiondesc;
		}

		public void setAuctiondesc(String auctiondesc) {
			this.auctiondesc = auctiondesc;
		}

		public String getAuctionpictype() {
			return auctionpictype;
		}

		public void setAuctionpictype(String auctionpictype) {
			this.auctionpictype = auctionpictype;
		}

		public float getPrice() {
			return price;
		}

		public void setPrice(float price) {
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	    
	    
}
