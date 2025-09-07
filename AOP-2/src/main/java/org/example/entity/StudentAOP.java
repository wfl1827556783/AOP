package org.example.entity;

import org.aspectj.lang.annotation.After;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;
@Aspect
@Component
public class StudentAOP {
    @After("execution(public void org.example.entity.Student.study())")
    public void afterStudy(){
        System.out.println("我是后置");
    }
}
