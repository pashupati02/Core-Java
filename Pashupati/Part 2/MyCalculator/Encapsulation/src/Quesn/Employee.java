package Quesn;

public class Employee 
{
	private String ename;
	private int salary;
	private int eid;
	private int joining_date;
	private String c_name;
	
	 Employee(String ename, int salary, int eid, int joining_date, String c_name) {
		this.ename = ename;
		this.salary=salary;
		this.eid = eid;
		this.joining_date = joining_date;
		this.c_name = c_name;
	}
	public String getEname() {
		return ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public String getC_name() {
		return c_name;
	}
	public int getJoining_date() {
		return joining_date;
	}
	
	
}
