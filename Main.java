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

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

	private JFrame frmChessgame;
	
	private About aboutFrm = new About();
	private NewGame newGameFrm = new NewGame();
	
	private static final String StrNewGame = "Novo Jogo";
	private static final String StrAbout = "Sobre Nós";
	private static final String StrExit = "Sair";
	private static final String StrTitle = "ChessGame";

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmChessgame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		initialize();
	}

	private void initialize() {
		frmChessgame = new JFrame();
		frmChessgame.setTitle(StrTitle);
		frmChessgame.setResizable(false);
		frmChessgame.getContentPane().setBackground(Color.GRAY);
		frmChessgame.setBounds(100, 100, 708, 466);
		frmChessgame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmChessgame.getContentPane().setLayout(null);
		
		initComponents();
	}
	
	private void initComponents() {
		JLabel lblIcon = new JLabel("");
		lblIcon.setIcon(new ImageIcon("resources/UFSC.png"));
		lblIcon.setBounds(270, 10, 390, 390);
		frmChessgame.getContentPane().add(lblIcon);
		
		JButton btnNewGame = new JButton(StrNewGame);
		btnNewGame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				newGameFrm.setVisible(true);
			}
		});
		btnNewGame.setBounds(10, 11, 200, 50);
		frmChessgame.getContentPane().add(btnNewGame);
		
		JButton btnAbout = new JButton(StrAbout);
		btnAbout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				aboutFrm.setVisible(true);
			}
		});
		btnAbout.setBounds(10, 305, 200, 50);
		frmChessgame.getContentPane().add(btnAbout);
		
		JButton btnExit = new JButton(StrExit);
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(10, 366, 200, 50);
		frmChessgame.getContentPane().add(btnExit);
	}
}