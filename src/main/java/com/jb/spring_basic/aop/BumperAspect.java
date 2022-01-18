package com.jb.spring_basic.aop;

import com.jb.spring_basic.services.BumperService;
import com.jb.spring_basic.util.Art;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BumperAspect {
    public BumperAspect() {

        //System.out.println(Art.cat);
    }

    @Autowired
    BumperService bumperService;

    @Before("@annotation(CatBanner)")
    public void showBanner(){
        System.out.println("Me fireeed");
        bumperService.showBanner();
    }
}
