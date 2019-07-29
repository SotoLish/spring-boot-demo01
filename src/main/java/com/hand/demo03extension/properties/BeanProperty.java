package com.hand.demo03extension.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *
 * @author liuqixin
 * @date 2019/7/23 15:53
 */
@Component
@ConfigurationProperties(prefix = "demo")
public class BeanProperty {
    /**
     * 属性1
     */
    private String beanProperty1;
    /**
     * 属性2
     */
    private boolean beanProperty2;

    public String getBeanProperty1() {
        return beanProperty1;
    }

    public void setBeanProperty1(String beanProperty1) {
        this.beanProperty1 = beanProperty1;
    }

    public boolean isBeanProperty2() {
        return beanProperty2;
    }

    public void setBeanProperty2(boolean beanProperty2) {
        this.beanProperty2 = beanProperty2;
    }

    @Override
    public String toString() {
        return "BeanProperty{" +
                "beanProperty1='" + beanProperty1 + '\'' +
                ", beanProperty2=" + beanProperty2 +
                '}';
    }
}
