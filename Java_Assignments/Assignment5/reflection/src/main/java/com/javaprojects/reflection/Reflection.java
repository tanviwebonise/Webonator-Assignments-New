package com.javaprojects.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;


 
public class Reflection 
{
	public static void main(String[] args) throws NoSuchFieldException
	{
		Class<?> f = Foo.class;
		
		try
		{
			Method[] allmethods = f.getDeclaredMethods();
            for (Method method : allmethods)
            {
                System.out.println("method = " + method.getName()+"()");
            }
           
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
        Field[] fields = f.getDeclaredFields();
	    System.out.println("Fields are: ");
	    for (Field allField : fields)
        {         
	           System.out.println("Fieldname is: " + allField.getName());
        }
	    Constructor<?>[] constructors = f.getDeclaredConstructors();
        System.out.println("Constructors are: "
                + Arrays.toString(constructors));	
       
	}
}