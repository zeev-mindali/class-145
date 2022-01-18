package com.jb.spring_basic;

import com.jb.spring_basic.beans.NormalCat;
import com.jb.spring_basic.util.Art;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

//@Component
public class interceptors implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof NormalCat && beanName.equals("normalCat")) {
            //NormalCat cat = (NormalCat) bean;
            System.out.println(Art.cat);
        }
        return bean;
    }
}
