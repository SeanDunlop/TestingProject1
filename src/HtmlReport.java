public class HtmlReport implements Report {

    public String getHeaderLine(String name) {
        return "<html><head><title>Rentals: "
                + name + "</title></head><body>\n"+"<h1>Rentals: "
                + name + "</h1>\n"+"<table border=1><tr><th>Days</th><th>Title</th><th>Charge</th></tr>\n";
    }

    public String getFooterLine(double total, int frequentRenterPoints) {
        return "<tr><td></td><td><i>total</i><td align=right>$"
                + total + "</td></tr>\n"+"</table><p>Frequent renter points = "
                + frequentRenterPoints +"</p>\n</body></html>\n";
    }

    public String getRentalLine(int daysRented, String title, double charge) {
        return  "<tr><td align=right>"+ daysRented
                + "</td><td>" + title +"<td align=right>$"
                + charge + "</td></tr>\n";
    }
}
