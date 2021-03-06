import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	public void checkPalindrome() {
		
		// Taking input from user
		System.out.println("Please enter the Palindrome number: ");
		int num = sc.nextInt();
		int numCpy = num;
		int revNum = 0;
		// Reversing number and Storing in revNum
		do{
			revNum *= 10;
			revNum += num%10;
			num = (int)num/10;
			
		}while (num > 0);
			
		// Printing palindrome if revNum == numCpy 
		System.out.println(revNum == numCpy ? "It's a Palindrome" : "Not a Palindrome");
    }

    public void printPattern() {
		// Taking input from user
		System.out.println("Please enter the maximum number of stars: ");
		int max_number = sc.nextInt();
		
		// Printing Stars
		// Outer Loop
		int i = 0;
		do{
			// Inner Loop
			int j = 0;
			do{
				System.out.print("* ");
				j++;
			}while(j < max_number - i);
			
			System.out.println();
			i++;
		}while(i < max_number);

    }
        
	public void checkPrimeNumber() {
		// Erastothenes Sieve 
		
		
		// Taking input from the user
		System.out.println("Please enter a number: ");
		int checkNum = sc.nextInt();
		
		// Check if the number is 2 or 3, if so, a prime
		if ( checkNum == 2 || checkNum == 3) {
			System.out.println("Its a prime");
		}
		// Check if number is a multiple of 2 or 3, if so, not a prime
		if ( checkNum % 2 == 0 || checkNum % 3 == 0) {
			System.out.println("Its not a prime");
		}
		// Check if number is a multiple of 6k(+-)1 lesser than sqrt(number), if so, not a prime 
		int i = 5;
		while ( i * i <= checkNum) {
			if (checkNum % i == 0 || checkNum % (i+2) == 0) {
				System.out.println("not a prime");
			}
			i += 6;
		}
		// If nothing else, is prime
			System.out.println("It is Prime");
    }
	
	public void printFibonacciSeries() {
		
		// Taking input form user
		System.out.println("Please enter the index of fibonnaci numbers you want to see: ");
		int seqIdx = sc.nextInt();
		
		// Printing the Fibonnaci numbers
        int last = -1, current = 1, i = 0;		
		do{
			current = current + last;
			last = current - last;
			System.out.print(current + " ");
			i++;
		}while(i <= seqIdx);
	}
	

    public static void main(String[] args) {
		
		Main obj = new Main();
		int choice;
		Scanner sc = new Scanner(System.in);

		do {
		System.out.println("Enter your choice from below list.\n" 
		+ "1. Find palindrome of number.\n"
		+ "2. Print Pattern for a given no.\n" 
		+ "3. Check whether the no is a  prime number.\n"
		+ "4. Print Fibonacci series.\n" 
		+ "--> Enter 0 to Exit.\n");
		System.out.println();
		
		choice = sc.nextInt();
		switch (choice) {
			case 0:
				choice = 0;
			break;
			
			case 1: {
				obj.checkPalindrome();
			}
			break;
			
			case 2: {
				obj.printPattern();
			}
			break;
			
			case 3: {
				obj.checkPrimeNumber();
			}
			break;
			
			case 4: {
				obj.printFibonacciSeries();
			}
			break;
			
			default:
				System.out.println("Invalid choice. Enter a valid no.\n");
			}
			System.out.println();
		} 
		while (choice != 0);

	System.out.println("Exited Successfully!!!");
	sc.close();
	}
}