package oblig1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import javax.swing.JOptionPane;

public class O2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		for (int i = 0; i<=9; i++) {
			
			String karakter = "F";
			
			String input = showInputDialog("Karakter til eleven:");
			
			// hvis brukeren avslutter programmet, kresjet programmet. Nå breaker den ut av if setningen i stedet for.
			// du kan bruke null til strenger, men ikke til int. Brukte null siden dette er en streng
			if (input == null) {
				break;
			}
			
			int poeng = 0;
			try { 
				poeng = Integer.parseInt(input);
			}
			catch(NumberFormatException e) {
				showMessageDialog(null, "ERROR! Det du tastet inn er ikke et akseptert tall. ERROR!");
				i--;
				continue;
			}
			
			if (poeng < 0 || poeng > 100) {
				showMessageDialog (null, "ERROR! Aksepterer ikke tall under 0 eller høyere enn 100. " + poeng + " er ikke en akseptert verdi. ERROR!");
				i--;
			}else if (poeng >= 0 && poeng <= 39) {
				karakter = "F";
				
			}else if (poeng > 40 && poeng <= 49) {
				karakter = "E";
				
			}else if (poeng >= 50 && poeng <=59) {
				karakter = "D";
				
			}else if (poeng >= 60 && poeng <= 79) {
				karakter = "C";
				
			}else if (poeng >= 80 && poeng <= 89) {
				karakter = "B";
			
			}else if (poeng >= 90 && poeng <= 100) {
				karakter = "A";
			}
			showMessageDialog(null, "Med en poengsum på " + poeng + ", har eleven karakter " + karakter + ".");	
		}
		}
	}
