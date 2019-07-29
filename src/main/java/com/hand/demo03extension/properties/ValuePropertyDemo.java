package com.hand.demo03extension.properties;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


/**
 * @author liuqixin
 * @date 2019/7/23 16:27
 */
@SpringBootApplication
public class ValuePropertyDemo {

    private static final Logger logger = LoggerFactory.getLogger(ValuePropertyDemo.class);

    public static void main(String[] args) {
        // 应用上下文
        ApplicationContext applicationContext = SpringApplication.run(ValuePropertyDemo.class,args);

        // @Value 方式取值
        // logger.info("@Value : {}" ,applicationContext.getBean(ValueProperty.class).getValueProperty());

        // @ConfigurationProperties 方式
        // logger.info("@ConfigurationProperties : {} ",applicationContext.getBean(BeanProperty.class));

        // @SourceProperty
        // logger.info("Property Source : {}" ,applicationContext.getBean(PropertySourceProperty.class).getProperty());

    }
}
