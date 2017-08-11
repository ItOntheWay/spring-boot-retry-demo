package com.itclj.service.impl;

import com.itclj.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Create by lujun.chen on 2017/08/11
 */
@Service
public class UserServiceImpl implements UserService {

  @Override
  public String getUser(Integer id) {
    return "=========" + id;
  }

}
