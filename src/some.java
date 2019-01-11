import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.DefaultComboBoxModel;

public class some extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton button_5;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JButton btnNewButton_1;
	private JButton button_6;
	private JLabel lblInput;
	private JLabel lblInput_1;
	private JLabel lblInput_2;
	private JLabel lblExpert;
	int i;
	int j;
	int l;
	private JButton button_3;
	private JButton button_4;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					some frame = new some();
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
	public some() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("NOT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				j=comboBox.getSelectedIndex();
				if(j==0)
					textField.setText(String.valueOf(1));
				else if(j==1)
					textField.setText(String.valueOf(0));
			}
		});
		
		JButton button = new JButton("OR2");
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
		
		JButton button_1 = new JButton("AND2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				j=comboBox.getSelectedIndex();
				i=comboBox_1.getSelectedIndex();
				
				if(i==0&&j==0)
					textField.setText(String.valueOf(0));
				else if(i==0&&j==1)
					textField.setText(String.valueOf(0));
				else if(i==1&&j==0)
					textField.setText(String.valueOf(0));
				else if(i==1&&j==1)
					textField.setText(String.valueOf(1));
				
			}
		});
		
		JButton button_2 = new JButton("NAND2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				j=comboBox.getSelectedIndex();
				i=comboBox_1.getSelectedIndex();
				
				if(i==0&&j==0)
					textField.setText(String.valueOf(1));
				else if(i==0&&j==1)
					textField.setText(String.valueOf(1));
				else if(i==1&&j==0)
					textField.setText(String.valueOf(1));
				else if(i==1&&j==1)
					textField.setText(String.valueOf(0));
				
			}
		});
		
		button_3 = new JButton("NOR2");

		
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				j=comboBox.getSelectedIndex();
				i=comboBox_1.getSelectedIndex();
					if(i==0&&j==0)
						textField.setText(String.valueOf(1));
					else if(i==0&&j==1)
						textField.setText(String.valueOf(0));
					else if(i==1&&j==0)
						textField.setText(String.valueOf(0));
					else if(i==1&&j==1)
						textField.setText(String.valueOf(0));
					
			}
		});
		
		button_4 = new JButton("XOR2");
		
		button_4.addActionListener(new ActionListener() {
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
						textField.setText(String.valueOf(0));
					
			}
		});
		
		btnNewButton_1 = new JButton("3 Inputs");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.setVisible(true);
				comboBox_1.setVisible(true);
				comboBox_2.setVisible(true);
				lblInput.setVisible(true);
				lblInput_1.setVisible(true);
				lblInput_2.setVisible(true);
				btnNewButton.setEnabled(false);
				button.setEnabled(false);
				button_2.setEnabled(false);
				button_1.setEnabled(false);
				button_3.setEnabled(false);
				button_4.setEnabled(false);
				button_7.setEnabled(true);
				button_8.setEnabled(true);
				button_9.setEnabled(true);
				button_10.setEnabled(true);
				button_11.setEnabled(true);
			
			}
		});
		
		button_5 = new JButton("1 Input");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.setVisible(true);
				comboBox_1.setVisible(false);
				comboBox_2.setVisible(false);
				lblInput.setVisible(true);
				lblInput_1.setVisible(false);
				lblInput_2.setVisible(false);
				btnNewButton.setEnabled(true);
				button.setEnabled(false);
				button_2.setEnabled(false);
				button_1.setEnabled(false);
				button_3.setEnabled(false);
				button_4.setEnabled(false);
				button_7.setEnabled(false);
				button_8.setEnabled(false);
				button_9.setEnabled(false);
				button_10.setEnabled(false);
				button_11.setEnabled(false);
				
				}
		});
		
		button_6 = new JButton("2 Inputs");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				comboBox.setVisible(true);
				comboBox_1.setVisible(true);
				comboBox_2.setVisible(false);
				lblInput.setVisible(true);
				lblInput_1.setVisible(true);
				lblInput_2.setVisible(false);
				btnNewButton.setEnabled(false);
				button.setEnabled(true);
				button_2.setEnabled(true);
				button_1.setEnabled(true);
				button_3.setEnabled(true);
				button_4.setEnabled(true);
				button_7.setEnabled(false);
				button_8.setEnabled(false);
				button_9.setEnabled(false);
				button_10.setEnabled(false);
				button_11.setEnabled(false);
			}
		});
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblOutput = new JLabel("Output");
		
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
		
		lblExpert = new JLabel("Expert");
		
		button_7 = new JButton("OR3");
		button_7.addActionListener(new ActionListener() {
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
		
		button_8 = new JButton("AND3");
		button_8.addActionListener(new ActionListener() {
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
		
		button_9 = new JButton("NAND3");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				j=comboBox.getSelectedIndex();
				i=comboBox_1.getSelectedIndex();
				l=comboBox_2.getSelectedIndex();
				if(i==0&&j==0&&l==0)
					textField.setText(String.valueOf(1));
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
					textField.setText(String.valueOf(0));
			}
		});
		
		button_10 = new JButton("NOR3");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				j=comboBox.getSelectedIndex();
				i=comboBox_1.getSelectedIndex();
				l=comboBox_2.getSelectedIndex();
				if(i==0&&j==0&&l==0)
					textField.setText(String.valueOf(1));
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
					textField.setText(String.valueOf(0));
			}
		});
		
		button_11 = new JButton("XOR3");
		button_11.addActionListener(new ActionListener() {
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
					textField.setText(String.valueOf(0));
				else if(i==1&&j==0&&l==0)
					textField.setText(String.valueOf(1));
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
					.addGap(20)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(button_11, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
									.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED, 677, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(lblInput)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
											.addComponent(lblInput_2)
											.addComponent(lblInput_1))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
											.addComponent(comboBox_2, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(comboBox_1, 0, 109, Short.MAX_VALUE))))
								.addGap(339))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(button, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
									.addComponent(button_10, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
								.addGap(41)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.RELATED, 270, Short.MAX_VALUE)
										.addComponent(lblOutput)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(564)
										.addComponent(lblExpert)
										.addGap(130)
										.addComponent(button_5)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(button_6)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnNewButton_1)))
								.addGap(127))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(button_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(button_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(button_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
								.addContainerGap()))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnNewButton_1)
							.addComponent(button_6)
							.addComponent(button_5))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnNewButton)
							.addComponent(lblExpert)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(29)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblInput, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblInput_1))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblInput_2))
							.addGap(4)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblOutput)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_10, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_11, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)))
					.addGap(268))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
