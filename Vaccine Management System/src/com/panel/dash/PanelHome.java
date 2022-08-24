package com.panel.dash;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class PanelHome extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelHome() {
		setBounds(0, 0, 826, 733);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("hello");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblNewLabel.setBounds(132, 224, 339, 129);
		add(lblNewLabel);

	}
}
