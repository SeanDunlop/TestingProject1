public class Rental {

    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
	this.movie = movie;
	this.daysRented = daysRented;
    }

    public double getCharge()
    {
        return movie.charge(daysRented);
    }

    public int getFrequentRenterPoints(){
        int points = 1;
        if ((movie.isNewRelease()) &&
                daysRented > 1) points ++;

        return points;
    }

    public String getRentalLine(Report report)
    {
        return report.getRentalLine(daysRented, movie.getTitle(), getCharge());
    }
}

