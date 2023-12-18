//package dev.danvega.serverlessapi.services.impl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import redis.clients.jedis.Jedis;
//import redis.clients.jedis.JedisPool;
//
//@Service
//public class RedisService {
//
//	@Autowired
//    private JedisPool jedisPool;
//
//    public void someMethod() {
//        try (Jedis jedis = jedisPool.getResource()) {
//            // Use jedis to interact with Redis
//        } catch (Exception e) {
//            e.printStackTrace();
//            // Handle exceptions
//        }
//    }
//}
