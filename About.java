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

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JDialog;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class About extends JDialog {
	
	private static final String StrNameOne = "Gustavo Garcia Gava";
	private static final String StrNameTwo = "Leandro Perin de Oliveira";
	private static final String StrNameThree = "Marcos Schead dos Santos";
	private static final String StrInfo = "Trabalho Final da disciplina de Programação Orientada à Objetos II";
	private static final String StrCopyright = "(C)2014";
	private static final String StrTitle = "Sobre Nós - Chess Game";

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblInfo;
	private JLabel lblInfo_1;
	private Font NameFont = new Font("Tahoma",Font.BOLD, 14);

	public About() {
		initialize();		
		initComponents();
	}
	
	private void initialize() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		setAlwaysOnTop(true);
		setResizable(false);
		setType(Type.UTILITY);
		setTitle(StrTitle);
		setBounds(100, 100, 502, 363);
		setContentPane(contentPane);
	}
	
	private void initComponents() {
		lblInfo = new JLabel(StrNameOne);
		lblInfo.setFont(NameFont);
		lblInfo.setBounds(10, 10, 200, 50);
		contentPane.add(lblInfo);
		
		lblInfo = new JLabel(StrNameTwo);
		lblInfo.setFont(NameFont);
		lblInfo.setBounds(10, 48, 200, 50);
		contentPane.add(lblInfo);
		
		lblInfo = new JLabel(StrNameThree);
		lblInfo.setFont(NameFont);
		lblInfo.setBounds(10, 86, 200, 50);
		contentPane.add(lblInfo);
		
		lblInfo = new JLabel(StrInfo);
		lblInfo.setBounds(10, 257, 477, 50);
		contentPane.add(lblInfo);
		
		lblInfo = new JLabel(StrCopyright);
		lblInfo.setBounds(10, 286, 200, 37);
		contentPane.add(lblInfo);
		
		lblInfo_1 = new JLabel("");
		lblInfo_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblInfo_1.setIcon(new ImageIcon("resources/Chess.png"));
		lblInfo_1.setFont(new Font("Purisa", Font.BOLD, 30));
		lblInfo_1.setBounds(198, 10, 289, 265);
		contentPane.add(lblInfo_1);
	}
}
