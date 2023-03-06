package com.cydeo.stereotype_annotation;

import com.cydeo.bean_annotation.ConfigAny;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigCourse.class);
        // interface                      //one of the implementation class

        context.getBean(Java.class).getTeachingHours();


    }
}
