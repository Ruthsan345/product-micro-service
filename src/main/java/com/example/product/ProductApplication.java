package com.example.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.cache.CacheProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;

import java.time.Duration;

@EnableCaching
@SpringBootApplication
public class ProductApplication {
//
//	@Bean
//	public RedisCacheConfiguration cacheConfiguration(){
//		return RedisCacheConfiguration.defaultCacheConfig()
//				.entryTtl(Duration.ofMinutes(60))
//				.disableCachingNullValues()
//				.serializeValuesWith(RedisSerializationContext.SerializationPair
//				.fromSerializer(new GenericJackson2JsonRedisSerializer()));
//	}

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);

	}

}
