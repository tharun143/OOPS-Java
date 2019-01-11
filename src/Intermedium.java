import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Intermedium extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblInput;
	private JLabel lblInput_2;
	private JLabel lblInput_1;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox;
	private JButton button_6;
	private JButton btnInput;
	private JButton button_5;
	int i;
	int j;
	int l;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Intermedium frame = new Intermedium();
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
	public Intermedium() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton button = new JButton("NOT");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				j=comboBox.getSelectedIndex();
				if(j==0)
					textField.setText(String.valueOf(1));
				else if(j==1)
					textField.setText(String.valueOf(0));
			}
		});
		
		JButton button_1 = new JButton("OR2");
		button_1.addActionListener(new ActionListener() {
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
		
		
		JButton button_2 = new JButton("AND2");
		button_2.addActionListener(new ActionListener() {
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
		
		JButton button_3 = new JButton("NOR2");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		
		JButton button_4 = new JButton("NAND2");
		button_4.addActionListener(new ActionListener() {
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
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblOutput = new JLabel("Output");
		
		button_5 = new JButton("1 Input");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox.setVisible(true);
				comboBox_1.setVisible(false);
				comboBox_2.setVisible(false);
				lblInput.setVisible(true);
				lblInput_1.setVisible(false);
				lblInput_2.setVisible(false);
				button.setEnabled(true);
				button_1.setEnabled(false);
				button_2.setEnabled(false);
				button_3.setEnabled(false);
				button_4.setEnabled(false);
				button_7.setEnabled(false);
				button_8.setEnabled(false);
				button_9.setEnabled(false);
				button_10.setEnabled(false);
				
			}
		});
		
		
		
		button_6 = new JButton("3 Inputs");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox.setVisible(true);
				comboBox_1.setVisible(true);
				comboBox_2.setVisible(true);
				lblInput.setVisible(true);
				lblInput_1.setVisible(true);
				lblInput_2.setVisible(true);
				button.setEnabled(false);
				button_1.setEnabled(false);
				button_2.setEnabled(false);
				button_3.setEnabled(false);
				button_4.setEnabled(false);
				button_7.setEnabled(true);
				button_8.setEnabled(true);
				button_9.setEnabled(true);
				button_10.setEnabled(true);
				
			}
		});
		
		btnInput = new JButton("2 Inputs");
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox.setVisible(true);
				comboBox_1.setVisible(true);
				comboBox_2.setVisible(false);
				lblInput.setVisible(true);
				lblInput_1.setVisible(false);
				lblInput_2.setVisible(true);
				button.setEnabled(false);
				button_1.setEnabled(true);
				button_2.setEnabled(true);
				button_3.setEnabled(true);
				button_4.setEnabled(true);
				button_7.setEnabled(false);
				button_8.setEnabled(false);
				button_9.setEnabled(false);
				button_10.setEnabled(false);
				
			}
		});
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"0", "1"}));
		comboBox.setVisible(false);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"0", "1"}));
		comboBox_1.setVisible(false);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"0", "1"}));
		comboBox_2.setVisible(false);
		
		JLabel lblIntermediate = new JLabel("Intermediate");
		
		lblInput = new JLabel("Input 1");
		lblInput.setVisible(false);
		
		lblInput_1 = new JLabel("Input 3");
		lblInput_1.setVisible(false);
		
		lblInput_2 = new JLabel("Input 2");
		lblInput_2.setVisible(false);
		
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
		
		button_9 = new JButton("NOR3");
		button_9.addActionListener(new ActionListener() {
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
		
		button_10 = new JButton("NAND3");
		button_10.addActionListener(new ActionListener() {
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
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addContainerGap()
									.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addContainerGap()
									.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addContainerGap()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(button_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(button_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addContainerGap()
									.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addContainerGap()
									.addComponent(button_10, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
									.addGap(6))
								.addComponent(lblIntermediate)
								.addComponent(comboBox, 0, 105, Short.MAX_VALUE)
								.addComponent(comboBox_1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(comboBox_2, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(12))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(button_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(button, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnInput)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblOutput)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(button_6)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(12)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblInput_1)
								.addComponent(lblInput_2)
								.addComponent(lblInput, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))))
					.addGap(37))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(587, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblIntermediate)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(button)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_7)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_8)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_3)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_4)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_9)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_10))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(23)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblOutput))
							.addGap(67)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(button_5)
								.addComponent(btnInput)
								.addComponent(button_6))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblInput)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblInput_2)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblInput_1))))
					.addContainerGap(55, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
