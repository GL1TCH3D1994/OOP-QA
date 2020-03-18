package DataAccess;
import java.util.Date;

public class Orders {

	private int orderNumber;
	private int customerNumber;
	private Date orderDate;
	private int orderTotal; //data type should be money?
	private boolean OrderStatus;
	
	public Orders() {};
	
	public Orders(int orderNumber, int customerNumber, Date orderDate, int orderTotal, boolean orderStatus) {
		super();
		this.orderNumber = orderNumber;
		this.customerNumber = customerNumber;
		this.orderDate = orderDate;
		this.orderTotal = orderTotal;
		OrderStatus = orderStatus;
	}
	
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public int getOrderTotal() {
		return orderTotal;
	}
	public void setOrderTotal(int orderTotal) {
		this.orderTotal = orderTotal;
	}
	public boolean isOrderStatus() {
		return OrderStatus;
	}
	public void setOrderStatus(boolean orderStatus) {
		OrderStatus = orderStatus;
	}
	
}
