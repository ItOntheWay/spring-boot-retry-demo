package com.itclj.controller;

import com.itclj.service.UserService;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by lujun.chen on 2017/08/11
 */
@RestController
@RequestMapping("/user")
public class UserController {

  @Resource
  private UserService userService;

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public String getUser(@PathVariable Integer id) {
    return userService.getUser(id);
  }

}
