package DataAccess;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.TextArea;
import javax.swing.JTable;
import java.awt.Label;
import javax.swing.JTextPane;
import java.awt.Choice;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;

public class OrderBasketForm {

	JFrame frame;
	private List<Products> products;
	private Label basketLabel = new Label("Basket");
	private JTextPane descriptionOutput = new JTextPane();
	private Label descriptionLabel = new Label("Description");
	private Label productNameLabel = new Label("Product Name");
	private Label rrpLabel = new Label("RRP");
	private Label label_4 = new Label("New label");
	private JSpinner quantitySpinner = new JSpinner();
	private Label quantityLabel = new Label("Quantity");
	private JSpinner lengthSpinner = new JSpinner();
	private Label lengthLabel = new Label("Length");
	private Label colourLabel = new Label("Colour");
	private Label numberOfProductsLabel = new Label("No Products :");
	private Label numberOfItemsLabel = new Label("No Items :");
	private Label totalLabel = new Label("Total :");
	private Label discountedLabel = new Label("Discounted Total :");
	private JButton addButton = new JButton("Add");
	private JButton removeButton = new JButton("Remove");
	private JButton exitButton = new JButton("Exit");
	private JButton clearBasketButton = new JButton("Clear Basket");
	private JButton cancelButton = new JButton("Cancel");
	private JButton checkoutButton = new JButton("Check Out");
	private JTextField discountedOutput = new JTextField();
	private JTextField totalOutput = new JTextField();
	private JTextField numberOfItemsOutput = new JTextField();
	private JTextField numberOfProductsOutput = new JTextField();
	private JTextField rrpOutput = new JTextField();
	private JTable basketOutputTable = new JTable();
	private JComboBox colourCombo = new JComboBox();
	private JComboBox<Products> productNameCombo = new JComboBox();

	public OrderBasketForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1280, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		basketOutputTable.setBounds(60, 330, 1000, 350);
		frame.getContentPane().add(basketOutputTable);
		
		basketLabel.setBounds(60, 300, 70, 24);
		frame.getContentPane().add(basketLabel);
		
		descriptionOutput.setBounds(60, 174, 1000, 90);
		frame.getContentPane().add(descriptionOutput);
		
		descriptionLabel.setBounds(60, 144, 70, 24);
		frame.getContentPane().add(descriptionLabel);
		
		productNameLabel.setBounds(60, 59, 174, 24);
		frame.getContentPane().add(productNameLabel);
		
		rrpOutput.setBounds(240, 89, 116, 22);
		frame.getContentPane().add(rrpOutput);
		rrpOutput.setColumns(10);
		
		rrpLabel.setBounds(240, 59, 116, 24);
		frame.getContentPane().add(rrpLabel);
		
		label_4.setBounds(362, 87, 70, 24);
		frame.getContentPane().add(label_4);
		
		quantitySpinner.setBounds(577, 89, 150, 22);
		frame.getContentPane().add(quantitySpinner);
		
		quantityLabel.setBounds(577, 59, 150, 24);
		frame.getContentPane().add(quantityLabel);
		
		lengthSpinner.setBounds(739, 89, 129, 22);
		frame.getContentPane().add(lengthSpinner);
		
		colourCombo.setBounds(880, 89, 180, 22);
		frame.getContentPane().add(colourCombo);
		
		lengthLabel.setBounds(739, 59, 129, 24);
		frame.getContentPane().add(lengthLabel);
		
		colourLabel.setBounds(880, 59, 70, 24);
		frame.getContentPane().add(colourLabel);
		
		numberOfProductsLabel.setBounds(60, 706, 103, 24);
		frame.getContentPane().add(numberOfProductsLabel);
		
		numberOfProductsOutput.setBounds(169, 708, 150, 22);
		frame.getContentPane().add(numberOfProductsOutput);
		numberOfProductsOutput.setColumns(10);
		
		numberOfItemsLabel.setBounds(340, 706, 70, 24);
		frame.getContentPane().add(numberOfItemsLabel);
		
		numberOfItemsOutput.setBounds(416, 708, 150, 22);
		frame.getContentPane().add(numberOfItemsOutput);
		numberOfItemsOutput.setColumns(10);
		
		totalLabel.setBounds(588, 706, 50, 24);
		frame.getContentPane().add(totalLabel);
		
		totalOutput.setBounds(644, 708, 116, 22);
		frame.getContentPane().add(totalOutput);
		totalOutput.setColumns(10);
		
		discountedLabel.setBounds(789, 706, 109, 24);
		frame.getContentPane().add(discountedLabel);
		
		discountedOutput.setBounds(915, 708, 145, 22);
		frame.getContentPane().add(discountedOutput);
		discountedOutput.setColumns(10);
		
		addButton.setBounds(1072, 174, 138, 90);
		frame.getContentPane().add(addButton);
		
		removeButton.setBounds(1072, 330, 138, 24);
		frame.getContentPane().add(removeButton);
		
		exitButton.setBounds(1072, 706, 138, 25);
		frame.getContentPane().add(exitButton);
		
		clearBasketButton.setBounds(1072, 367, 138, 25);
		frame.getContentPane().add(clearBasketButton);
		
		cancelButton.setBounds(1072, 655, 138, 25);
		frame.getContentPane().add(cancelButton);
		
		checkoutButton.setBounds(1072, 586, 138, 56);
		frame.getContentPane().add(checkoutButton);
		
		productNameCombo.setBounds(60, 89, 168, 22);
		frame.getContentPane().add(productNameCombo);
		
		try 
		{
			
			products = Program.listProducts();
			System.out.println("carrot");
			for (Products product : Program.listProducts())
			{
				System.out.println("banana");
				DisplayProductDetails(product);
			}
		} 
		catch (Exception exception)
		{
			System.out.println(exception.getMessage());
		}
		
	}
	public void DisplayProductDetails(Products product)
	{
		System.out.println("potato");
		System.out.println(product.getProductName());
			productNameCombo.addItem(product);
	}
}
