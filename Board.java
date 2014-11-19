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

public class Board {
	
	private Square[][] board = new Square[8][8];

	public Board () {
		buildBoard();
	}
	
	public Square[][] getBoard() {
		return board;
	}
        
        private int turn = 0; //modificado
	
        private Square selected; //modificado
	
        private void buildBoard() {
		for (int i=0;i<8;i++) {
			for (int j=0;j<8;j++) {
				
				if (verifyType(i)) {
					if (verifyType(j)) {
						board[i][j] = new Square(380+i*65,30+j*65,65,0,i, j, this);
					} else {
						board[i][j] = new Square(380+i*65,30+j*65,65,1,i, j, this);
					}
				} else {
					if (verifyType(j)) {
						board[i][j] = new Square(380+i*65,30+j*65,65,1,i, j, this);
					} else {
						board[i][j] = new Square(380+i*65,30+j*65,65,0,i, j, this);
					}
				}				
			}
		}
	}
	
	public void setVisible(boolean visible) {
		for (int i=0;i<8;i++) {
			for (int j=0;j<8;j++) {
				board[i][j].setVisible(visible);
			}
		}
	}
	
	private boolean verifyType(int n) {
		if (n % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
        
	public Square getSquare (int i, int j){
		Square square = null;
        if (i < 8 && i >= 0 && j<8 && j >=0) {
        	square = board[i][j];
        }
        return square;
	}
	
        public Square getSelected() { //modificado
            return selected;
        }
        
        public void select (Square s){ //modificado
            selected = s;
        }
        
        public int getTurn (){ //modificado
            return turn;
        }
        
        public void nextTurn(int turno) { //modificado
            turn = turno;
        }
}

