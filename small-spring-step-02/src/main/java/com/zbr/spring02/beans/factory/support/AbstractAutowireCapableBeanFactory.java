package com.zbr.spring02.beans.factory.support;

import com.zbr.spring02.beans.BeansException;
import com.zbr.spring02.beans.factory.config.BeanDefinition;

/**
 * @BelongsProject: my-small-spring
 * @BelongsPackage: com.zbr.spring02.beans.factory.support
 * @Author: zhangbingrong
 * @CreateTime: 2023-09-08  11:25
 * @Description: 实现单例工厂的模板方法
 * @Version: 1.0
 */
public abstract class AbstractAutowireCapableBeanFactory extends  AbstractBeanFactor{

    @Override
    protected Object creatBean(String name, BeanDefinition beanDefinition)  throws BeansException {
        Object bean = null;
        Class beanClass = beanDefinition.getBeanClass();
        try {
            bean = beanClass.newInstance();
        } catch (InstantiationException  | IllegalAccessException e ) {
            throw new BeansException("Instantiation of bean failed",e);
        }
        addSingleton(name,bean);
        return bean;
    }
}
