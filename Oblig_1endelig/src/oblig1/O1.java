package oblig1;

import static javax.swing.JOptionPane.*;


public class O1 {
	
	private static double trinnSkattKalkulering(int lonn, int min, int max, double prosent) {
		//
		int trinnskatt = Math.max(Math.min(lonn, max)-min, 0);
		return trinnskatt*prosent;
	}
	//void gjør at man ikke returnerer noe. "Returnerer noe tomt". "Void" is stedet for, for eksempel "double"
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int lonn = Integer.parseInt(showInputDialog("Lønn:"));
		if(lonn<184800) {
			showMessageDialog(null, "Du må betale trenger ikke betale noe skatt hvis du tjener " + lonn + "kr.");
			return;
		}
	
		double skatt = 0;
		skatt += trinnSkattKalkulering(lonn, 184800, 260100, 0.017);
		skatt += trinnSkattKalkulering(lonn, 260100+1, 651250, 0.04);
		skatt += trinnSkattKalkulering(lonn, 651250+1, 1021550, 0.132);
		skatt += trinnSkattKalkulering(lonn, 1021550+1, Integer.MAX_VALUE, 0.162);
		
		//String.format formaterer argumenter om til strenger. %.2f gjør at skatt har 2 desimaltegn
		showMessageDialog(null, "Du må betale " + String.format("%.2f" ,skatt) + "kr i skatt når du har tjent " + lonn + "kr");
		
	}

}
