package com.zbr.spring02.beans.factory.support;

import com.zbr.spring02.beans.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {

/*    向注册表中注册 BeanDefinition*/
    void registerBeanDefinition(String name, BeanDefinition beanDefinition);

}
