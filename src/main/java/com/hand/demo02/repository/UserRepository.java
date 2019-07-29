package com.hand.demo02.repository;

import com.hand.demo02.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 用户持久层
 *
 * @author liuqixin
 * @date 2019/7/23 10:54
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
