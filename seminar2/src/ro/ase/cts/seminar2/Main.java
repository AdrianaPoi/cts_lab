package ro.ase.cts.seminar2;

import ro.ase.cts.seminar2.exceptii.IlegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsufficientFundExdeption;

public class Main {

	public static void main(String[] args) {
		CurrentAccount c=new CurrentAccount(300, "IBAN1", 500);
		CurrentAccount c1=new CurrentAccount(200, "IBAN2", 500);

		System.out.println("Suma disponibila: " +c.getBalance());
		System.out.println("Creditul maxim pentru cont curent este: " + CurrentAccount.MAX_CREDIT);	
		c.deposit(200);
		System.out.println("Suma disponibila: " +c.getBalance());
		try {
			c.withdraw(300);
			c.trasfer(100, c);
		} catch (InsufficientFundExdeption | IlegalTransferException e) {
			System.err.println(e.getMessage());
		
		}
		System.out.println("Suma disponibila: " +c.getBalance());
		System.out.println("Suma disponibila in contul 2: " +c1.getBalance());

	}	
}
