package canderson1a1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainForm extends JFrame {

	private JPanel contentPane;
	private JLabel grossPayCalcLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm frame = new MainForm();
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
	public MainForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel grossPayLabel = new JLabel("Gross Pay:");
		grossPayLabel.setBounds(35, 35, 92, 23);
		contentPane.add(grossPayLabel);
		
		JButton calculateButton = new JButton("Calculate");
		calculateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_calculateButton_actionPerformed(arg0);
			}
		});
		calculateButton.setBounds(119, 88, 92, 23);
		contentPane.add(calculateButton);
		
		grossPayCalcLabel = new JLabel("");
		grossPayCalcLabel.setBounds(119, 35, 155, 23);
		contentPane.add(grossPayCalcLabel);
	}
	protected void do_calculateButton_actionPerformed(ActionEvent arg0) {
		int hours = 40;
	    double grossPay, payRate = 25.0;
	      
	    grossPay = hours * payRate;
	      
	    grossPayCalcLabel.setText("Your gross pay is $" + grossPay);
		
	}
}
