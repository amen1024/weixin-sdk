package com.riversoft.weixin.mp.card.bean;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.riversoft.weixin.common.util.DateSerializer;

import java.util.Date;

/**
 * 基本的卡券数据，所有卡券类型通用
 * <p/>
 * Created by mengt 20170425.
 */
public class AdvancedInfo {
	
	@JsonProperty("time_limit")
	private TimeLimit[] timeLimit;
	@JsonProperty("text_image_list")
	private TextImageList[] textImageList;

	public static class TimeLimit {

        @JsonProperty("type")
        private String type;

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

    }
	public static class TextImageList {
		
		@JsonProperty("image_url")
		private String imageUrl;
		@JsonProperty("text")
		private String text;
		public String getImageUrl() {
			return imageUrl;
		}
		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		
	}
	public TimeLimit[] getTimeLimit() {
		return timeLimit;
	}
	public void setTimeLimit(TimeLimit[] timeLimit) {
		this.timeLimit = timeLimit;
	}
	public TextImageList[] getTextImageList() {
		return textImageList;
	}
	public void setTextImageList(TextImageList[] textImageList) {
		this.textImageList = textImageList;
	}

}
