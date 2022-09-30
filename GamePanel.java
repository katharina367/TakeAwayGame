	/** 
	* Komplette Datei wurde freundlicherweise von Prof. Lorenz im Programmierkurs Sommer 2022
	* bereitgestellt
	*/
	
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * A subclass of JPanel used to draw tokens on a game field.
 * 
 * @author Patrizia Schalk
 * @version 1.0
 */

@SuppressWarnings("serial")
public class GamePanel extends JPanel {

	/**
	 * The constructor for the game field. Sets the size of the game field to the specified 
	 * values and sets the background color to white.
	 * 
	 * @param width			The width of the game field
	 * @param height		The height of the game field
	 */
	public GamePanel(int width, int height) {
		super();
		setPreferredSize(new Dimension(width,height));
		setBackground(Color.WHITE);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		TokenContainer container = TokenContainer.instance();
		for(Token token : container) {
			token.draw(g);
		}
	}
	
}
