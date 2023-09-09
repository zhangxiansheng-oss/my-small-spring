package com.zbr.spring02.beans.factory.config;



public interface SingletonBeanRegistry {
/**
 *@BelongsProject: my-small-spring
 *@BelongsPackage: com.zbr.spring02.beans.factory.config
 *@Author: zhangbingrong
 *@CreateTime: 2023-09-08  10:12
 *@Description: 单例注册表
 *@Version: 1.0
 */

  Object getSingleton(String name);
}
