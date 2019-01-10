import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class beginnerframe extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton button;
	private JButton button_1;
	private JButton btnInput;
	private JButton button_2;
	private JButton button_3;
	private JLabel lblOutput;
	private JTextField textField;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JLabel lblInput;
	private JLabel lblInput_2;
	private JLabel lblInput_1;
	int j;
	int i;
	int l;
	private JButton button_4;
	private JButton button_5;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					beginnerframe frame = new beginnerframe();
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
	public beginnerframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblBeginner = new JLabel("Beginner");
		
		btnNewButton = new JButton("NOT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				j=comboBox.getSelectedIndex();
				if(j==0)
					textField.setText(String.valueOf(1));
				else if(j==1)
					textField.setText(String.valueOf(0));
			}
		});
		
		button = new JButton("OR2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				j=comboBox.getSelectedIndex();
				i=comboBox_1.getSelectedIndex();
				if(i==0&&j==0)
					textField.setText(String.valueOf(0));
				else if(i==0&&j==1)
					textField.setText(String.valueOf(1));
				else if(i==1&&j==0)
					textField.setText(String.valueOf(1));
				else if(i==1&&j==1)
					textField.setText(String.valueOf(1));
			}
		});
		
		button_1 = new JButton("AND2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				j=comboBox.getSelectedIndex();
				i=comboBox_1.getSelectedIndex();
				
				if(i==1&&j==1)
					textField.setText(String.valueOf(1));
				else if(i==0&&j==1)
					textField.setText(String.valueOf(0));
				else if(i==1&&j==0)
					textField.setText(String.valueOf(0));
				else if(i==0&&j==0)
					textField.setText(String.valueOf(0));
				
			}
		});
		
		btnInput = new JButton("1 Input");
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox.setVisible(true);
				lblInput.setVisible(true);
				comboBox_1.setVisible(false);
				comboBox_2.setVisible(false);
				lblInput_2.setVisible(false);
				lblInput_1.setVisible(false);
				btnNewButton.setEnabled(true);
				button.setEnabled(false);
				button_1.setEnabled(false);
				button_4.setEnabled(false);
				button_5.setEnabled(false);
				
			}
		});
		
		button_2 = new JButton("2 Inputs");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.setVisible(true);
				comboBox_1.setVisible(true);
				comboBox_2.setVisible(false);
				lblInput.setVisible(true);
				lblInput_1.setVisible(true);
				lblInput_2.setVisible(false);
				btnNewButton.setEnabled(false);
				button.setEnabled(true);
				button_1.setEnabled(true);
				button_4.setEnabled(false);
				button_5.setEnabled(false);
			}
		});
		
		button_3 = new JButton("3 Inputs");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox.setVisible(true);
				comboBox_1.setVisible(true);
				comboBox_2.setVisible(true);
				lblInput.setVisible(true);
				lblInput_1.setVisible(true);
				lblInput_2.setVisible(true);
				btnNewButton.setEnabled(false);
				button.setEnabled(false);
				button_1.setEnabled(false);
				button_4.setEnabled(true);
				button_5.setEnabled(true);
				
			}
		});
		
		lblOutput = new JLabel("Output");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"0", "1"}));
		comboBox.setVisible(false);
		
		lblInput = new JLabel("Input 1");
		lblInput.setVisible(false);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"0", "1"}));
		comboBox_1.setVisible(false);
	
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"0", "1"}));
		comboBox_2.setVisible(false);
		
		lblInput_1 = new JLabel("Input 2");
		lblInput_1.setVisible(false);
		
		lblInput_2 = new JLabel("Input 3");
		lblInput_2.setVisible(false);
		
		button_4 = new JButton("OR3");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				j=comboBox.getSelectedIndex();
				i=comboBox_1.getSelectedIndex();
				l=comboBox_2.getSelectedIndex();
				
				if(i==0&&j==0&&l==0)
					textField.setText(String.valueOf(0));
				else if(i==0&&j==0&&l==1)
					textField.setText(String.valueOf(1));
				else if(i==0&&j==1&&l==0)
					textField.setText(String.valueOf(1));
				else if(i==0&&j==1&&l==1)
					textField.setText(String.valueOf(1));
				else if(i==1&&j==0&&l==0)
					textField.setText(String.valueOf(1));
				else if(i==1&&j==0&&l==1)
					textField.setText(String.valueOf(1));
				else if(i==1&&j==1&&l==0)
					textField.setText(String.valueOf(1));
				else if(i==1&&j==1&&l==1)
					textField.setText(String.valueOf(1));
			}
		});
		
		button_5 = new JButton("AND3");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				j=comboBox.getSelectedIndex();
				i=comboBox_1.getSelectedIndex();
				l=comboBox_2.getSelectedIndex();
				
				if(i==0&&j==0&&l==0)
					textField.setText(String.valueOf(0));
				else if(i==0&&j==0&&l==1)
					textField.setText(String.valueOf(0));
				else if(i==0&&j==1&&l==0)
					textField.setText(String.valueOf(0));
				else if(i==0&&j==1&&l==1)
					textField.setText(String.valueOf(0));
				else if(i==1&&j==0&&l==0)
					textField.setText(String.valueOf(0));
				else if(i==1&&j==0&&l==1)
					textField.setText(String.valueOf(0));
				else if(i==1&&j==1&&l==0)
					textField.setText(String.valueOf(0));
				else if(i==1&&j==1&&l==1)
					textField.setText(String.valueOf(1));

				
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(177)
					.addComponent(lblBeginner)
					.addPreferredGap(ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(lblOutput)
					.addGap(50))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(53)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(12)
							.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
						.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 3, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
							.addComponent(btnInput, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
							.addGap(71))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(112)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(comboBox_1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(comboBox_2, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(comboBox, Alignment.LEADING, 0, 105, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblInput_1)
								.addComponent(lblInput)
								.addComponent(lblInput_2))
							.addGap(270))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(26)
							.addComponent(lblBeginner)
							.addGap(54)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblInput)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(26)
									.addComponent(lblOutput))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(29)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(86)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(button_2)
										.addComponent(btnInput)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(87)
									.addComponent(button_3)))
							.addGap(64)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblInput_1)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
									.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblInput_2)
								.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(47)
							.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)))
					.addGap(45))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
