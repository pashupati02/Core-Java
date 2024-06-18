package Quesn;

public class Student
{
  private String sname;
  private int pno;
  private int roll;
  private int marks;
  private String coll_name;
  //private int aadhar_no;
  
 Student(String sname, int pno, int roll, int marks, String coll_name, int aadhar_no)
{
	super();
	this.sname =sname;
	this.pno=pno;
	this.roll=roll;
	this.marks=marks;
	this.coll_name=coll_name;
	//this.aadhar_no=aadhar_no;
}
  public String getsname()
  {
	  return sname;
  }
 
  
  public int getpno()
  {
	return pno;
	  
  }
  public void setpno(int pno)
  {
	   this.pno = pno;
  }
public int getRoll() {
	return roll;
}

public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public String getColl_name() {
	return coll_name;
}

//public int getAadhar_no() {
//	return aadhar_no;
//}
//public void setAadhar_no(int aadhar_no) {
//	this.aadhar_no = aadhar_no;
//}


  
}
