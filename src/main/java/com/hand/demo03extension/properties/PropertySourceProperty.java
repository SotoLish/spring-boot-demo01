package com.hand.demo03extension.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author liuqixin
 * @date 2019/7/23 15:53
 */
@Component
@PropertySource("classpath:demo.properties")
public class PropertySourceProperty {

    @Value("${demo.property-source-property:'default'}")
    private String property;

    public String getProperty(){
        return this.property;
    }


    public PropertySourceProperty setProperty(String property) {
        this.property = property;
        return this;
    }

    @Override
    public String toString() {
        return "PropertySourceProperty{" +
                "property='" + property + '\'' +
                '}';
    }
}
