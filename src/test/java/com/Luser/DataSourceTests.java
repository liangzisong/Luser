package com.Luser;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataSourceTests implements ApplicationContextAware{
 
    ApplicationContext applicationContext;
 
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		
	}
    
    @Autowired
    DataSourceProperties dataSourceProperties;
 
    @Test
    public void testDataSource() throws Exception {
    	System.out.println("=============================================================================");
    	System.out.println("DataSourceTests.testDataSource()");
        // 获取配置的数据源
        DataSource dataSource = applicationContext.getBean(DataSource.class);
        System.out.println("end");
        // 查看配置数据源信息
        System.out.println(dataSource);
        System.out.println(dataSource.getClass().getName());
        System.out.println(dataSourceProperties);
    }

}
