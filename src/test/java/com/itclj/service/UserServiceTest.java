package com.itclj.service;

import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Create by lujun.chen on 2017/08/14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

  private Logger logger = LoggerFactory.getLogger(UserServiceTest.class);

  @Resource
  private UserService userService;

  @Test
  public void getUser() {
    //id 444 retry
    String result = userService.getUser(444);
    logger.info(result);
  }

}
