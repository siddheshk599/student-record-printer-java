package PrintStudent;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.awt.event.ActionEvent;

public class PrintStudentRec {
	private JFrame frame;
	private JTextField txtPRN;
	private JTextField txtCourseCode;
	private JTextField txtCourseTitle;
	private JTextField txtResult;
	private JTextField txtGPA;
	private JTextField txtRollNo;
	private JTextField txtName;
	private JTextField txtAddress;
	private JTextField txtTelephone;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrintStudentRec window = new PrintStudentRec();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PrintStudentRec() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1409, 808);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 12));
		panel.setBounds(29, 22, 1305, 102);
		frame.getContentPane().add(panel);
		JLabel lblTitle = new JLabel("Student Records Printer");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 61));
		panel.add(lblTitle);
		final JTextArea txtReceipt = new JTextArea();
		txtReceipt.setFont(new Font("Monospaced", Font.BOLD, 14));
		txtReceipt.setBounds(529, 135, 805, 465);
		txtReceipt.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		frame.getContentPane().add(txtReceipt);
		JLabel lblPRN = new JLabel("PRN:");
		lblPRN.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblPRN.setBounds(44, 140, 216, 42);
		frame.getContentPane().add(lblPRN);
		JLabel lblCourseCode = new JLabel("Course Code:");
		lblCourseCode.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblCourseCode.setBounds(44, 195, 216, 42);
		frame.getContentPane().add(lblCourseCode);
		JLabel lblCourseTitle = new JLabel("Course Title:");
		lblCourseTitle.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblCourseTitle.setBounds(44, 248, 216, 42);
		frame.getContentPane().add(lblCourseTitle);
		JLabel lblResult = new JLabel("Result:");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblResult.setBounds(44, 304, 216, 42);
		frame.getContentPane().add(lblResult);
		JLabel lblGPA = new JLabel("GPA:");
		lblGPA.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblGPA.setBounds(44, 357, 216, 42);
		frame.getContentPane().add(lblGPA);
		JLabel lblRollNo = new JLabel("Student's Roll No.:");
		lblRollNo.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblRollNo.setBounds(44, 410, 216, 42);
		frame.getContentPane().add(lblRollNo);
		JLabel lblName = new JLabel("Student's Name:");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblName.setBounds(44, 463, 216, 40);
		frame.getContentPane().add(lblName);
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblAddress.setBounds(44, 514, 216, 40);
		frame.getContentPane().add(lblAddress);
		JLabel lblTelephone = new JLabel("Telephone:");
		lblTelephone.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblTelephone.setBounds(44, 558, 216, 42);
		frame.getContentPane().add(lblTelephone);
		txtPRN = new JTextField();
		txtPRN.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtPRN.setBounds(307, 145, 170, 32);
		txtPRN.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		frame.getContentPane().add(txtPRN);
		txtPRN.setColumns(10);
		txtCourseCode = new JTextField();
		txtCourseCode.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtCourseCode.setColumns(10);
		txtCourseCode.setBounds(307, 200, 170, 32);
		txtCourseCode.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		frame.getContentPane().add(txtCourseCode);
		txtCourseTitle = new JTextField();
		txtCourseTitle.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtCourseTitle.setColumns(10);
		txtCourseTitle.setBounds(307, 253, 170, 32);
		txtCourseTitle.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		frame.getContentPane().add(txtCourseTitle);
		txtResult = new JTextField();
		txtResult.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtResult.setColumns(10);
		txtResult.setBounds(307, 309, 170, 32);
		txtResult.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		frame.getContentPane().add(txtResult);
		txtGPA = new JTextField();
		txtGPA.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtGPA.setColumns(10);
		txtGPA.setBounds(307, 362, 170, 32);
		txtGPA.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		frame.getContentPane().add(txtGPA);
		txtRollNo = new JTextField();
		txtRollNo.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtRollNo.setColumns(10);
		txtRollNo.setBounds(307, 415, 170, 32);
		txtRollNo.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		frame.getContentPane().add(txtRollNo);
		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtName.setColumns(10);
		txtName.setBounds(307, 467, 170, 32);
		txtName.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		frame.getContentPane().add(txtName);
		txtAddress = new JTextField();
		txtAddress.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtAddress.setColumns(10);
		txtAddress.setBounds(307, 518, 170, 32);
		txtAddress.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		frame.getContentPane().add(txtAddress);
		txtTelephone = new JTextField();
		txtTelephone.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtTelephone.setColumns(10);
		txtTelephone.setBounds(307, 570, 170, 32);
		txtTelephone.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		frame.getContentPane().add(txtTelephone);
		JButton btnAddRecord = new JButton("Add Record");
		btnAddRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtReceipt.setText(null);
				txtReceipt.append("\t J.E.S's ACPCE, Kharghar \n\n" + "PRN: \t\t\t\t\t" + txtPRN.getText()
						+ "\n=============================================================================\n"
						+ "Course Code: \t\t\t\t" + txtCourseCode.getText() + "\n\n" + "Course Title: \t\t\t\t"
						+ txtCourseTitle.getText() + "\n\n" + "Result: \t\t\t\t" + txtResult.getText() + "\n\n"
						+ "GPA: \t\t\t\t\t" + txtGPA.getText() + "\n\n" + "Student's Roll No.: \t\t\t"
						+ txtRollNo.getText() + "\n\n" + "Student's Name: \t\t\t" + txtName.getText() + "\n\n"
						+ "Address: \t\t\t\t" + txtAddress.getText() + "\n\n" + "Telephone: \t\t\t\t"
						+ txtTelephone.getText() + "\n\n");
			}
		});
		btnAddRecord.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnAddRecord.setBounds(88, 626, 226, 74);
		frame.getContentPane().add(btnAddRecord);
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					txtReceipt.print();
				} catch (PrinterException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnPrint.setBounds(402, 626, 226, 74);
		frame.getContentPane().add(btnPrint);
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPRN.setText(null);
				txtResult.setText(null);
				txtGPA.setText(null);
				txtRollNo.setText(null);
				txtName.setText(null);
				txtAddress.setText(null);
				txtTelephone.setText(null);
				txtCourseCode.setText(null);
				txtCourseTitle.setText(null);
				txtReceipt.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnClear.setBounds(716, 626, 226, 74);
		frame.getContentPane().add(btnClear);
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Do you really want to exit?", "Print System",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnExit.setBounds(1030, 626, 226, 74);
		frame.getContentPane().add(btnExit);
	}
}