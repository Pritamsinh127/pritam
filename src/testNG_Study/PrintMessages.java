package testNG_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PrintMessages {
  @Test
  public void PrintingWays() 
  {
	  System.out.println("Hi this is writteen in printing statement");
	  Reporter.log("HI this is written in reporter without boolean value");
	  Reporter.log("HI this is written in reporter with boolean value", true);
	  
  }
}
 
/* Conclusion:-
 * 1) If you want to see printing statements i.e. messages in console window then,
 * S.O.P. & reporter with boolean value statement prints there message only.
 * reporter without boolean value will not print in console.
 * 
 * 2) If you want to see messages in emailable-report & index.html then,
 * S.O.P. will not going to show message but other two statments 
 * reporter without boolean value & reporter with boolean value will.
 * */
 