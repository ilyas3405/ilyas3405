package com.example.scheduleddemo;

 public final class ImmutableClass 
{ 
    final String name; 
    final int regNo; //Final means it cannot be changed from outside. 
    				//If we dont define assessor, then its availble in the same package
    				//Only at object creation it can be assiged a value
  
    public ImmutableClass(String name, int regNo) 
    { 
        this.name = name; 
        this.regNo = regNo; 
    } 
    public String getName() 
    { 
        return name; 
    } 
    public int getRegNo() 
    { 
        return regNo; 
    } 
} 
