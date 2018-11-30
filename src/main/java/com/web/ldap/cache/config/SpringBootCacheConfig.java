package com.web.ldap.cache.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration;
import org.springframework.boot.autoconfigure.cache.CacheManagerCustomizer;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*@Configuration
@EnableCaching*/
public class SpringBootCacheConfig {

/*	@Bean*/
	CacheManagerCustomizer <ConcurrentMapCacheManager> cacheManagerCustomizer(){
		return new CacheManagerCustomizer<ConcurrentMapCacheManager>() {
			@Override
			public void customize(ConcurrentMapCacheManager cacheManager) {
				cacheManager.isAllowNullValues();
			}
		};
	}
	/*@Bean*/
	public CacheManager cacheManager() {
		SimpleCacheManager cacheManager = new SimpleCacheManager();
		List<Cache> cacheList = new ArrayList<>();
		cacheList.add(new ConcurrentMapCache("cache1"));
		cacheList.add(new ConcurrentMapCache("cache2"));
		cacheManager.setCaches(cacheList);
		return cacheManager;
	}
}
