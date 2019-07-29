package com.hand.demo02.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/**
 * 用户类
 * 测试SpringBoot中的JPA
 *
 * @author liuqixin
 * @date 2019/7/23 10:42
 */
@Entity
@Table(name = "DEMO_USER")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
    /**
     * 用户ID
     */
    @Id // 主键注解
    @GeneratedValue // ID自动生成
    private Long userId;
    /**
     * 用户名
     */
    @NotBlank
    @Column
    private String userName;
    /**
     * 用户账户
     */
    @NotBlank
    @Column
    private String account;
    /**
     * 用户密码
     */
    @NotBlank
    @Column
    private String userPwd;
    /**
     * 用户年龄
     */
    @Range(min = 0, max = 150)
    private Integer userAge;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", account='" + account + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userAge=" + userAge +
                '}';
    }
}
