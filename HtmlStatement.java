import java.util.Enumeration;

public class HtmlStatement extends Statement {
  private String[] texts = new String[] {"<H1>Rentals for <EM>", "</EM></H1><P>\n", "", ": ", "<BR>\n", "<P>You owe <EM>", "</EM><P>\n", "On this rental you earned <EM>", "</EM> frequent renter points<P>"};
   public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = texts[0] + aCustomer.getName() +
      texts[1];
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for each rental
         result += texts[2] + each.getMovie().getTitle()+ texts[3] +
         String.valueOf(each.getCharge()) + texts[4];
      }
      //add footer lines
      result += texts[5] +
      String.valueOf(aCustomer.getTotalCharge()) + texts[6];
      result += texts[7] + 
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      texts[8];
      return result;
   }
}