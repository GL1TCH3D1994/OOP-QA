package DataAccess;

public class OrderItems {

	private int orderItemNumber;
	private int orderNumber;
	private int productNumber;
	private int purchasePrice; //should be money data type
	private int quantity;
	private int length;
	private int colourID;
	private String applySeasonalDiscount; // change data type to appropriate
	
	public OrderItems() {};
	
	public OrderItems(int orderItemNumber, int orderNumber, int productNumber, int purchasePrice, int quantity,
			int length, int colourID, String ApplySeasonalDiscount) {
		super();
		this.orderItemNumber = orderItemNumber;
		this.orderNumber = orderNumber;
		this.productNumber = productNumber;
		this.purchasePrice = purchasePrice;
		this.quantity = quantity;
		this.length = length;
		this.colourID = colourID;
		this.applySeasonalDiscount = ApplySeasonalDiscount;
	}
	
	public String getApplySeasonalDiscount() {
		return applySeasonalDiscount;
	}

	public void setApplySeasonalDiscount(String applySeasonalDiscount) {
		applySeasonalDiscount = applySeasonalDiscount;
	}

	public int getOrderItemNumber() {
		return orderItemNumber;
	}
	public void setOrderItemNumber(int orderItemNumber) {
		this.orderItemNumber = orderItemNumber;
	}
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public int getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(int productNumber) {
		this.productNumber = productNumber;
	}
	public int getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(int purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getColourID() {
		return colourID;
	}
	public void setColourID(int colourID) {
		this.colourID = colourID;
	}
}
