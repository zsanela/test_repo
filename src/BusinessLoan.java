//GUI******************************************
public class BusinessLoan extends Loan{

	/**
	 * 
	 */
	public BusinessLoan() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	/**
	 * @param loanNumber
	 * @param customerLname
	 * @param amountLoan
	 * @param term
	 */
	public BusinessLoan(double loanNumber, String customerLname, int amountLoan, int term) {
		super(loanNumber, customerLname, amountLoan, term);
		setInterestRate();//sets own intrest rate
	}



	// Abstract method
	@Override
	public void setInterestRate() {
		rate = 1;
		
	}
	
	
	
	
	
	
}
