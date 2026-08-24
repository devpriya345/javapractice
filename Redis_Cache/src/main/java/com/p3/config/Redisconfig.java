package com.p3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.p3.model.Book;

@Configuration
public class Redisconfig {
	 
	@Bean
	public JedisConnectionFactory jedisConnectionFactory() {
		
		JedisConnectionFactory jcf = new JedisConnectionFactory();
		
		return jcf;
	}
	
	@Bean
	public RedisTemplate<String,Book> redisTemplate(){ //providing method to communicate wth redis server
		
		RedisTemplate<String, Book> redisTemplate = new RedisTemplate<>();
		
		redisTemplate.setConnectionFactory(jedisConnectionFactory());
		
		return redisTemplate;
		
}
}