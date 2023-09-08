package com.zbr.spring02.beans.factory.support;

import com.zbr.spring02.beans.BeansException;
import com.zbr.spring02.beans.factory.BeanFactory;
import com.zbr.spring02.beans.factory.config.BeanDefinition;

/**
 *@BelongsProject: my-small-spring
 *@BelongsPackage: com.zbr.spring02.beans.factory.support
 *@Author: zhangbingrong
 *@CreateTime: 2023-09-08  10:36
 *@Description: 模板模式获取单例抽象工厂
 *@Version: 1.0
 */
public abstract class AbstractBeanFactor extends DefaultSingletonBeanRegistry implements BeanFactory   {
    @Override
    public Object getBean(String name) {
        Object singleton = getSingleton(name);
        if (singleton != null){
            return singleton;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return creatBean(name,beanDefinition);

    }

    protected abstract Object creatBean(String name, BeanDefinition beanDefinition) throws BeansException;

    protected abstract BeanDefinition getBeanDefinition(String name);

}