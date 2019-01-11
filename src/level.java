import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class level extends JFrame {

	private JPanel contentPane;
	private JButton btnIntermediate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					level frame = new level();
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
	public level() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblChooseALevel = new JLabel("Choose a level");
		
		JButton btnBeginner = new JButton("Beginner");
		btnBeginner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				beginnerframe p = new beginnerframe();
				p.setVisible(true);
				
			}
		});
		
		btnIntermediate = new JButton("Intermediate");
		btnIntermediate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Intermedium m = new Intermedium();
				m.setVisible(true);
				
			}
		});
		
		JButton btnExpert = new JButton("Expert");
		btnExpert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				some s = new some();
				s.setVisible(true);
			}
		});
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(167, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblChooseALevel)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnIntermediate, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
								.addComponent(btnBeginner, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnExpert, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(147))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(32)
					.addComponent(lblChooseALevel)
					.addGap(31)
					.addComponent(btnBeginner)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnIntermediate)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnExpert, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(82, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
