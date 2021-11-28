import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
//GUI******************************************************


public abstract class Loan implements LoanConstanta{
	//Using "Jave.png" image on GUI-Display.When display error for term and Loan amount.
	ImageIcon image = new ImageIcon("src/java.png");
	
	Scanner kbc = new Scanner(System.in);
	double loanNumber;
	String customerLname;
	int amountLoan;
	int rate;
	int term;
	/**
	 * 
	 */
	public Loan() {
		super();
	}
	/**
	 * @param loanNumber
	 * @param customerLname
	 * @param amountLoan
	 * @param term
	 */
	public Loan(double loanNumber, String customerLname, int amountLoan, int term) {
		super();
		this.loanNumber = loanNumber;
		this.customerLname = customerLname;
		this.amountLoan = amountLoan;
		this.term = term;
	}
	
	
	
	/**
	 * @return the loanNumber
	 */
	public double getLoanNumber() {
		return loanNumber;
	}
	/**
	 * @param loanNumber the loanNumber to set
	 */
	public void setLoanNumber(double loanNumber) {
		this.loanNumber = loanNumber;
	}
	/**
	 * @return the customerLname
	 */
	public String getCustomerLname() {
		return customerLname;
	}
	/**
	 * @param customerLname the customerLname to set
	 */
	public void setCustomerLname(String customerLname) {
		
		this.customerLname = customerLname;
	}
	/**
	 * @return the amountLoan
	 */
	public double getAmountLoan() {
		return amountLoan;
	}
	/**
	 * @param amountLoan the amountLoan to set
	 * Does not allow loan amounts over $500,000
	 * which is defined in the INTERFACE LoanConstanta
	 */
	public void setAmountLoan(int amountLoan) {
		if (amountLoan > MAXLOAN) {
			String allString = " ";
			//GUI***************************************************************************************
			allString = amountLoan + " This is over limit, the amount must be less than $500,000";
			JOptionPane.showMessageDialog(null,allString,"Display Error",JOptionPane.ERROR_MESSAGE,image);
			
			
			String amLoan = JOptionPane.showInputDialog("Enter the aloud loan amount ");
			amountLoan = Integer.parseInt(amLoan);
			
			this.amountLoan = amountLoan;
		}else {
			this.amountLoan = amountLoan;
		}
		
	}
	/**
	 * @return the term
	 */
	public double getTerm() {
		
		return term;
	}
	
	/**
	 * @param term the term to set
	 * force any loan term one of the three defined 
	 * in the INTERFACE=> LoanConstanta class
	 */
	
	public void setTerm(int term) {
		if(term == SHORTTERM) {
			this.term = term;
			
		}else if(term ==MEDIUMTERM) {
			this.term = term;
		}else if(term ==LONGTERM) {
			this.term = term;
		}else {
			
			//GUI DISPLAY ERROR**************************************************************************
			String allString = " ";
			allString = term + " Wrong number of term. The right term number is 1 or 3 or 5";
			JOptionPane.showMessageDialog(null,allString,"Display Error of term",JOptionPane.ERROR_MESSAGE,image);
			
			//GUI DISPLAY*********************************************************************************
			String amLoan = JOptionPane.showInputDialog("Enter the term again ");
			term = Integer.parseInt(amLoan);
			this.term = term;
		}
		
		
	}
	

	//**********ABSTRACT METHOD********************************************************
	// Abstract method if any classes inherits this class those 
	//classes responsible to provide the DETAILED functions/ methods for them
	
	public abstract void setInterestRate();
	
	
	@Override
	public String toString() {
		return "Loan: Number " + loanNumber + ",Customer Last name " + customerLname + ", amount of loan " + amountLoan
				+ ", term is " + term;
	}
	
	
	
	
	
	
	
}
