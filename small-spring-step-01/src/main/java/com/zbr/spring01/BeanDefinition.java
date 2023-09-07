package com.zbr.spring01;

public class BeanDefinition {
/**
 *@BelongsProject: my-small-spring
 *@BelongsPackage: com.zbr.spring01
 *@Author: zhangbingrong
 *@CreateTime: 2023-09-07  10:08
 *@Description: bean定义
 *@Version: 1.0
 */
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
