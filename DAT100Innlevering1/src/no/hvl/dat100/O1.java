package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class O1 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10;i++) {

			int poengsum = Integer.parseInt(showInputDialog("Kva var poengsummen til elevenummer " + i + "?"));

			if (poengsum <= 100 && 90 <= poengsum) {
				System.out.println("WOW, gratulerer, din karakter er A!");
			} else if (poengsum <= 89 && 80 <= poengsum) {
				System.out.println("Gratulerer, din karakter er B!");
			} else if (poengsum <= 79 && 60 <= poengsum) {
				System.out.println("Gratulerer, karakteren din ble ein middelmådig C");
			} else if (poengsum <= 59 && 50 <= poengsum) {
				System.out.println("Jaja, karakteren din ble D");
			} else if (poengsum <= 49 && 40 <= poengsum) {
				System.out.println("Ehhh.. din karakter er E. Jobb hardere")
			} else if (poengsum <= 39 && 0 <= poengsum) {
				System.out.println("Oufff... din karakter er F!");
			} else
				System.out.println("Tallet skal være mellom 0-100.. tast inn på nytt din tullebukk");
			
		}

	}
}
