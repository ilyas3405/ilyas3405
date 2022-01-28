package com.example.scheduleddemo;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

import com.example.scheduleddemo.ImmutableClass;

public class ImmutableDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImmutableClass s = new ImmutableClass("ABC", 101); 
		System.out.println(s.getName()); 
        System.out.println(s.getRegNo()); 
        
  //      s.regNo = 200;
     
       StringBuilder mnt = new StringBuilder();
       mnt.append("Khaled");
       System.out.println("Capacity of object mnt " + mnt.capacity());
       mnt.append("Hyder");
       System.out.println("Capacity of object mnt " + mnt.capacity());
       mnt.append("Idrees");
       System.out.println("Capacity of object mnt " + mnt.capacity());
       
       System.out.println(mnt);

       System.out.println("Now adding text in the middle");
       mnt.append(true);
       mnt.append(false);
       
       mnt.append(12);
       mnt.insert(5, "HELLO");	
       mnt.replace(20,25, "Java");
   
       mnt.reverse();
       System.out.println(mnt);
       
       System.out.println("Capacity of object mnt " + mnt.capacity());
 
       StringBuffer sb = new StringBuffer();
       sb.append("Abdullah");
       sb.append("Hassan");
       sb.insert(8, "Zaidu");
       System.out.println(sb);
       //System.out.println(sb.reverse());
       System.out.println(sb.lastIndexOf("Hassan"));


       AtomicInteger ai = new AtomicInteger();
     
       Integer i = 12;
     
       
       
    	
	}

}
