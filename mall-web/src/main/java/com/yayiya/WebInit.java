package com.yayiya;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 初始化的启动类
 *
 * @author xfd
 * 2021/7/3
 */
@EnableDubbo
@EnableDiscoveryClient
@MapperScan("com.yayiya.**.mapper")
@SpringBootApplication
public class WebInit
{
    public static void main(String[] args)
    {
        SpringApplication.run(WebInit.class, args);
    }
}
