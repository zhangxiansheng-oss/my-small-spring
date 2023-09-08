package com.zbr.spring02.beans.factory.config;

public class BeanDefinition {
/**
 *@BelongsProject: my-small-spring
 *@BelongsPackage: com.zbr.spring02.beans.factory.config
 *@Author: zhangbingrong
 *@CreateTime: 2023-09-08  10:09
 *@Description: Bean定义
 *@Version: 1.0
 */

 private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }


    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
