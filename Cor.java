/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chessgame;

/**
 *
 * @author Gustavo Gava
 */
public enum Cor {

    BRANCO(1),
    PRETO(2);
   
    private int cor;
    private Cor(int codigo) {
        this.cor = codigo;
    }
    
    public int getCor () {
        return cor;
    }
}
