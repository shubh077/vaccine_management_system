package com.vms.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.Label;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class HomePage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 255));
		contentPane.setBorder(new LineBorder(Color.RED, 3));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 423, 37);
		panel.setBackground(Color.PINK);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Welcome to Vaccination ");
		lblNewLabel.setForeground(SystemColor.inactiveCaptionText);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("SIGN UP");
		btnNewButton_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.BLACK));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnNewButton_1.setBounds(25, 321, 151, 52);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setForeground(SystemColor.inactiveCaptionText);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Registration r= new Registration();
			r.setVisible(true);
			setVisible(false);
			
			}
		});
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("LOG IN");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnNewButton.setBounds(217, 321, 151, 52);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(SystemColor.inactiveCaptionText);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogIn In=new LogIn();
				In.setVisible(true);
				setVisible(false);
				
			}
		});
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Shubham\\Pictures\\images.png"));
		lblNewLabel_1.setBounds(94, 72, 193, 165);
		contentPane.add(lblNewLabel_1);
	}
}
