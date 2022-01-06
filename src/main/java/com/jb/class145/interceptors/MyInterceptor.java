package com.jb.class145.interceptors;

import com.jb.class145.beans.MyNumber;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyInterceptor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof MyNumber && beanName.equals("myNumber")) {
            MyNumber myNumber = (MyNumber) bean;
            int x = myNumber.getX();
            if (x%2!=0){
                System.out.println("Found odd number which is wrong:"+x);
                myNumber.setX(x+1);
                System.out.println("Dont worry, Barak is here to save the day !!!!");
                return myNumber;
            } else {
                System.out.println("All is good, nir is here :)");
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
