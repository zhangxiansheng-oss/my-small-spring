package com.zbr.spring02.beans.factory;

import com.zbr.spring02.beans.BeansException;

public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name,Object... args) throws BeansException;
}
