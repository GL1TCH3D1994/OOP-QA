package DataAccess;

public class Products{
	
	private int productNumber;
	private String productName;
	private String description;
	private int RRP; //data type should be money
	private char productType;
	
	public Products() {};
	
	public Products(int productNumber, String productName, String description, int rrp, char productType) {
		super();
		this.productNumber = productNumber;
		this.productName = productName;
		this.description = description;
		this.RRP = rrp;
		this.productType = productType;
	}
	
	public int getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(int productNumber) {
		this.productNumber = productNumber;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getRRP() {
		return RRP;
	}
	public void setRRP(int rrp) {
		this.RRP = rrp;
	}
	public char getProductType() {
		return productType;
	}
	public void setProductType(char productType) {
		this.productType = productType;
	}
	public String toString() {
        return this.productName;
    }
	

}