import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Movie x = new Movie();
		Movie m = new Movie(x); 
		char s1 = ' ';
		
		do {
			System.out.println("Enter the name of a movie");
			m.setTitle(s.nextLine());
			
			System.out.println("Enter the rating of the movie");
			m.setRating(s.nextLine());
			
			System.out.println("Enter the number of tickets sold for this movie");
			m.setSoldTickets(s.nextInt());
			
			System.out.println(m.toString());
			System.out.println("Do you want to enter another? y/n");
			while (!s.hasNext("[yn]")) {
				System.out.println("Invalid input, try again");
				s.next();
			}
			s1 = s.next().charAt(0);
			s.nextLine();
		} while (s1 == 'y');
		s.close();
	}
}
