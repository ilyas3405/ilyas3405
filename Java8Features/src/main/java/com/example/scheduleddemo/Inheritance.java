package com.example.scheduleddemo;

class Laptop {
	
}

interface Formatable {
	
}

class HardDisk {
		public void writeData(String data) {
			System.out.println("Data is being written " + data);
		}
	}

class UseDell {
	//Segate is a reference of a HardDisk of the class in UseDell class
	//So, dell has a harddisk
	HardDisk segate = new HardDisk();
	public void save(String data) {
		segate.writeData(data);
	}
	
}

class Dell extends Laptop implements Formatable {
	//More detail code for dell comes here
	//Dell class will implement all accessible members of class laptop
	//Dell IS-A laptop
	//Dell class also implements all methods of Formatable interface, sence
	//dell is not a abstract class
	//so dell is a formatable
	
}

public class Inheritance {
	
	public static void main(String[] args) {
		Dell oDell = new Dell();
		if (oDell instanceof Object) {
			System.out.println("oDell is an instance of Object");
		}
		if (oDell instanceof Dell) {
			System.out.println("oDell is an instance of Dell class");
		}
		if (oDell instanceof Laptop)
		{
			System.out.println("Dell IS-A Laptop");
		}
		if (oDell instanceof Formatable) {
			System.out.println("Dell IS-A Formatable");
		}
	//Test Has-A
		new UseDell().save("This will be stored in segate.");
	}
	
}