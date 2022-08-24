package com.vms.service;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.panel.dash.PanelHome;
import com.panel.dash.PanelShedule;
import com.panel.dash.PanelView;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class Dashboard extends JFrame {

	private JPanel contentPane;
	
	private PanelHome panelhome;
	private PanelShedule panelshedule;
	private PanelView panelview;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
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
	public Dashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1081, 733);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelhome = new PanelHome();
		panelhome.setBackground(new Color(0, 0, 0));
		panelhome.setBounds(0, 0, 826, 733);
		panelshedule = new PanelShedule();
		panelview = new PanelView();
		//Image img2 = new ImageIcon(this.getClass().getResource("/corona.png")).getImage();
		
		JPanel panelmain = new JPanel();
		panelmain.setBounds(255, 0, 826, 733);
		contentPane.add(panelmain);
		
		panelmain.add(panelhome);
		panelmain.add(panelshedule);
		panelmain.add(panelview);
		panelmain.setLayout(null);
		
		menuClicked(panelhome);
		panelhome.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Shubham\\Pictures\\GettyImages-1248797862-2048x1422.jpg"));
		lblNewLabel_1.setBounds(10, 0, 816, 733);
		panelhome.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(0, 0, 260, 733);
		contentPane.add(panel);
		panel.setBackground(new Color(0, 204, 204));
		panel.setLayout(null);
		//Image img1 = new ImageIcon(this.getClass().getResource("/logo4.png")).getImage();


		
		JPanel paneview = new JPanel();
		paneview.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		paneview.addMouseListener(new PanelButtonMouseAdapter(paneview) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelview);
			}
		});
		paneview.setBackground(new Color(128, 128, 128));
		paneview.setBounds(0, 420, 256, 56);
		panel.add(paneview);
		paneview.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("View Appointment");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.BOLD, 22));
		lblNewLabel_1_2.setBounds(30, 11, 189, 34);
		paneview.add(lblNewLabel_1_2);
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogIn ln=new LogIn();
				ln.setVisible(true);
				setVisible(false);
				////System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton.setBounds(0, 475, 256, 56);
		panel.add(btnNewButton);
		
		JButton btnHome = new JButton("Home");
		btnHome.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		btnHome.setBackground(Color.GRAY);
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage hp= new HomePage();
				hp.setVisible(true);
				setVisible(false);
				
			}
		});
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnHome.setBounds(0, 303, 256, 62);
		panel.add(btnHome);
		
		JPanel paneshedule = new JPanel();
		paneshedule.addMouseListener(new PanelButtonMouseAdapter(paneshedule) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelshedule);
			}
		});
		paneshedule.setLayout(null);
		paneshedule.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		paneshedule.setBackground(Color.GRAY);
		paneshedule.setBounds(0, 364, 256, 56);
		panel.add(paneshedule);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("View Shedule");
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setFont(new Font("Dialog", Font.BOLD, 22));
		lblNewLabel_1_2_1.setBounds(42, 11, 175, 34);
		paneshedule.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Shubham\\Pictures\\00.jpg"));
		lblNewLabel.setBounds(0, 0, 260, 304);
		panel.add(lblNewLabel);
		setUndecorated(true);
	}
	public void menuClicked(JPanel panel) {
		panelhome.setVisible(false);
		panelshedule.setVisible(false);
		panelview.setVisible(false);
		
		panel.setVisible(true);
	}
	private class PanelButtonMouseAdapter extends MouseAdapter{
		JPanel panel;
		public PanelButtonMouseAdapter(JPanel panel) {
			this.panel = panel;
		}
		public void mouseEntered(MouseEvent e) {
			panel.setBackground(new Color(112, 128, 144));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(95, 158, 160));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			panel.setBackground(new Color(95, 158, 160));
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			panel.setBackground(new Color(112, 128, 144));
		}
	}
	public Boolean SelectStatement(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}
}
