package com.zbr.spring02.beans.factory.support;

import com.zbr.spring02.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;


/**
 * @BelongsProject: my-small-spring
 * @BelongsPackage: com.zbr.spring02.beans.factory.support
 * @Author: zhangbingrong
 * @CreateTime: 2023-09-09  09:24
 * @Description: 实例化策略
 * @Version: 1.0
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args);

}
