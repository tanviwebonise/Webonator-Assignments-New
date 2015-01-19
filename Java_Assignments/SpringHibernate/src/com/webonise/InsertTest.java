package com.webonise;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
  
public class InsertTest {  
public static void main(String[] args) {  
      
    Resource r=new ClassPathResource("applicationContext.xml");  
    BeanFactory factory=new XmlBeanFactory(r);  
      
    EmployeeDao dao=(EmployeeDao)factory.getBean("d");  
      
    Employee e=new Employee();  
    e.setId(103);  
    e.setName("ashvini");  
    e.setSalary(60550);  
      
    dao.updateEmployee(e);  
      
}  
}  