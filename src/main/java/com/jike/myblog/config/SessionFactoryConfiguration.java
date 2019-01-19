package com.jike.myblog.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

@SpringBootConfiguration
public class SessionFactoryConfiguration {
    @Value("${mybatisConfigFilePath}")
    private String mybatisConfigFilePath;
    @Value("${mapperPath}")
    private String mapperPath;

    @Value("${entityPackage}")
    private String entityPackage;

    @Autowired
    private DataSource dataSource;
    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactoryBean createSqlSessionFactoryBean() throws IOException {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        //扫描mybatis-config.xml配置文件
        sqlSessionFactoryBean.setConfigLocation(new ClassPathResource(mybatisConfigFilePath));
        //读取jar文件信息
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        //指定mapper文件的扫描路径
        String packagSearchPath = PathMatchingResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX + mapperPath;//读取路径
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources(packagSearchPath));//设置路径
        //指定数据源
        sqlSessionFactoryBean.setDataSource(dataSource);
        //指定映射实体类package的扫描路径
        sqlSessionFactoryBean.setTypeAliasesPackage(entityPackage);
        return sqlSessionFactoryBean;
    }
}

