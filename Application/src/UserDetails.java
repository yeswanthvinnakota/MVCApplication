
public class UserDetails{
	
	
	public static void main(String[] args) {
		try {
			System.out.println("Hello i'm from try block");
			int a = 2;
			int b = 0;
			int c = a/b;
			
		}
		catch(Exception e) {
			System.out.println("Hello i'm from catch block");
		}
		
		finally {
			System.out.println("Hello i'm from finally block");
		}
	}
	
}
