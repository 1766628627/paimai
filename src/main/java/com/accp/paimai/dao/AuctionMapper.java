package com.accp.paimai.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.paimai.pojo.Auction;
import com.accp.paimai.vo.AuctionVo;
import com.accp.paimai.vo.AuctionsVo;

public interface AuctionMapper {
   List<Auction> queryAll();
   AuctionVo query(@Param("id")Integer id);
   List<AuctionsVo> queryend();
}