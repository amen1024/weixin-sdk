package com.riversoft.weixin.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @borball on 8/14/2016.
 */
public class DefaultAccessTokenHolder extends AccessTokenHolder {
	
	private static Logger logger = LoggerFactory.getLogger(DefaultAccessTokenHolder.class);

    private AccessToken accessToken;

    public DefaultAccessTokenHolder(String tokenUrl, String clientId, String clientSecret){
        super(tokenUrl, clientId, clientSecret);
    }

    @Override
    public synchronized AccessToken getAccessToken() {
        if (accessToken == null || accessToken.expired()) {
            refreshToken();
        }
        return accessToken;
    }

    @Override
    public synchronized void refreshToken() {
        if (accessToken == null || accessToken.expired()) {
            String content = fetchAccessToken();
            logger.info("刷新token! response:"+content);
            AccessToken accessToken = AccessToken.fromJson(content);
            this.accessToken = accessToken;
        }
    }

    @Override
    public void expireToken() {
        accessToken.setExpiresIn(-30);//强制设置为无效
    }


}
