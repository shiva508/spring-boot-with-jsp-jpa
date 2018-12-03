package com.web.ldap.cache.config;



import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
/*@Configuration
@EnableCaching*/
public class SpringBootEhCacheConfig{
	/*@Bean*/
public EhCacheManagerFactoryBean ehcacheManagerFactoryBean() {
	EhCacheManagerFactoryBean ehcacheManagerFactoryBean=new EhCacheManagerFactoryBean();
	ehcacheManagerFactoryBean.setCacheManagerName("ehcacheManager");
	ehcacheManagerFactoryBean.setConfigLocation(new ClassPathResource("ehcache.xml"));
	return ehcacheManagerFactoryBean;
}
	/*@Bean*/
	public CacheManager cacheManager() {
		EhCacheCacheManager ehcacheManager=new EhCacheCacheManager();
		ehcacheManager.setCacheManager(ehcacheManagerFactoryBean().getObject());
		ehcacheManager.setTransactionAware(true);
		return ehcacheManager;
	}
}
