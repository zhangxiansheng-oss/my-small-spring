package com.zbr.spring02.bean;
/**
 *@BelongsProject: my-small-spring
 *@BelongsPackage: com.zbr.spring01
 *@Author: zhangbingrong
 *@CreateTime: 2023-09-07  10:39
 *@Description: TODO
 *@Version: 1.0
 */
public class UserService {
    private String name;

    public UserService(String name) {
        this.name = name;
    }

    public void queryUserInfo(){
      System.out.println("查询用户信息"+ name);
  }

    @Override
    public String toString() {
        return "UserService{" +
                "name='" + name + '\'' +
                '}';
    }
}
