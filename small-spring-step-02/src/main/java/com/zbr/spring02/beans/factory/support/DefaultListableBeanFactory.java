package com.zbr.spring02.beans.factory.support;

import com.zbr.spring02.beans.BeansException;
import com.zbr.spring02.beans.factory.BeanFactory;
import com.zbr.spring02.beans.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * @BelongsProject: my-small-spring
 * @BelongsPackage: com.zbr.spring02.beans.factory.support
 * @Author: zhangbingrong
 * @CreateTime: 2023-09-08  16:30
 * @Description: 实现注册BeanDefinition
 * @Version: 1.0
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {


    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {

        beanDefinitionMap.put(name,beanDefinition);
    }

    @Override
    protected BeanDefinition getBeanDefinition(String name) {
        BeanDefinition beanDefinition = beanDefinitionMap.get(name);
        if (beanDefinition == null) throw new BeansException("No bean named '" + name + "' is defined");
        return beanDefinition;
    }
}
