package dummy;

class Person {
	private int ssn;
	private String name;
	private int age;
	public Person(int ssn, String name, int age) {
		this.ssn = ssn;
		this.name = name;
		this.age = age;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}

class Employee2 extends Person {
	private int empid;
	private double salary;
	public Employee2(int ssn, String name, int age, int empid, double salary) {
		super(ssn, name, age);
		this.empid = empid;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [SSN=" + getSsn()+", Name=" + getName()+ ", age=" +getAge()+ ", empid=" + empid + ", salary=" + salary + "]";
	}
	
	
}

class SalesMan extends Employee2{
	int points;
	//public SalesMan() {}
	
public int getPoints() {
		return Points;
	}

	public void setPoints(int points) {
		this.Points = points;
	}
	
	public double getIncentives() {return points*500;}
	public double getTotalSalary() {return getSalary()+points*500;}

public SalesMan(int ssn, String name, int age, int empid,double salary, int points) {
		super(empid, name, salary,age,ssn);
		this.Points = points;
	}


public class Test2 {
	 SalesMan sm= new SalesMan(101,"jhon",257011,12000,7);
	 System.out.println(sm.getSsn());
	 System.out.println(sm.getName());
	 System.out.println(sm.getAge());
	 System.out.println(sm.getEmpid());
	 
}
