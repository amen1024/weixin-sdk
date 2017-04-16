package com.riversoft.weixin.mp.card.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.riversoft.weixin.common.exception.WxRuntimeException;

/**
 * Created by exizhai on 11/30/2015.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Card {

    @JsonProperty("card_type")
    private String cardType;

    @JsonProperty("member_card")
    private Member member;

    @JsonProperty("cash")
    private Cash cash;

    @JsonProperty("gift")
    private Gift gift;

    @JsonProperty("groupon")
    private Groupon groupon;

    @JsonProperty("general_coupon")
    private Coupon coupon;

    @JsonProperty("discount")
    private Discount discount;
    
    /**
     * 自动根据类型解析出baseInfo
     * @return
     */
    public BaseInfo getBaseInfo(){
    	if(this.member != null){
    		return this.member.getBaseInfo();
    	}
    	if(this.cash != null){
    		return this.cash.getBaseInfo();
    	}
    	if(this.gift != null){
    		return this.gift.getBaseInfo();
    	}
    	if(this.groupon != null){
    		return this.groupon.getBaseInfo();
    	}
    	if(this.coupon != null){
    		return this.coupon.getBaseInfo();
    	}
    	if(this.discount != null){
    		return this.discount.getBaseInfo();
    	}
    	throw new WxRuntimeException(999, "未支持的卡券类型！cardType:"+cardType);
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Cash getCash() {
        return cash;
    }

    public void setCash(Cash cash) {
        this.cash = cash;
    }

    public Gift getGift() {
        return gift;
    }

    public void setGift(Gift gift) {
        this.gift = gift;
    }

    public Groupon getGroupon() {
        return groupon;
    }

    public void setGroupon(Groupon groupon) {
        this.groupon = groupon;
    }

    public Coupon getCoupon() {
        return coupon;
    }

    public void setCoupon(Coupon coupon) {
        this.coupon = coupon;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
}
