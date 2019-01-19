package com.jike.myblog.config;

import com.jike.myblog.intercept.ResponseInterceptor;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @description: 拦截器配置
 * @author: LHAO
 * @create: 2018-07-11
 **/
@SpringBootConfiguration
public class InterceptorConfig extends WebMvcConfigurationSupport {

    //必须通过@bean的方式注入bean，否则LoginInterceptor中的redis将无法使用
    @Bean
    public ResponseInterceptor getResponseInterceptor(){
        return new ResponseInterceptor();
    }


    //测试时注意： 需要使用对应的get 或者 Post 方法才正确执行
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {

       registry.addInterceptor(getResponseInterceptor()).addPathPatterns("/**");
       //registry.addInterceptor(getLoginInterceptor()).addPathPatterns("/**").excludePathPatterns("/login/**").excludePathPatterns("/controllerManager/**/**");

        super.addInterceptors(registry);
    }
}
