
// This class inherits Loan abstract class with abstract method setIntrestrate 
// to set its own intrest rate
//GUI****************************************************************************


public class PersonalLoan extends Loan {
	
	
	/**
	 * 
	 */
	public PersonalLoan() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param loanNumber
	 * @param customerLname
	 * @param amountLoan
	 * @param term
	 */
	public PersonalLoan(double loanNumber, String customerLname, int amountLoan, int term) {
		super(loanNumber, customerLname, amountLoan, term);
		setInterestRate(); //sets own interest rate
	}
	// Abstract method sets its own intrest rate
	@Override
	public void setInterestRate() {
		rate = 2;
		
	}
	
	
	
}
