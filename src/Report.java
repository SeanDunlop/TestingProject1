public interface Report {

    public String getHeaderLine(String name);
    public String getFooterLine(double total, int frequentRenterPoints);
    public String getRentalLine(int daysRented, String title, double charge);

}

