package com.example.redis.jedis.client;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Response;
import redis.clients.jedis.Transaction;

public class RedisJedis_SetGet_Client {
	
	public static void main(String[] args) {
	    
		Jedis jedis = new Jedis("localhost", 6379, 15000);
		
		
		System.out.println(jedis.exists("mymy"));
		System.out.println(jedis.exists("mymy", "12","23"));
		
		String rs = jedis.set("animal123:1", "{\"name\":\"TIGER" + "" + "\"}");
		System.out.println("---" + rs);
		
//		Transaction txn = jedis.multi();
//		for (int i = 1; i < 10; i++) {
//			System.out.println("---" + txn.set("animal123:" + i, "{\"name\":\"TIGER" + i + "\"}"));
//		}
//		jedis.resetState();
//		txn.close();
//		jedis.close();
//		
//		for (int i = 1; i < 10; i++) {
//			System.out.println(jedis.get("animal:" + i));
//		}
	}

}
