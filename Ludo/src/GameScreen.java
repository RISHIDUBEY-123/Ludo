

import javax.swing.JFrame;

public class GameScreen {
	   public static void main(String[] args) {
	        JFrame jframe = new JFrame();
	        jframe.setBounds(10,10,1000,600);
	        jframe.setTitle("LUDO");
	        jframe.setResizable(true);
	        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        Game_Movies gm = new Game_Movies();
	        gm.setFocusable(true);
	        gm.addKeyListener(gm);
	        gm.addMouseListener(gm);
	        jframe.add(gm);
	        jframe.setVisible(true);
	   }
}