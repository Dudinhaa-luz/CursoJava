package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	
	private Date manufactoreDate;
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactoreDate) {
		super(name, price);
		this.manufactoreDate = manufactoreDate;
	}

	public Date getManufactoreDate() {
		return manufactoreDate;
	}

	public void setManufactoreDate(Date manufactoreDate) {
		this.manufactoreDate = manufactoreDate;
	}
	
	@Override
	public String priceTag() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return super.getName() + " (used) $ " + super.getPrice() + " (manufacture date: " + sdf.format(manufactoreDate) + ")";
	}

}
