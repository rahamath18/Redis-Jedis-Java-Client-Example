package com.example.redis.jedis.client;

import redis.clients.jedis.Jedis;

public class RedisJedis_SetGet_Client {
	
	public static void main(String[] args) {
	    
		Jedis jedis = new Jedis("localhost", 6379, 15000);
		jedis.set("developer_name", "Rahamath S");
		
		String value = jedis.get("developer_name");
		System.out.println(value);
	}

}
