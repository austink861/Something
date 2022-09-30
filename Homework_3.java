import java.util.Scanner; //This allows us to use the Scanner class for input. 
public class Homework_3 {

	
	public static void add(int a, int b) {
		
			try {
				if(a<0 || b<0) {
					throw new Exception("Value cannot be below 0 when adding.");}
			}catch(Exception ex){
				System.out.println(ex.getMessage());
		}finally {  //The finally statement allows the program to continue with the adding function
			        //despite the error message displayed. 
			System.out.println("A + B = "+(a+b)); 
		}
	}
	
	public static void divide(int a, int c) {
		
		try {
			int x = a/c;
			System.out.println("A / C = "+x);
		}catch(ArithmeticException e) {
			System.out.println("Cannot divide by 0.");
		}           //Due to the lack of a finally statement, the program is terminated after the 
		            //divide by 0 error is posted.
	}
	
	
	public static void main(String[] args) {

		Scanner n = new Scanner(System.in);
		
		System.out.print("Please enter 3 numbers. ");
		int a = n.nextInt();
		int b = n.nextInt();
		int c = n.nextInt();
		
		add(a,b);
		divide(a,c);
		
	}

}
