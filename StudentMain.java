package com.stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentMain {
	
	public static void main(String[] args) {
		
		
		Student1 s1=new Student1();
        s1.setSid(101);
        s1.setSname("Sachin");
        s1.setSalary(5000.0);
        
        Student1 s2=new Student1();
        s2.setSid(110);
        s2.setSname("Amol");
        s2.setSalary(11000.0);
        
        
        Student1 s3=new Student1();
        s3.setSid(111);
        s3.setSname("Jay");
        s3.setSalary(15000.0);
        
        Student1 s4=new Student1();
        s4.setSid(115);
        s4.setSname("Akshay");
        s4.setSalary(10000.0);
        
        
        
        List<Student1> l=new ArrayList<Student1>();
        l.add(s1);
        l.add(s2);
        l.add(s3);
        l.add(s4);
        
       List<Student1> st= l.stream().filter(i->i.getSalary()>=10000).collect(Collectors.toList());
       System.out.println(st);
      
      for(Student1 info:st)
      {
    	  System.out.println(info.getSid());
    	  System.out.println(info.getSname());
    	  System.out.println(info.getSalary());
    	  System.out.println("--------------");
      }
       
	}

}
