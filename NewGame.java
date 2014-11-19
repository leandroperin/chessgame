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

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.SystemColor;

public class NewGame extends JDialog {
	
	private static final String StrType = "Escolha o tipo de jogo:";
	private static final String StrTypeOne = "Player vs Computador";
	private static final String StrTypeTwo = "Player vs Player";
	private static final String StrCancel = "Cancelar";
	private static final String StrOK = "Jogar";
	private static final String StrTitle = "Novo Jogo - ChessGame";

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private Game gameFrm;

	public NewGame() {
		initialize();		
		initComponents();
	}
	
	private void initialize() {
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		setTitle(StrTitle);
		setType(Type.UTILITY);
		setResizable(false);
		setAlwaysOnTop(true);
		setBounds(100, 100, 450, 227);
		setContentPane(contentPane);
	}
	
	private void initComponents() {
		JLabel lblInfo = new JLabel(StrType);
		lblInfo.setBounds(12, 12, 281, 15);
		contentPane.add(lblInfo);
		
		final JRadioButton rdBtnSingleplayer = new JRadioButton(StrTypeOne); //final modificado - leandro
		rdBtnSingleplayer.setSelected(true);
		rdBtnSingleplayer.setBounds(12, 66, 216, 23);
		contentPane.add(rdBtnSingleplayer);
		
		JRadioButton rdBtnMultiplayer = new JRadioButton(StrTypeTwo);
		rdBtnMultiplayer.setBounds(12, 94, 149, 23);
		contentPane.add(rdBtnMultiplayer);
		
		ButtonGroup radioGroup = new ButtonGroup();
		radioGroup.add(rdBtnSingleplayer);
		radioGroup.add(rdBtnMultiplayer);

		JButton btnOK = new JButton(StrOK);
		btnOK.setBounds(252, 145, 77, 25);
		contentPane.add(btnOK);
		btnOK.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (rdBtnSingleplayer.isSelected()) {   
					gameFrm = new SingleGame();
				} else {
					gameFrm = new MultiGame();
				}
				gameFrm.setVisible(true);
				setVisible(false);
			}
		});
		btnOK.setActionCommand("OK");
		getRootPane().setDefaultButton(btnOK);
		
		JButton btnCancel = new JButton(StrCancel);
		btnCancel.setBounds(336, 145, 96, 25);
		contentPane.add(btnCancel);
		btnCancel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
		});
		btnCancel.setActionCommand("Cancel");
	}
}
