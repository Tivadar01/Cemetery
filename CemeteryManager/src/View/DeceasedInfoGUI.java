package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

import net.sourceforge.jdatepicker.JDatePanel;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilCalendarModel;
import net.sourceforge.jdatepicker.impl.UtilDateModel;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;


public class DeceasedInfoGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;


	/**
	 * Create the frame.
	 */
	public DeceasedInfoGUI() {
		setTitle("Date Decedat");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 363, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[146px][12px][149px]", "[18px][18px][18px][18px][19px][39px][50px]"));
		
		JLabel lblCnp = new JLabel("CNP: ");
		contentPane.add(lblCnp, "cell 0 0,alignx center,aligny bottom");
		
		JLabel lblNume = new JLabel("Nume:");
		contentPane.add(lblNume, "cell 0 1,alignx center,aligny bottom");
		
		JLabel lblPrenume = new JLabel("Prenume:");
		contentPane.add(lblPrenume, "cell 0 2,alignx center,aligny top");
		
		JLabel lblReligia = new JLabel("Religia:");
		contentPane.add(lblReligia, "cell 0 3,alignx center,aligny top");
		
		JLabel lblTimpulInhumarii = new JLabel("Timpul Inhumarii:");
		contentPane.add(lblTimpulInhumarii, "cell 0 5,alignx right,aligny top");
		
		textField = new JTextField();
		contentPane.add(textField, "cell 2 0,alignx left,growy");
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		contentPane.add(textField_1, "cell 2 1,alignx left,growy");
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		contentPane.add(textField_2, "cell 2 2,alignx left,growy");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		contentPane.add(textField_3, "cell 2 3,alignx left,growy");
			
		UtilDateModel model = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(model);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
		contentPane.add(datePicker, "cell 2 5,grow");
		
		JLabel lblNrMormint = new JLabel("Nr. Mormant");
		contentPane.add(lblNrMormint, "cell 0 4,alignx center,aligny top");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		contentPane.add(textField_4, "cell 2 4,alignx left,growy");
		
		JButton button = new JButton("Salveaza");
		contentPane.add(button, "cell 0 6 3 1,grow");
		
		setVisible(true);
	}
}
