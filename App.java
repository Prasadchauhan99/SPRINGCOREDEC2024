package com.chauhan.in.myfirstproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main(String[] args)
    {
       
    	
    	//CREATE SPRING CONTAINER
    ApplicationContext context = new ClassPathXmlApplicationContext("com/chauhan/in/myfirstproject/configmetadata.xml");
    	
 //1.ELEMENT CREATING BY ELEMENT
    //GET CUSTOMER OBJECT
    System.out.println("1.ELEMENT CREATING BY ELEMENT");
    	Customer customer = (Customer) context.getBean("cus");
    	
    	System.out.println("Name:"+customer.getName());
    	System.out.println("Contact:"+customer.getContact());
    	System.out.println("Address:"+customer.getAddress());
    System.out.println("===========================");
    System.out.println("===========================");
    
    //2. WAY   CREATING BY ATTRIBUTE 
    System.out.println("2. WAY   CREATING BY ATTRIBUTE ");
       Customer customers = (Customer) context.getBean("PK");
    	
    	System.out.println("Name:"+customers.getName());
    	System.out.println("Contact:"+customers.getContact());
    	System.out.println("Address:"+customers.getAddress());  
    	
    	
    	System.out.println("===========================");
        System.out.println("===========================");
    	
    	//3. WAY BY P-SCHEMA
        System.out.println("3. WAY BY P-SCHEMA");
       Customer customersS = (Customer) context.getBean("PKC");
    	
    	System.out.println("Name:"+customersS.getName());
    	System.out.println("Contact:"+customersS.getContact());
    	System.out.println("Address:"+customersS.getAddress());
    	
    	
    	
    }
}
