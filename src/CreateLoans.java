// This program demonstrates Using Interface "LoanConstanta" within using  abstract Loan perent class and with
// subclass BussinessLoan and PersonalLoan and creates  and array of five Loans
//prompt the user for current interest rate through loop asks the user  for loan type and all other
// relevent information=> store created Loan objects in the ArrayList and than  GUI Display
// Assignment: number 10
// Due Date: 11/10/2021
// Name: Sanela Zahran
//***********************************GUI IMPLEMENTATION*****************************************************************

import java.awt.Color;
import java.awt.Dimension;
import java.awt.ScrollPane;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class CreateLoans {
	

	public static void main(String[] args) {
		
		ArrayList<Object> loan = new ArrayList<>();
		//image inserted on the pane of JOptinPane
		ImageIcon image = new ImageIcon("src/java.png");
		
		
		
		JOptionPane.showInputDialog(null, "What is the current prime intrest rate?",null, JOptionPane.INFORMATION_MESSAGE,image, null,null);
		//String userString = JOptionPane.showInputDialog("What is the current prime interest rate?");
		//int intrestR = Integer.parseInt(userString);
		
		
		
		
		
		for (int i = 0; i < 2; i++) {
			//  parseInt convertig String to integer
			String userString1 = JOptionPane.showInputDialog("Which loan type? Type for:Business=1; Personal=2 ");
			//String name = JOptionPane.showInputDialog(null, image, "Which loan type for bussines=1; Personal=2");
			int type = Integer.parseInt(userString1);
			
			
			if(type == 1) {
				//Declare variables
				double loanNumb=0.0;
				String Lname = " "  ;
				
				int amountLoan = 0, term=0;
				
				//BussinesLoan object 
				BusinessLoan bussinesloan = new BusinessLoan(loanNumb, Lname, amountLoan,term);
				loan.add(bussinesloan);
				//GUI Display****************************************************************
				String userString2 = JOptionPane.showInputDialog("Enter the loan number ");
				loanNumb  = Double.parseDouble(userString2);
				
				loan.add(loanNumb);
				bussinesloan.setLoanNumber(loanNumb);
				
				//GUI*********************************************************************
				Lname = JOptionPane.showInputDialog("Enter the last name ");
				
				loan.add(Lname);
				bussinesloan.setCustomerLname(Lname);
				
				//GUI Display*******************************************************************
				String amountL = JOptionPane.showInputDialog("Enter the amount of a loan ");
				amountLoan = Integer.parseInt(amountL);
				
				loan.add(amountLoan);
				bussinesloan.setAmountLoan(amountLoan);
				
				//GUI DISPLAY******************************************************************************
				String userString4 = JOptionPane.showInputDialog("Enter the term 1 year or 3 or 5 years  ");
				term = Integer.parseInt(userString4);
				
				loan.add(term);
				bussinesloan.setTerm(term);
				
				
				//JOptionPane.showMessageDialog(null, bussinesloan.toString(),"Display Bussines Loan ",JOptionPane.INFORMATION_MESSAGE,image);
				//*****************************************************************************
				JTextArea area = new JTextArea(bussinesloan.toString());
				area.setRows(1);
				area.setColumns(50);
				area.setLineWrap(true);
				JScrollPane pane = new JScrollPane(area);
				pane.setBackground(Color.BLUE);
				//Outpu toString() with scrollPane 
				JOptionPane.showInternalConfirmDialog(null, pane, "Bussines--LOAN",JOptionPane.INFORMATION_MESSAGE,JOptionPane.INFORMATION_MESSAGE, image);
				
				
			}
			else {
				// Declaring variables
				double loanNumb=0.0;
				String Lname = " ";
				int amountLoan = 0, term=0;
				PersonalLoan personalloan = new PersonalLoan(loanNumb, Lname, amountLoan,term);
				loan.add(personalloan);
				
				//GUI DISPLAY************************************************************
				String userString5 = JOptionPane.showInputDialog("Enter the loan number ");
				loanNumb = Double.parseDouble(userString5);
				loan.add(loanNumb);
				personalloan.setLoanNumber(loanNumb);
				
				//GUI DISPLAY************************************************************
				Lname = JOptionPane.showInputDialog("Enter the Last name ");
				loan.add(Lname);
				personalloan.setCustomerLname(Lname);
				
				//GUI*******************************************************************
				String amLoan = JOptionPane.showInputDialog("Enter the amount of a loan ");
				amountLoan = Integer.parseInt(amLoan);
				loan.add(amountLoan);
				personalloan.setAmountLoan(amountLoan);
				
				//GUI***********************************************************************************
				String terminput = JOptionPane.showInputDialog("Enter the term 1 year or 3 or 5 years  ");
				term = Integer.parseInt(terminput);
				
				loan.add(term);
				personalloan.setTerm(term);
				
				//JOptionPane.showMessageDialog(null, personalloan.toString(),"Display Personal Loan ",JOptionPane.INFORMATION_MESSAGE,image);
				// add new text area to JOptionPane with
				JTextArea area = new JTextArea(personalloan.toString());
				area.setRows(1);
				area.setColumns(50);
				area.setLineWrap(true);
				JScrollPane pane = new JScrollPane(area);
				pane.setBackground(Color.red);
				JOptionPane.showInternalConfirmDialog(null, pane, "PERSONAL-LOAN",JOptionPane.INFORMATION_MESSAGE,JOptionPane.INFORMATION_MESSAGE, image);
				
				//System.out.println(personalloan.toString());
				//System.out.println("With the intrest rate of " + intrestRate + "%");
				
			
				
			}//else
			
			
			
		}// for loop
		//kb.close();


	}//main()

}//Class
