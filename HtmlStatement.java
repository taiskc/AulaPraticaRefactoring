public class HtmlStatement extends Statement {

   protected String[] getTexts() {
     String[] texts = new String[] {"<H1>Rentals for <EM>", "</EM></H1><P>\n", "", ": ", "<BR>\n", "<P>You owe <EM>", "</EM><P>\n", "On this rental you earned <EM>", "</EM> frequent renter points<P>"}; 
     
     return texts;
   }
}