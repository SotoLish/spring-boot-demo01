package com.hand.demo03extension.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 属性值对象
 * 从配置文件application.properties中的配置中获取属性值
 * @author liuqixin
 * @date 2019/7/23 15:53
 */
@Component
public class ValueProperty {
    @Value("${demo.value-property}")
    private String valueProperty;

    public String getValueProperty() {
        return valueProperty;
    }

    public ValueProperty setValueProperty(String valueProperty) {
        this.valueProperty = valueProperty;
        return this;
    }
}


