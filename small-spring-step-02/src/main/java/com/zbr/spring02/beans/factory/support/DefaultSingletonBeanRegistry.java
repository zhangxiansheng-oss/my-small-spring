package com.zbr.spring02.beans.factory.support;



import com.zbr.spring02.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.XMLFormatter;
/**
 *@BelongsProject: my-small-spring
 *@BelongsPackage: com.zbr.spring02.beans.factory.config
 *@Author: zhangbingrong
 *@CreateTime: 2023-09-08  10:17
 *@Description: 默认获取单例实现
 *@Version: 1.0
 */
public class DefaultSingletonBeanRegistry  implements SingletonBeanRegistry {


private Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String name) {
        return singletonObjects.get(name);
    }

    protected void addSingleton(String name,Object singletonObject){
        singletonObjects.put(name,singletonObject);
    }

}
