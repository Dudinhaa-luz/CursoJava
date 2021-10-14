package entities;

public class ProductConstructor {

	public String name;
	public double price;
	public int quantity;
	
	//Constructor, executa na instanciação
	public ProductConstructor(String name, double price, int quantity) {
		//this - aponta para as propriedades do objeto
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name 
			+ ", $ " 
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f", totalValueInStock());
	}
}
