package com.riversoft.weixin.mp.card.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by exizhai on 11/30/2015.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Merchants {

    @JsonProperty("info_list")
    private List<Info> infoList;

    @JsonProperty("next_begin_id")
    private Long nextBeginId;
    
    
    
    public List<Info> getInfoList() {
		return infoList;
	}



	public void setInfoList(List<Info> infoList) {
		this.infoList = infoList;
	}



	public Long getNextBeginId() {
		return nextBeginId;
	}



	public void setNextBeginId(Long nextBeginId) {
		this.nextBeginId = nextBeginId;
	}



	public static class Info{
    	@JsonProperty("merchant_id")
    	private Long merchantId;
    	@JsonProperty("create_time")
    	private Long createTime;
    	@JsonProperty("update_time")
    	private Long updateTime;
    	@JsonProperty("begin_time")
    	private Long beginTime;
    	@JsonProperty("end_time")
    	private Long endTime;
    	@JsonProperty("primary_category_id")
    	private Long primaryCategoryId;
    	@JsonProperty("secondary_category_id")
    	private Long secondaryCategoryId;
    	@JsonProperty("brand_name")
    	private String brandName;
    	@JsonProperty("logo_url")
    	private String logoUrl;
    	@JsonProperty("status")
    	private String status;
		public Long getMerchantId() {
			return merchantId;
		}
		public void setMerchantId(Long merchantId) {
			this.merchantId = merchantId;
		}
		public Long getCreateTime() {
			return createTime;
		}
		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}
		public Long getUpdateTime() {
			return updateTime;
		}
		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}
		public Long getBeginTime() {
			return beginTime;
		}
		public void setBeginTime(Long beginTime) {
			this.beginTime = beginTime;
		}
		public Long getEndTime() {
			return endTime;
		}
		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}
		public Long getPrimaryCategoryId() {
			return primaryCategoryId;
		}
		public void setPrimaryCategoryId(Long primaryCategoryId) {
			this.primaryCategoryId = primaryCategoryId;
		}
		public Long getSecondaryCategoryId() {
			return secondaryCategoryId;
		}
		public void setSecondaryCategoryId(Long secondaryCategoryId) {
			this.secondaryCategoryId = secondaryCategoryId;
		}
		public String getBrandName() {
			return brandName;
		}
		public void setBrandName(String brandName) {
			this.brandName = brandName;
		}
		public String getLogoUrl() {
			return logoUrl;
		}
		public void setLogoUrl(String logoUrl) {
			this.logoUrl = logoUrl;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
    	
    	
    }
}
