package oblig1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class O3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(showInputDialog("Hvilket tall skal regnes ut fakulteten til?"));
		int fakultet = 1;
		for ( ; n>0; n--) {
			fakultet = fakultet * n;
		}
		showMessageDialog (null, "Fakultetet av tallet ditt er: " + fakultet + ".");
		
	}

}
