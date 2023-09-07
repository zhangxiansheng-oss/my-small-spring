package com.zbr.spring01;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BeanFactory {
/**
 *@BelongsProject: my-small-spring
 *@BelongsPackage: com.zbr.spring01
 *@Author: zhangbingrong
 *@CreateTime: 2023-09-07  10:16
 *@Description: bean工厂
 *@Version: 1.0
 */

   private Map<String,BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

   public Object getBean(String name){
      return beanDefinitionMap.get(name).getBean();
   }

   public void registerBeanDefinition(String name,BeanDefinition beanDefinition){
       beanDefinitionMap.put(name,beanDefinition);
   }


}
