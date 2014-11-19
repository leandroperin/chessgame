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

//import com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Collection;

import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class Square extends JLabel {

	private static final long serialVersionUID = 1L;
	private final int x,y,xPos,yPos;
        
        private final Board board;
        private Peca peca;
        

	public Square(int horizontalPos, int verticalPos, int size, int type, int i, int j, Board tabuleiro) {
		x = horizontalPos;
		y = verticalPos;
		xPos = i;
		yPos = j;
		board = tabuleiro;
		if (type == 0) {
			setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
			setBackground(Color.BLACK);
		} else {
			setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
			setBackground(Color.WHITE);
		}
		setOpaque(true);
		setBounds(x, y, size, size);
		
		onClick();
	}
	
	public void onClick() {
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
                            if (peca != null)    
                                if(board.getTurn() == 0){
                                    board.select(getBoardSquare(xPos,yPos));
                                    board.nextTurn(1);
                                    System.out.println(getBoardSquare(xPos,yPos));
                                }
                        if (peca == null || peca.eInimigo(board.getSelected().peca))      
                            if (board.getTurn() == 1){          
                                System.out.println(board.getSelected());
                                if (board.getSelected().peca.movimentoValido(board.getSelected()).contains(getBoardSquare(xPos,yPos))){ //refazer
                                    movement(board.getSelected(), getBoardSquare(xPos,yPos));
                                    System.out.println("lalalal");
                                    board.nextTurn(0); //modificar o parametro
                                    }
                                }
                                    
                                    
                                    
			}
		});
	}
        
        public Square vizinho (int i, int j){
            return board.getSquare(xPos+i, yPos+j);
        }
        
        public Peca getPiece (){
            return peca;
        }
        
        public int getX(){
            return x;
        }
        
        public int getY() {
            return y;
        }
        
        public int getLine() {
            return xPos;
        }
        
        public int getColumn() {
            return yPos;
        }
        
        public Square getBoardSquare(int lin, int col) {
            return board.getSquare(lin, col);
            
        }
        
        public void changePiece(Peca piece, int line, int column){ 
        peca = piece; 
        }
        
        public void movement (Square antigo, Square destino){ //modificado
            destino.peca = antigo.peca;
            destino.getImage();
            antigo.peca = null;
            antigo.setText("");
        }
        
        public void getImage(){
            if (peca.getClass().equals(Cavalo.class)){
                setText ("Cavalo");
            } 
        }
        
        public void addPiece(int time){ 
            if (time == 1){
                peca = new Cavalo(1);
                getImage();
            }
            if (time == 2){
                peca = new Cavalo(2);
                getImage();
            }
        }
                

}
