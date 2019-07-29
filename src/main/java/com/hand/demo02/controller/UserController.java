package com.hand.demo02.controller;

import com.hand.demo02.entity.User;
import com.hand.demo02.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 用户控制层
 *
 * @author liuqixin
 * @date 2019/7/23 11:01
 */
@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * 持久层对象
     */
    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    /**
     * 获取用户列表
     *
     * @author liuqixin
     * @date 2019/07/23 11:22
     */
    @GetMapping
    public List<User> list() {
        return userRepository.findAll();
    }

    /**
     * 根据ID查询用户
     *
     * @param id 用户ID
     * @author liuqixin
     * @date 2019/07/23 11:23
     */
    @GetMapping("/{id}")
    public User query(@PathVariable long id) {
        return userRepository.findById(id)
                .orElseThrow(IllegalArgumentException::new);
    }

    /**
     * 新建用户
     *
     * @param user
     * @author liuqixin
     * @date 2019/07/23 11:23
     */
    @PostMapping
    public User create(@RequestBody @Validated User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new IllegalArgumentException(bindingResult.toString());
        }
        return userRepository.save(user);
    }

    /**
     * 更新用户
     *
     * @param user
     * @author liuqixin
     * @date 2019/07/23 11:24
     */
    @PutMapping
    public User update(@RequestBody User user) {
        return userRepository.save(user);
    }


    /**
     * 根据ID删除用户
     *
     * @param id
     * @author liuqixin
     * @date 2019/07/23 11:24
     */
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        userRepository.deleteById(id);
    }

}
