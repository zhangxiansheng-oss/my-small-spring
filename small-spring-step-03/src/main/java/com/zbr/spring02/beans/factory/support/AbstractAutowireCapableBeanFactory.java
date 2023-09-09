package com.zbr.spring02.beans.factory.support;

import com.zbr.spring02.beans.BeansException;
import com.zbr.spring02.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @BelongsProject: my-small-spring
 * @BelongsPackage: com.zbr.spring02.beans.factory.support
 * @Author: zhangbingrong
 * @CreateTime: 2023-09-08  11:25
 * @Description: 实现单例工厂的模板方法
 * @Version: 1.0
 */
public abstract class AbstractAutowireCapableBeanFactory extends  AbstractBeanFactor{

    private InstantiationStrategy instantiationStrategy = new CglibSubclassingInstantiationStrategy();


    @Override
    protected Object creatBean(String name, BeanDefinition beanDefinition,Object... args)  throws BeansException {
        Object bean = null;
        Class beanClass = beanDefinition.getBeanClass();
        try {
            bean =createBeanInstance(name,beanDefinition,args);
        } catch (Exception e ) {
            throw new BeansException("Instantiation of bean failed",e);
        }
        addSingleton(name,bean);
        return bean;
    }

    private Object createBeanInstance(String name, BeanDefinition beanDefinition, Object[] args) {
        Class beanClass = beanDefinition.getBeanClass();
        Constructor constructor =null;
        Constructor[] declaredConstructors = beanClass.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            if (args != null && declaredConstructor.getParameterTypes().length == args.length){
                constructor = declaredConstructor;
                break;
            }
        }
        return  instantiationStrategy.instantiate(beanDefinition,name,constructor,args);

    }
}
