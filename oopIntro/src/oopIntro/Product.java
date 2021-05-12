package oopIntro;

public class Product {
	public Product(int id, String name, String detail, double unitPrice, int unitsInStock, double discount
			) {
		super();
		this.id = id;
		this.name = name;
		this.detail = detail;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
		this.discount = discount;
	}
	
	 private int id;
	 private String name;
	 private String detail;
	 private double unitPrice;
	 private int unitsInStock;
	 private double discount;
	 private double unitPriceAfterDiscount;
	  
	  
  public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getUnitPriceAfterDiscount() {
		return unitPriceAfterDiscount;
	}
	public void setUnitPriceAfterDiscount(double unitPriceAfterDiscount) {
		this.unitPriceAfterDiscount = unitPriceAfterDiscount;
	}
  
}
