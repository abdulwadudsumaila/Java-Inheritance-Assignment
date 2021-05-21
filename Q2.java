
class Member{
	  String name;
	  int age;
	  String number;
	  String address;
	  int salary;

	  public void printSalary(){
	    System.out.println(salary);
	  }

	}

	class Employee extends Member{
	  String specialization;
	}

	class Manager extends Member{
	  String department;
	}

public class Q2 {
	public static void main(String[] args){
	    Employee e = new Employee();
	    e.name = "ABDUL";
	    e.age = 23;
	    e.number = "+233241112223";
	    e.address = "Naa Luro estate";
	    e.salary = 7000;
	    e.specialization = "Software developer";

	    Manager m = new Manager();
	    m.name = "Wadud";
	    m.age = 26;
	    m.number = "+233542221113";
	    m.address = "Gariba lodge";
	    m.salary = 10000;
	    m.department = "IT department";
	 
	  }
	}	
