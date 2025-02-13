package com.mystore.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Product product1 = context.getBean("product1", Product.class);
        Product product2 = context.getBean("product2", Product.class);
        
        System.out.println("Retrieved from context: " + product1);
        System.out.println("Retrieved from context: " + product2);
    }
}
