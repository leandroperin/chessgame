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

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Game extends JFrame {
	
	protected String StrTitle = "";
	protected String StrPlayerTwo = "";
	protected static final String StrNextMove = "Próxima Jogada:";
	protected static final String StrPlayerOne = "Player 1";
	protected static final String StrGiveUp = "Desistir";
	protected static final String StrPlayAgain = "Jogar Novamente";
	
	private Board board;
	private JButton btnGiveUp,btnPlayAgain;
	private JLabel lblPlayer,lblNextMove;
	private JPanel contentPane;
	private static final long serialVersionUID = 1L;
	
	protected Game() {
		initialize();
	}
	
	private void initialize() {
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		contentPane.setLayout(null);
		
		setResizable(false);
		setType(Type.UTILITY);
		setBounds(100,100,1000,600);
	}
	
	protected void initComponents() {
		setTitle(StrTitle);
		
		lblNextMove = new JLabel(StrNextMove);
		lblNextMove.setForeground(new Color(128, 0, 0));
		lblNextMove.setFont(new Font("Source Sans Pro Black", Font.BOLD, 20));
		lblNextMove.setBounds(10, 23, 209, 26);
		contentPane.add(lblNextMove);
		
		lblPlayer = new JLabel(StrPlayerOne);
		lblPlayer.setForeground(new Color(128, 0, 0));
		lblPlayer.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPlayer.setBounds(10, 48, 176, 26);
		contentPane.add(lblPlayer);
		
		board = new Board();
		printBoard();
		
		btnPlayAgain = new JButton(StrPlayAgain);
		btnPlayAgain.setVisible(false);
		btnPlayAgain.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				NewGame newGameFrm = new NewGame();
				newGameFrm.setVisible(true);
				setVisible(false);
			}
		});
		btnPlayAgain.setBounds(10, 537, 140, 23);
		contentPane.add(btnPlayAgain);
		
		btnGiveUp = new JButton(StrGiveUp);
		btnGiveUp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (lblPlayer.getText() == StrPlayerOne) {
					endGame(StrPlayerTwo);
				} else {
					endGame(StrPlayerOne);
				}
			}
		});
		btnGiveUp.setBounds(10, 537, 140, 23);
		contentPane.add(btnGiveUp);
		
		setContentPane(contentPane);
	}
	
	private void endGame(String winner) {
		lblNextMove.setText(winner + " Venceu!");
		lblPlayer.setVisible(false);
		board.setVisible(false);
		btnPlayAgain.setVisible(true);
		btnGiveUp.setVisible(false);
	}
	
	private void printBoard() {
		Square[][] square = board.getBoard();
		
		for (int i=0;i<8;i++) {
			for (int j=0;j<8;j++) {
				contentPane.add(square[i][j]);
                                if (i==4 && j==4)
                                    square[i][j].addPiece(1);
                                    square[1][1].addPiece(2);
			}
		}
	}
	
}
