
## Redis Java Client


What is Redis?

	Redis is an open source (BSD licensed), in-memory data structure store, 
	used as a database, cache and message broker. It supports data structures such as 
	strings, hashes, lists, sets, sorted sets with range queries, bitmaps, hyperloglogs, 
	geospatial indexes with radius queries and streams. Redis has built-in replication, 
	Lua scripting, LRU eviction, transactions and different levels of on-disk 
	persistence, and provides high availability via Redis Sentinel and automatic 
	partitioning with Redis Cluster. Learn more https://redis.io/topics/introduction


## For Redis Server Installation and Setup, refer the following pages

	
	https://github.com/rahamath18/Redis-on-Windows10
	
	https://github.com/rahamath18/Redis-on-MacOS
	
	

## Redis Java Client Program

### Maven Dependencies

		https://mvnrepository.com/artifact/redis.clients/jedis
		<dependency>
	    		<groupId>redis.clients</groupId>
	    		<artifactId>jedis</artifactId>
	    		<version>3.2.0</version>
		</dependency>

### Maven initial setup

	$ mvn dependency:tree
	$ mvn eclipse:eclipse
	

### 1. Run following java program to set/get key and value pair

	RedisJedis_SetGet_Client.java