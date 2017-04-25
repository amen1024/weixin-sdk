package com.riversoft.weixin.mp.card.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by exizhai on 11/28/2015.
 */
public abstract class AbstractCard {

    @JsonProperty("base_info")
    private BaseInfo baseInfo;
    @JsonProperty("advanced_info")
    private AdvancedInfo advancedInfo;

    public BaseInfo getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

	public AdvancedInfo getAdvancedInfo() {
		return advancedInfo;
	}

	public void setAdvancedInfo(AdvancedInfo advancedInfo) {
		this.advancedInfo = advancedInfo;
	}
}
