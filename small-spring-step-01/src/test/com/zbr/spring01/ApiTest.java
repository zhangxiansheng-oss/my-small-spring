package com.zbr.spring01;

import com.zbr.spring01.bean.UserService;
import org.junit.Test;

import javax.annotation.processing.SupportedAnnotationTypes;

public class ApiTest {
/**
 *@BelongsProject: my-small-spring
 *@BelongsPackage: com.zbr.spring01
 *@Author: zhangbingrong
 *@CreateTime: 2023-09-07  10:41
 *@Description: TODO
 *@Version: 1.0
 */

  @Test
  public void  test_BeanFactory(){

    BeanDefinition beanDefinition = new BeanDefinition(new UserService());
    BeanFactory beanFactory = new BeanFactory();
    beanFactory.registerBeanDefinition("userService",beanDefinition);
    UserService userService = (UserService) beanFactory.getBean("userService");
    userService.queryUserInfo();
  }

}
