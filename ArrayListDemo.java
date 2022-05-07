package practisework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeData e=new EmployeeData("Srinivas",29,"cse");
		EmployeeData e1=new EmployeeData("Rachana",24,"Pharmacy");
		EmployeeData e2=new EmployeeData("Ramya",21,"CSE");
		
		ArrayList<EmployeeData> al=new ArrayList<EmployeeData>();
		al.add(e);
		al.add(e1);
		al.add(e2);
		
		Iterator<EmployeeData> it=al.iterator();
		while(it.hasNext()) {
			EmployeeData lis=it.next();
			System.out.println(lis.name);
			
			System.out.println(lis.age);
			 
			System.out.println(lis.dep);
			System.out.println("*********************************");
		}

	}

}
