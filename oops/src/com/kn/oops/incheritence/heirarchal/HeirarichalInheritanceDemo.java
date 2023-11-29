package com.kn.oops.incheritence.heirarchal;

public class HeirarichalInheritanceDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.empid=001;
		e1.name="SANKAR";
		e1.salary=800000.00;
		e1.designition="Full Stack Developer";
		
		TestEngineer t1 =new TestEngineer();
		t1.empid=0022;
		t1.name="Gobi";
		t1.salary=50000.00;
		t1.designition="Sr.Qualityt Assurance Engineer";
		TeamLead t2= new TeamLead();
		t2.empid=0031;
		t2.name="DEEPI";
		t2.salary=500000.0;
		t2.designition="People Teamleader";
		Manager m1 =new Manager();
		m1.empid=0045;
		m1.name="NARAYANAN";
		m1.salary=1000000.0;
		m1.designition="People Manager";
		System.out.println("Developer Deteils");
		System.out.println("Id = "+e1.empid);
		System.out.println("Name = "+e1.name);
		System.out.println("Salary = "+e1.salary);
		System.out.println("Designation = "+e1.designition);
		System.out.println("****************\n");
		
		System.out.println("TestEngineer Deteils");
		System.out.println("Id = "+t1.empid);
		System.out.println("Name = "+t1.name);
		System.out.println("Salary = "+t1.salary);
		System.out.println("Designation = "+t1.designition);
		System.out.println("****************\n");

		System.out.println("TeamLead Deteils");
		System.out.println("Id = "+t2.empid);
		System.out.println("Name = "+t2.name);
		System.out.println("Salary = "+t2.salary);
		System.out.println("Designation = "+t2.designition);
		System.out.println("****************\n");
		
		System.out.println("Manager Deteils");
		System.out.println("Id = "+m1.empid);
		System.out.println("Name = "+m1.name);
		System.out.println("Salary = "+m1.salary);
		System.out.println("Designation = "+m1.designition);
		System.out.println("****************\n");
		}

}
