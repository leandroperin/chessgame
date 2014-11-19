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
import java.util.ArrayList;
import java.util.Collection;

public class Bispo extends Peca {
	
	String[][] tabuleiro;
        Collection<Square> movimentos;
        protected final boolean cor;
	
	public Bispo (boolean cor) {
            movimentos = new ArrayList<>();;
            this.cor = cor;
        }

	
        @Override
        public void movimentar(int i, int j) {
	}
	
		
	public Collection<Square> movimentoValido(Square s) {
            int linha = s.getLine();
            int coluna = s.getColumn();
            movimentos.clear();
            int i = linha+1;
            int j = coluna+1;
            while (i < 8 && j < 8){
                Square square = s.getBoardSquare(i, j);
                if (square.getPiece() == null) {
                movimentos.add(square);
                } 
                else if (eInimigo(square.getPiece())) { //cima
                    movimentos.add(square);
                    break;
                } 
                else {break;}
                i++;
                j++;
            }
            i=linha + 1;
            j=coluna-1;
            while (i < 8 && j >= 0){
                Square square = s.getBoardSquare(i, j);
                if (square.getPiece() == null) {
                movimentos.add(square);
                } 
                else if (eInimigo(square.getPiece())) { //cima
                    movimentos.add(square);
                    break;
                } 
                else {break;}
                i++;
                j--;
            }
            i = linha-1;
            j = coluna+1;
            while (i >= 0 && j < 8){
                Square square = s.getBoardSquare(i, j);
                if (square.getPiece() == null) {
                movimentos.add(square);
                } 
                else if (eInimigo(square.getPiece())) { //cima
                    movimentos.add(square);
                    break;
                } 
                else {break;}
                i--;
                j++;
            }
            i = linha-1;
            j = coluna-1;
            while (i >= 0 && j >= 0){
                Square square = s.getBoardSquare(i, j);
                if (square.getPiece() == null) {
                movimentos.add(square);
                } 
                else if (eInimigo(square.getPiece())) { //cima
                    movimentos.add(square);
                    break;
                } 
                else {break;}
                i--;
                j--;
            }
        return movimentos;
            
	}
}

