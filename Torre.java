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

public class Torre extends Peca {
	
	String[][] tabuleiro;
	int posicaoLinha;
	int posicaoColuna;
        Collection<Square> movimentos;
        protected final boolean cor;
       
	
	public Torre (boolean cor) {
            movimentos = new ArrayList<>();
            this.cor = cor;
        }

	
        @Override
        public void movimentar(int i, int j) {
	}
	
		
	public Collection<Square> movimentoValido(Square s) {
            int linha = s.getLine();
            int coluna = s.getColumn();
            movimentos.clear();
            for (int i = linha+1; i < 8; i++ )
            {
                Square square = s.getBoardSquare(i, coluna);
                if (square.getPiece() == null) {
                movimentos.add(square);
                } 
                else if (eInimigo(square.getPiece())) { //cima
                    movimentos.add(square);
                    break;
                } 
                else {break;}
            }
            for (int i = linha-1; i > -1; i-- )
            {
                Square square = s.getBoardSquare(i, coluna);
                if (square.getPiece() == null) {
                movimentos.add(square);
                } 
                else if (eInimigo(square.getPiece())) { //baixo
                    movimentos.add(square);
                    break;
                } 
                else {break;}
            }
            for (int i = coluna+1; i < 8; i++ )
            {
                Square square = s.getBoardSquare(linha, i);
                if (square.getPiece() == null) {
                movimentos.add(square);
                } 
                else if (eInimigo(square.getPiece())) { //direita
                    movimentos.add(square);
                    break;
                } 
                else {break;}
            }
            for (int i = coluna-1; i >= 0; i-- )
            {
                Square square = s.getBoardSquare(linha, i);
                if (square.getPiece() == null) {
                movimentos.add(square);
                } 
                else if (eInimigo(square.getPiece())) { //esquerda
                    movimentos.add(square);
                    break;
                } 
                else {break;}
            }
        return movimentos;
            
	}
}

