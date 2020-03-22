public class TextReport implements Report {


    public String getHeaderLine(String name)
    {
        return "Rentals: " + name + "\n";
    }

    public String getFooterLine(double total, int frequentRenterPoints)
    {
        return "Total = $" + total + "\n" + "Frequent renter points = " + frequentRenterPoints + "\n" + "---\n";
    }

    public String getRentalLine(int daysRented, String title, double charge) {
        return daysRented +
                " days of '" + title +
                "' $" + String.valueOf(charge) + "\n";
    }
}
