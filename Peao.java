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
//0 branca 1 preta 
public class Peao extends Peca {
	
	String[][] tabuleiro;
	int posicaoLinha;
	int posicaoColuna;
        Collection<Square> movimentos;
        protected final boolean cor;
        private boolean moved = false;
       
	
	public Peao (boolean cor) {
            movimentos = new ArrayList<>();
            this.cor = cor;
        }

        public void setMoved() {
            moved = true;
        }
	
        @Override
        public void movimentar(int i, int j) {
	}
        public Collection<Square> movimentoValido(Square s) {
            movimentos.clear();
            if (cor == false ){
                Square square = s.vizinho(-1, 0);
                if (square.getPiece() == null) {
                    movimentos.add(square);
                    if (moved == false){
                        square = s.vizinho(-2,0);
                        if (square.getPiece() == null) {
                            movimentos.add(square);
                        }
                    }
                }
                square = s.vizinho(-1, -1);
                if ((eInimigo(square.getPiece())))
                    movimentos.add(square);
                square = s.vizinho(-1, 1);
                if ((eInimigo(square.getPiece())))
                    movimentos.add(square);
            }
            if (cor == true ){
                Square square = s.vizinho(1, 0);
                if (square.getPiece() == null) {
                    movimentos.add(square);
                    if (moved == false){
                        square = s.vizinho(2,0);
                        if (square.getPiece() == null) {
                            movimentos.add(square);
                        }
                    }
                }
                square = s.vizinho(1, -1);
                if ((eInimigo(square.getPiece())))
                    movimentos.add(square);
                square = s.vizinho(1, 1);
                if ((eInimigo(square.getPiece())))
                    movimentos.add(square);
            }
            return movimentos;
        }
}