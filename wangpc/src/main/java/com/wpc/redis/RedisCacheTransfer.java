package com.wpc.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

/**
 * 工具bean，作用是在启动容器的时候利用spring将JedisConnectionFactory注入到RedisCache
 * @author W鹏程
 *
 */
public class RedisCacheTransfer {

	@Autowired
    public void setJedisConnectionFactory(JedisConnectionFactory jedisConnectionFactory) {
        RedisCache.setJedisConnectionFactory(jedisConnectionFactory);
    }

}
