package com.example.redis.jedis.client;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import redis.clients.jedis.Jedis;

public class RedisJedis_SetGet_Client3 {
	
	public static void main(String[] args) {
		
		Jedis jedis = new Jedis("localhost", 6379, 15000);
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("subKey1", "unisys_1");
		map.put("subKey2", "unisys_2");
		map.put("subKey3", "{\"id\": \"string\",\"location\": \"string\",\"code\": \"string\"}");
		map.put("subKey4", "your base64 image string");
		System.out.println(map);
		jedis.hset("mainKey", map);
		
		System.out.println(jedis.hgetAll("mainKey"));
		
		// to fetch single sub-key's value
		System.out.println(jedis.hget("mainKey", "name3"));
		
		// to fetch multiple sub-key's value
		List<byte[]> values = jedis.hmget("mainKey".getBytes(), "subKey1".getBytes(), "subKey3".getBytes(), "subKey4".getBytes());
		for (byte[] value : values) {
			System.out.println(new String(value));
		}
		
	}

}
