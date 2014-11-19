/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo Gava
 */
package chessgame;

public class SingleGame extends Game {

	private static final long serialVersionUID = 1L;

	public SingleGame() {
		super.StrTitle = "Player vs Computador - ChessGame";
		super.StrPlayerTwo = "Computador";
		super.initComponents();
	}
	
}
