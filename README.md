# spring-boot-retry-demo
spring-boot-retry-demo


spring-retry项目地址：https://github.com/spring-projects/spring-retry

教程博客：http://blog.csdn.net/broadview2006/article/details/72841056

启用retry需要在启动类添加`@EnableRetry`注解。

@Retryable不能用于接口的实现

@Recover返回参数必须和监控的@Retryable一样

@Retryable参数说明：

```$xslt
value：捕获特定异常时触发重试
maxAttempts：最大尝试次数，包括首次
backoff:退避策略@Backoff
```

@Backoff参数说明：
```$xslt
value:延迟毫秒数
maxDelay:做大延迟毫秒数
```