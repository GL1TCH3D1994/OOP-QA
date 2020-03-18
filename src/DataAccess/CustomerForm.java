package DataAccess;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Iterator;
import java.awt.Label;
import java.awt.Button;

public class CustomerForm {

	private JFrame customerFormFrame;
	private Label customerNumberLabel = new Label("Customer number :");
	private Label customerNameLabel = new Label("Customer Name :");
	private Label addressLabel = new Label("Address :");
	private Label postcodeLabel = new Label("Post Code :");
	private Label phoneNumberLabel = new Label("Phone number :");
	private Label emailLabel = new Label("Email address :");
	private Label securityQuestionLabel = new Label("Security question :");
	private Label securityAnswerLabel = new Label("Security answer :");
	private Button takeOrderButton = new Button("Take Order");
	private Label customerNumberOutput = new Label("");
	private Label customerNameOutput = new Label("");
	private Label addressOutput = new Label("");
	private Label postcodeOutput = new Label("");
	private Label phoneNumberOutput = new Label("");
	private Label emailOutput = new Label("");
	private Label securityQuestionOutput = new Label("");
	private Label securityAnswerOutput = new Label("");
	private List customerList = new List();
	private static OrderBasketForm orderBasketWindow = new OrderBasketForm();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() 
			{
				try 
				{
					Program.OpenConnection();
					CustomerForm customerFormWindow = new CustomerForm();
					customerFormWindow.customerFormFrame.setVisible(true);
					orderBasketWindow.frame.setVisible(false);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CustomerForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		customerFormFrame = new JFrame();
		customerFormFrame.setBounds(100, 100, 1280, 800);
		customerFormFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		customerFormFrame.getContentPane().setLayout(null);
				
		customerNumberLabel.setBounds(626, 60, 117, 24);
		customerFormFrame.getContentPane().add(customerNumberLabel);
				
		customerNameLabel.setBounds(626, 90, 117, 24);
		customerFormFrame.getContentPane().add(customerNameLabel);
		
		addressLabel.setBounds(626, 120, 117, 24);
		customerFormFrame.getContentPane().add(addressLabel);
		
		postcodeLabel.setBounds(626, 247, 117, 24);
		customerFormFrame.getContentPane().add(postcodeLabel);
		
		phoneNumberLabel.setBounds(626, 277, 117, 24);
		customerFormFrame.getContentPane().add(phoneNumberLabel);
		
		emailLabel.setBounds(626, 307, 117, 24);
		customerFormFrame.getContentPane().add(emailLabel);
		
		securityQuestionLabel.setBounds(626, 337, 117, 24);
		customerFormFrame.getContentPane().add(securityQuestionLabel);
		
		securityAnswerLabel.setBounds(626, 367, 117, 24);
		customerFormFrame.getContentPane().add(securityAnswerLabel);
		
		takeOrderButton.setBounds(626, 617, 575, 68);
		customerFormFrame.getContentPane().add(takeOrderButton);
		
		customerNumberOutput.setBounds(749, 60, 200, 24);
		customerFormFrame.getContentPane().add(customerNumberOutput);
		
		customerNameOutput.setBounds(749, 90, 200, 24);
		customerFormFrame.getContentPane().add(customerNameOutput);
		
		addressOutput.setBounds(749, 120, 200, 121);
		customerFormFrame.getContentPane().add(addressOutput);
		
		postcodeOutput.setBounds(749, 247, 200, 24);
		customerFormFrame.getContentPane().add(postcodeOutput);
		
		phoneNumberOutput.setBounds(749, 277, 200, 24);
		customerFormFrame.getContentPane().add(phoneNumberOutput);
		
		emailOutput.setBounds(749, 307, 200, 24);
		customerFormFrame.getContentPane().add(emailOutput);
		
		securityQuestionOutput.setBounds(749, 337, 200, 24);
		customerFormFrame.getContentPane().add(securityQuestionOutput);
		
		securityAnswerOutput.setBounds(749, 367, 200, 24);
		customerFormFrame.getContentPane().add(securityAnswerOutput);
		
		customerList.setBounds(60, 60, 350, 625);
		customerFormFrame.getContentPane().add(customerList);
		
		try
		{
			boolean intialise = true;
			
			for (Customers customer : Program.listCustomers())
			{
				if(intialise == true)
				{
					customerList.addItem(customer.getCustomerName());
					DisplayCustomerDetails(customer);
					intialise = false;
				}
				else
				{
					customerList.addItem(customer.getCustomerName());
				}
			}
			
			
				
		}
		catch (Exception exception)
		{
			System.out.println(exception.getMessage());
		}	
		
		customerList.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				Customers customer = Program.GetCustomer(customerList.getSelectedIndex() + 1);

				DisplayCustomerDetails(customer);
			}
		});
		takeOrderButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				customerFormFrame.setVisible(false);
				orderBasketWindow.frame.setVisible(true);
			}
		});
	}
	public void DisplayCustomerDetails(Customers customer)
	{
		customerNameOutput.setText(customer.getCustomerName());
		customerNumberOutput.setText(Integer.toString(customer.getCustomerNumber()));
		addressOutput.setText(customer.getAddressLine1() + "\n" + customer.getAddressLine2() + "\n" +  customer.getAddressLine3());
		postcodeOutput.setText(customer.getPostcode());
		phoneNumberOutput.setText(customer.getPhone());
		emailOutput.setText(customer.getEmail());
		securityQuestionOutput.setText(customer.getSecurityQuestion());
		securityAnswerOutput.setText(customer.getSecurityQuestionAnswer());
	}
}
