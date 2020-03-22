import java.util.*;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<Rental>();

    public Customer(String name) {
	this.name = name;
    }

    public String getName() {
	return name;
    }

    public void addRental(Rental arg) {
	rentals.add(arg);
    }

    public String statement()
	{
		return statement(new TextReport());
	}

	public String htmlStatement()
	{
    	return statement(new HtmlReport());
	}

    public String statement(Report report) {

		double totalAmount = 0;
		String result = report.getHeaderLine(name);
		int frequentRenterPoints = 0;

		for(Rental rental : rentals) {

			//determine amounts for each line
			double charge = rental.getCharge();
			// add frequent renter points
			frequentRenterPoints += rental.getFrequentRenterPoints();
			//show figures for this rental
			result += rental.getRentalLine(report);
			totalAmount += charge;
		}
		//add footer lines
		result += report.getFooterLine(totalAmount, frequentRenterPoints);
		return result;
    }

}

