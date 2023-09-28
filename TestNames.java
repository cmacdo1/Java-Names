import java.util.Scanner;

public class TestNames
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		// get two names and create two name objects
		System.out.print("Enter first name #1: ");
		String first1 = scan.nextLine();
		
		System.out.print("Enter middle name #1: ");
		String middle1 = scan.nextLine();
		
		System.out.print("Enter last name #1: ");
		String last1 = scan.nextLine();
		
		Name name1 = new Name(first1, middle1, last1);
		
		
		System.out.print("Enter first name #2: ");
		String first2 = scan.nextLine();
		
		System.out.print("Enter middle name #2: ");
		String middle2 = scan.nextLine();
		
		System.out.print("Enter last name #2: ");
		String last2 = scan.nextLine();
		
		Name name2 = new Name(first2, middle2, last2);
		
		// show info for each name
		System.out.println();
		System.out.println("FirstMiddleLast: " + name1.firstMiddleLast());
		System.out.println("LastFirstMiddle: " + name1.lastFirstMiddle());
		System.out.println("Initials: " + name1.initials());
		System.out.println("Length: " + name1.length());
	
		System.out.println();
		System.out.println("FirstMiddleLast: " + name2.firstMiddleLast());
		System.out.println("LastFirstMiddle: " + name2.lastFirstMiddle());
		System.out.println("Initials: " + name2.initials());
		System.out.println("Length: " + name2.length());
		
		// Tell whether or not the names are the same
		System.out.println();
		if(name1.equals(name2))
			System.out.println("The names are the same");
			else
				System.out.println("The names are different");
		
		scan.close();

	}

}
