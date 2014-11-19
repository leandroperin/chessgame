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

public abstract class Peca {

	abstract void movimentar(int i, int j);
	abstract Collection<Square> movimentoValido(Square s);
	protected int cor;
        public boolean eInimigo (Peca inimigo)
                
        {
           return (this.cor != inimigo.cor);
        }
        
	
}

