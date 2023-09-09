package com.zbr.spring02.beans.factory.support;

import com.zbr.spring02.beans.BeansException;
import com.zbr.spring02.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


/**
 * @BelongsProject: my-small-spring
 * @BelongsPackage: com.zbr.spring02.beans.factory.support
 * @Author: zhangbingrong
 * @CreateTime: 2023-09-09  09:31
 * @Description: jdk实例化策略
 * @Version: 1.0
 */
public class SimpleInstantiationStrategy implements InstantiationStrategy {

    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) {
        Class beanClass = beanDefinition.getBeanClass();

        try {
            if (ctor != null) {
                return beanClass.getDeclaredConstructor(ctor.getParameterTypes()).newInstance(args);
            }else {
                return beanClass.getDeclaredConstructor().newInstance();
            }
        } catch (InstantiationException|IllegalAccessException |InvocationTargetException|NoSuchMethodException e) {
            throw new BeansException("Failed to instantiate [" + beanClass.getName() + "]", e);
        }


    }
}
