package arrayQs;

public class Student {

	String name ; int roll;long pno;
	Student(String name,int roll,long pno)
	{
		this.name=name;
		this.roll=roll;
		this.pno=pno;
		
		
	}
	
	public static void main(String[] args) 
	{
		Student s1= new Student("Dhiru",755,20075);
		Student s2= new Student("Pashupati",756,20078);
		Student s3= new Student("Randhir",587,857496);
		Student s4= new Student("Raghupati",144,235689);
		Student s5= new Student("Dhirura",8879,279461);
		Student [] s = {s1,s2,s3,s4,s5};
           System.out.println("The reference of all student classs is :" +s);
           System.out.println("The Data Of Student1 is "+s[0].name);
           System.out.println("The Data Of Student1 is "+s[0].roll);
           System.out.println("The Data Of Student1 is "+s[0].pno);
           System.out.println("The Data Of Student2 is "+s[1].name);
           System.out.println("The Data Of Student2 is "+s[1].roll);
           System.out.println("The Data Of Student2 is "+s[1].pno);
           System.out.println("The Data Of Student3 is "+s[2].name);
           System.out.println("The Data Of Student3 is "+s[2].roll);
           System.out.println("The Data Of Student3 is "+s[2].pno);
           System.out.println("The Data Of Student4 is "+s[3].name);
           System.out.println("The Data Of Student4 is "+s[3].roll);
           System.out.println("The Data Of Student4 is "+s[3].pno);
           System.out.println("The Data Of Student5 is "+s[4].name);
           System.out.println("The Data Of Student5 is "+s[4].roll);
           System.out.println("The Data Of Student5 is "+s[4].pno);

          
		
		
	}

}
