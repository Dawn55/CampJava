package oopIntro.GameShop.Entities;

import java.util.Date;

public class Campaign {
 private String Name;
 private double Discount;
 private Date exp;
 
  public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public double getDiscount() {
	return Discount;
}
public void setDiscount(double discount) {
	Discount = discount;
}
public Date getExp() {
	return exp;
}
public void setExp(Date exp) {
	this.exp = exp;
}

}
