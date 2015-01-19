package com.webonise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass 
{
   public static void main(String[] args) 
   {
      ApplicationContext context = 
             new ClassPathXmlApplicationContext("HelloBean.xml");

      HelloWorld h =(HelloWorld) context.getBean("hello");

      h.getMessage();
   }
}