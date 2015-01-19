<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <%@page import="com.webonise.UserDao"%>  
    <jsp:useBean id="obj" class="com.webonise.User">  
    </jsp:useBean>  
    <jsp:setProperty property="*" name="obj"/>  
      
    <%  
    int i=UserDao.register(obj);  
    if(i>0)  
    out.print("You are successfully registered");  
      
    %>  

</html>