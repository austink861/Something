import java.util.Calendar;
import java.util.GregorianCalendar; //this allows us to use the calendar utility

	class Person { 
		
		public String name;
		public String address;
		public long number;
		public String email;
		
		public Person(String a, String b, long n, String e) {
			
			name = a;
			address = b;
			number = n;
			email = e;
		}
		
		public String toString() {
			return ("I am a Person and my name is "+name+"."); //each class has its own to string statement
		}
		
	}
	
	class Student extends Person{ //this allows the Student class to use person variables
		
		final String status; //final makes the status a constant
		
		public Student(String a, String b, long n, String e, String s) {
			
			super(a,b,n,e);
			status = s;
			
		}
		
		public String toString() {
			return ("I am a Student and my name is "+name+".");
		}
		
	}
	
	class Employee extends Person{ //this allows employee to use person variables
		
		public String office;
		public double salary;
		public MyDate dateH;
		
		public Employee(String a, String b, long n, String e, String o, double s, MyDate d) {
			
			super(a,b,n,e);
			office = o;
			salary = s;
			dateH = d;
			
		}
		
		public String toString() {
			return ("I am an Employee and my name is "+name+".");
		}
		
	}
	
	class Faculty extends Employee{ //this allows faculty to use employee variables 
		
		public int hours;
		public String rank;
		
		public Faculty(String a, String b, long n, String e, String o, double s, MyDate d, int h, String r) {
			
			super(a,b,n,e,o,s,d);
			hours = h;
			rank = r;
			
		}
		
		public String toString() {
			return ("I am a Faculty member and my name is "+name+".");
		}
		
	}
	
	class Staff extends Employee{ //this allows staff to use employee variables
		
		public String title;
		
		public Staff(String a, String b, long n, String e, String o, double s, MyDate d, String t) {
			
			super(a,b,n,e,o,s,d);
			title = t;
		}
		
		public String toString() {
			return ("I am a Staff member and my name is "+name+".");
		}
		
	}
	
	class MyDate{ //this is what allows us to input a date when date hired is required
		
		
		public int year;
		public int month;
		public int day;
		
		public MyDate() {
			
			GregorianCalendar g = new GregorianCalendar();
			year = g.get(Calendar.YEAR);
			month = g.get(Calendar.MONTH);
			day = g.get(Calendar.DAY_OF_MONTH);
		}
		
		public MyDate(int a, int b, int c) {
			 
			GregorianCalendar h = new GregorianCalendar(a,b,c);
		}
		
		public void setDate(long a) {
			GregorianCalendar mil = new GregorianCalendar();
			mil.setTimeInMillis(a);
			
			month = mil.get(Calendar.YEAR);
			day = mil.get(Calendar.DAY_OF_MONTH);
			year = mil.get(Calendar.YEAR);
		}
		
		public int getDay() {
			return day;
		}
		
		public int getMonth() {
			return month;
		}
		
		public int getYear() {
			return year;
		}
		
		public String toString() {
			return month+"/"+day+"/"+year+" ";
		}
		
	}
	
	
	public class homework {

	public static void main(String[] args) {

		Person h = new Person("Peter Builer", "2468 Pine Circle", 382345324, "pbuiler34@gmail.com");
		System.out.println(h);
		
		Student g = new Student("Austin Wilkerson", "283 Wein Point", 238245326, "awilks3@yahoo.com", "Sophomore");
		System.out.println(g);
		
		Employee t = new Employee("Johnny Pujols","7592 St. Ave.",836467431,"pujols$@outlook.com","Acadmics",(72000),(new MyDate(1998,4,6)));
		System.out.println(t);
		
		Faculty u = new Faculty("Brady Fournier","2916 Holstead St.", 237456773,"bradyfournier2003@gmail.com", "Math", (83000),new MyDate(2003,1,24), 78, "Supervisor of Analytical Geometry");
		System.out.println(u);
		
		Staff s = new Staff("Toby Berry","204 N. 17th St.", 384253425, "tobyb78@gmail.com", "English", (92000), new MyDate(2005,6,23), "Supervisor of Academic Dishonesty");
		System.out.println(s);
		
	}

}
