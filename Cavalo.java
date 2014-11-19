/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chessgame;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Gustavo Gava
 */
public class Cavalo extends Peca{	
	String[][] tabuleiro;
	int posicaoLinha;
	int posicaoColuna;
        Collection<Square> movimentos;
        protected final int cor;
       
	
	public Cavalo (int cor) {
            movimentos = new ArrayList<>();
            this.cor = cor;
        }

	
        @Override
        public void movimentar(int i, int j) {
	}
	
	    
    
    public Collection<Square> movimentoValido(Square s) {
        movimentos.clear();
        int[][] moves = {
            {-2, 1},
            {-1, 2},
            {1, 2},
            {2, 1},
            {2, -1},
            {1, -2},
            {-1, -2},
            {-2, -1}
        };
        for (int[] i : moves) {
            Square square = s.vizinho(i[0], i[1]);
            if (square != null && (square.getPiece() == null || eInimigo(square.getPiece()))) {
                movimentos.add(square);
            }
        }
        return movimentos;
    }
}
