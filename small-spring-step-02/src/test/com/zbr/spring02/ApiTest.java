package com.zbr.spring02;

import com.zbr.spring02.bean.UserService;
import com.zbr.spring02.beans.factory.config.BeanDefinition;
import com.zbr.spring02.beans.factory.support.AbstractAutowireCapableBeanFactory;
import com.zbr.spring02.beans.factory.support.BeanDefinitionRegistry;
import com.zbr.spring02.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

/**
 * @BelongsProject: my-small-spring
 * @BelongsPackage: com.zbr.spring02
 * @Author: zhangbingrong
 * @CreateTime: 2023-09-08  16:42
 * @Description: TODO
 * @Version: 1.0
 */
public class ApiTest {

    @Test
    public void test_BeanFactory(){

        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.第一次获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        // 4.第二次获取 bean from Singleton
        UserService userService_singleton = (UserService) beanFactory.getSingleton("userService");
        userService_singleton.queryUserInfo();

    }
}
