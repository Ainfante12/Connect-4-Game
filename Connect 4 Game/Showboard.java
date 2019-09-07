package Project2;

public class Showboard {

	
	public static void main (String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			
			@Override
			public void run() {
				C4Game_GUI gui = new C4Game_GUI(); // change "Project2" to "C4Game"
			}
			
		});
	}

}
