import java.util.Enumeration;

public abstract class Statement {
    abstract String[] getTexts();
    public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String[] texts = getTexts();
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