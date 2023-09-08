package com.zbr.spring02.beans;

/**
 * @BelongsProject: my-small-spring
 * @BelongsPackage: com.zbr.spring02.beans
 * @Author: zhangbingrong
 * @CreateTime: 2023-09-08  11:33
 * @Description: TODO
 * @Version: 1.0
 */
public class BeansException extends RuntimeException{


    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }
}
