import javax.swing.JOptionPane;

public class Netflix {
	public static void main(String[] args) {
		Movie twi = new Movie("Twilight", -1);
		Movie hp = new Movie("Harry Potter", 4);
		Movie fg = new Movie("Forrest Gump", 3);
		Movie tita = new Movie("Titanic", 2);
		Movie fro = new Movie("Frozen", 1);
		JOptionPane.showMessageDialog(null, twi.getTicketPrice());
		NetflixQueue queue = new NetflixQueue();
		queue.addMovie(twi);
		queue.addMovie(hp);
		queue.addMovie(fg);
		queue.addMovie(tita);
		queue.addMovie(fro);
		queue.printMovies();
		queue.sortMoviesByRating();
		JOptionPane.showMessageDialog(null, queue.getBestMovie());
		JOptionPane.showMessageDialog(null, queue.getMovie(1));
	}
}
