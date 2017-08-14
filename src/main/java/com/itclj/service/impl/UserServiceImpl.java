package com.itclj.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.remoting.RemoteAccessException;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

/**
 * Create by lujun.chen on 2017/08/11
 */
@Service
public class UserServiceImpl {

  private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

  /**
   * Retryable不能用于接口的实现
   *
   * @param id
   * @return
   */
  @Retryable(value = RemoteAccessException.class, maxAttempts = 2,
      backoff = @Backoff(value = 2000))
  public String getUser(Integer id) {
    logger.info("get user :{}", id);
    if (id == 444) {
      throw new RemoteAccessException(String.valueOf(id));
    }

    return "=========" + id;
  }

  /**
   * Recover返回参数必须和监控的retryable一样
   *
   * @param remoteaccessException
   * @param id
   * @return
   */
  @Recover
  public String recover(RemoteAccessException remoteaccessException, Integer id) {
    logger.info("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~{}", id);
    return String.valueOf("====" + id);
  }

}
